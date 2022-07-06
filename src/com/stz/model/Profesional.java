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
public class Profesional extends Usuario{

    private String titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    /**
     * debe desplegar los datos del método del mismo nombre de la clase padre,
     * y el título y fecha de ingreso del profesional
     */
    @Override
    public int analizarUsuario() {

        super.analizarUsuario();
        System.out.println("Título: " + getTitulo() + ", fecha de ingreso: " + getFechaIngreso());
        return getRun();
    }
}
