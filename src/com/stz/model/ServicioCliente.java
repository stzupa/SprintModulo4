package com.stz.model;

import java.util.ArrayList;
import java.util.List;

/**
 * com.stz.model
 *
 * @author Sergio Teran on 05-07-2022
 */
public class ServicioCliente {

    List<ICliente> listaClientes = new ArrayList<>();

    public void agregar(ICliente l){
        listaClientes.add(l);
    }

    public void listarTipo(){
        for (ICliente cl: listaClientes) {
            cl.listarTipo();
        }
    }
}
