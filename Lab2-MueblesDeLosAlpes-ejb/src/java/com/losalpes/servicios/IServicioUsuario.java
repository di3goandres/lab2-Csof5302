/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Usuario;
import java.util.List;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public interface IServicioUsuario {
       /**
     * Agrega un Usuario al sistema
     *
     * @param usuario Nuevo Usuario
     */
    public void agregarUsuario(Usuario usuario);

    /**
     * Devuelve todos los Usuario del sistema
     *
     * @return Usuario Lista de Usuario
     */
    public List<Usuario> darUsuarios();

    /**
     * Elimina un Usuario del sistema
     *
     */
    public Boolean removerUsuario(Usuario mueble);
}
