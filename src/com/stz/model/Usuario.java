package com.stz.model;

import java.time.LocalDate;

/**
 * com.stz.model
 *
 * @author Sergio Teran on 01-07-2022
 */
public class Usuario implements IAsesoria{

    private String nombre;
    private String fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    /**
     * despliegue el nombre y el RUN
     */
    @Override
    public void analizarUsuario() {

        System.out.println("Nombre Usuario: " + getNombre() + ", RUN: " + getRun());

    }

    /**
     * Retorna un mensaje que diga “El usuario  tiene X años” y en donde X es la edad del usuario en cuestión
     * @return String
     */
    public String mostrarEdad(){
        int edad;
        LocalDate fechaActual= LocalDate.now();
        int obtenerAno = fechaActual.getYear();
        LocalDate fecha = LocalDate.parse(fechaNacimiento);
        int obtenerAno2 = fecha.getYear();
        edad= obtenerAno-obtenerAno2;
        return "El usuario tiene "+edad+ " años";
    }
}
