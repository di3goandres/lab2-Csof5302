/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public class ServicioUsuarioMock implements IServicioUsuario {
//-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los usuarios del sistema
     */
    private ArrayList<Usuario> usuarios;

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     *
     */
    public ServicioUsuarioMock()
    {
        //Inicializa el arreglo que contiene los usuarios
        usuarios=new ArrayList<Usuario>();

        //Agrega usuarios al sistema
        usuarios.add(new Usuario("admin","adminadmin",TipoUsuario.ADMINISTRADOR));
        usuarios.add(new Usuario("client","clientclient",TipoUsuario.CLIENTE));

    }

     @Override
    public void agregarUsuario(Usuario usuario) {
      usuarios.add(usuario);
    }

    /**
     * Devuelve los Usuarios del sistema
     * @return Usuarios Arreglo con todos los usuarios del sistema
     */
    @Override
    public List<Usuario> darUsuarios() {
           return usuarios;
    }

    /**
     * Elimina un Usuario del Sistema
     * @param usuario Usuario a eliminar
     */
    @Override
    public Boolean removerUsuario(Usuario usuario) {
          return usuarios.remove(usuario);
    }
}
