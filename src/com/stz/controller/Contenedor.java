package com.stz.controller;

import com.stz.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * com.stz.controller
 *
 * @author Sergio Teran, Fabiola Díaz on 05-07-2022
 */
public class Contenedor {

    List<IAsesoria> asesorias;
    List<Capacitacion> capacitaciones;

    String clase;

    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    /**
     * permite agregar un nuevo cliente a la lista de instancias dela interface Asesoria
     */
    public void almacenarCliente(String nombreUser, String fechaNac, int rut, String nombre, String apellido,
                                 String telefono, String afp, int sistSalud, String direccion, String comuna,
                                 int edad){

        asesorias.add(new Cliente(nombreUser, fechaNac, rut, rut, nombre, apellido, telefono, afp, sistSalud,
                direccion, comuna, edad));

    }

    /**
     * permite agregar un nuevo profesional a la lista de instancias de la interface Asesoria
     */
    public void almacenarProfesional(String nombreUser, int run, String fechaNac, String titulo, String fechaIng){

        asesorias.add(new Profesional(nombreUser, fechaNac, run, titulo, fechaIng));

    }

    /**
     * permite agregar un nuevo administrativo a la lista de instancias de la interface Asesoria
     */
    public void almacenarAdministrativo(String nombreUser, String fecha, int run, String area, String exPre){

        asesorias.add(new Administrativo(nombreUser, fecha, run, area, exPre));

    }

    /**
     * permite agregar una nueva capacitación a la lista de instancias de la clase Capacitación
     */
    public void almacenarCapacitacion(int id, int rut, String dia, String hora, String lugar, String duracion, int nAsistente){
        capacitaciones.add(new Capacitacion(id,rut,dia, hora, lugar, duracion, nAsistente));
    }

    /**
     * permite eliminar un usuario desde la lista de interfaces de Asesoría acuerdo con el RUN del usuario
     */
    public void eliminarUsuario(int rut){

        int i =0;
        boolean encontrado=false;
        do{
            if(asesorias.get(i).analizarUsuario()==rut){
                asesorias.remove(i);
                encontrado=true;
                System.out.println("Usuario eliminado con exito!\n\n");
            }
            i++;
        }while (encontrado==false);

    }

    /**
     * permite desplegar la lista completa de usuarios, independiente del tipo. En este método solo se deben
     * desplegar los datos de la clase usuario
     */
    public void listarUsuarios(){

        for (IAsesoria ia: asesorias) {

            ia.analizarUsuario();

        }

    }

    /**
     * recibe un tipo de usuario (cliente, administrador o profesional), y retorna los datos respectivos según
     * el tipo de usuario
     */
    public void listarUsuariosPorTipo(String opcion){

        for (IAsesoria lista: asesorias) {
            clase = lista.getClass().getName();
            if (clase.contains(opcion)){
                lista.analizarUsuario();
            }
        }
    }

    /**
     * este método despliega las capacitaciones registradas en la lista respectiva, junto con los datos del
     * cliente al que está asociada dicha capacitación
     */
    public void listarCapacitaciones(){
        for (Capacitacion cap: capacitaciones) {

            cap.mostrarDetalle();

        }
    }
}
