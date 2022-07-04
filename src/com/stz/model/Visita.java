package com.stz.model;

/**
 * com.stz.model
 *
 * @author Sergio Teran on 01-07-2022
 */
public class Visita {   //Visita en terreno

    private int id;
    private int rut;
    private String fechaVisita; //echa del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA
    private String hora;
    private String lugar;
    private String comentarios;

    public Visita() {
    }

    public Visita(int id, int rut, String fechaVisita, String hora, String lugar, String comentarios) {
        this.id = id;
        this.rut = rut;
        this.fechaVisita = fechaVisita;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "id=" + id +
                ", rut=" + rut +
                ", fechaVisita='" + fechaVisita + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
