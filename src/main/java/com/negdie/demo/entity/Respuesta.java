package com.negdie.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
/**
 * @author Diego Cuevas
 **/
@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // columna 'respuestas' (texto)
    @Column(name = "respuestas", columnDefinition = "text", nullable = false)
    private String respuestas;

    // columna 'horafecha' (timestamp)
    @Column(name = "horafecha")
    private LocalDateTime horafecha;

    // columna 'comentarios' (texto)
    @Column(name = "comentarios", columnDefinition = "text")
    private String comentarios;

    public Respuesta() {}

    public Respuesta(String respuestas, LocalDateTime horafecha, String comentarios) {
        this.respuestas = respuestas;
        this.horafecha = horafecha;
        this.comentarios = comentarios;
    }

    @PrePersist
    public void prePersist() {
        if (this.horafecha == null) {
            this.horafecha = LocalDateTime.now();
        }
    }

    // getters y setters
    public Long getId() { return id; }
    public String getRespuestas() { return respuestas; }
    public void setRespuestas(String respuestas) { this.respuestas = respuestas; }
    public LocalDateTime getHorafecha() { return horafecha; }
    public void setHorafecha(LocalDateTime horafecha) { this.horafecha = horafecha; }
    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
}
