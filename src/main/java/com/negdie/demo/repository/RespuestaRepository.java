package com.negdie.demo.repository;

/**
 * @author Diego Cuevas
 **/
import com.negdie.demo.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
