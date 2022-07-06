package com.stz.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * com.stz.model
 * @version 1.0
 * @author Sergio Teran
 * @author Damián Martínez
 * @author Fabiola Diaz
 * @author Fabian Cornejo
 * @author German Espinoza  on 05-07-2022
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
    public int analizarUsuario() {

        System.out.println("Nombre Usuario: " + getNombre() + ", run: " + getRun());
        return run;
    }

    /**
     * Retorna un mensaje que diga “El usuario  tiene X años” y en donde X es la edad del usuario en cuestión
     * @return String
     */
    public String mostrarEdad(){

        int dia = Integer.parseInt(fechaNacimiento.substring(0, 1));
        int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));
        int agno = Integer.parseInt(fechaNacimiento.substring(6, 10));

        LocalDate fn = LocalDate.of(agno, mes, dia);
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fn, hoy);

        return "El usuario tiene "+ periodo.getYears()  +" años";
    }
}
