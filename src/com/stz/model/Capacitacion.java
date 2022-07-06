package com.stz.model;

/**
 * com.stz.model
 * @version 1.0
 * @author Sergio Teran
 * @author Damián Martínez
 * @author Fabiola Diaz
 * @author Fabian Cornejo
 * @author German Espinoza  on 05-07-2022
 */
public class Capacitacion {

    private int id;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int nAsistente;

    public Capacitacion() {
    }

    public Capacitacion(int id, int rut, String dia, String hora, String lugar, String duracion, int nAsistente) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.nAsistente = nAsistente;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getnAsistente() {
        return nAsistente;
    }

    public void setnAsistente(int nAsistente) {
        this.nAsistente = nAsistente;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rut=" + rut +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", nAsistente=" + nAsistente +
                '}';
    }

    /**
     * retorna un mensaje con el texto “La capacitación será en A a las B del día C, y durará D minutos”,
     * en donde A es el lugar, B es la hora, C es el día y D son los minutos
     * @return String
     */
    public void mostrarDetalle(){

        System.out.println("La capacitación será en "+lugar+" a las "+hora+" del día "+ dia+", y dura "+duracion+" minutos");
    }
}
