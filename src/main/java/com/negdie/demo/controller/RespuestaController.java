package com.negdie.demo.controller;

import com.negdie.demo.dto.RespuestaRequest;
import com.negdie.demo.entity.Respuesta;
import com.negdie.demo.repository.RespuestaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 * @author Diego Cuevas
 **/
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RespuestaController {

    private final RespuestaRepository repo;

    public RespuestaController(RespuestaRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/respuestas")
    public ResponseEntity<Respuesta> crearRespuesta(@RequestBody RespuestaRequest req) {
        if (req.getRespuestas() == null || req.getRespuestas().trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        Respuesta r = new Respuesta();
        r.setRespuestas(req.getRespuestas().trim());
        r.setComentarios(req.getComentarios());

        Respuesta saved = repo.save(r);
        return ResponseEntity.status(201).body(saved);
    }
}

