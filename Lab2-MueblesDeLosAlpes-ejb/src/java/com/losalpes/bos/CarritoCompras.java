/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.util.List;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public class CarritoCompras {
    
    /**
     * usuario el cual tiene compras
     */
    private Usuario usuario;

    /**
     * obtiene el usuario
     * @return usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Metodo el cual modifica el usuario
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Lista de muebles que ha ingresado al carrito de compras.
     * @return Lista de muebles
     */
    public List<Mueble> getMuebles() {
        return muebles;
    }

    /**
     * Metodo que modifica los muebles del carrito
     * @param muebles 
     */
    public void setMuebles(List<Mueble> muebles) {
        this.muebles = muebles;
    }
    
    /**
     * Lista de muebles de usuario que ha ingresado al carrito
     */
    private List<Mueble> muebles;
}
