package com.stz.model;

/**
 * com.stz.model
 * @version 1.0
 * @author Sergio Teran, Fabiola Díaz on 05-07-2022
 */
public class Revision {

    private int idRevision;
    private int idVisita;
    private String nombre;      //Nombre alusivo a la revisión
    private String detalle;     //Detalle para revisar
    private int estado;         //1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se pueden ingresar los valores antes indicados.

    public Revision() {
    }

    public Revision(int idRevision, int idVisita, String nombre, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisita=" + idVisita +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
