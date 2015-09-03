/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Session;
import com.losalpes.bos.Usuario;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public class ServicioSessionMock implements IServicioSession{

    @Override
    public Usuario darUsuario() {
        Session a = new Session();
        return a.getUserSession();
        
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
         Session a = new Session();
         a.setUserSession(usuario);
    }
    
}
