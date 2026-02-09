package com.negdie.demo.dto;

/**
 * @author Diego Cuevas
 **/
public class RespuestaRequest {
    private String respuestas;
    private String comentarios;

    public RespuestaRequest() {}

    public String getRespuestas() { return respuestas; }
    public void setRespuestas(String respuestas) { this.respuestas = respuestas; }

    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
}
