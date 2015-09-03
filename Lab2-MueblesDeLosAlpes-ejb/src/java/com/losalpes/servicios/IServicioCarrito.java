/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.CarritoCompras;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Usuario;
import java.util.List;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public interface IServicioCarrito {
    
    /**
     * Agrega un mueble a un usuario 
     
     * @param mueble
     * @param usuario 
     */
    public void AgregarMueble(Mueble mueble , Usuario usuario);
    
    /**
     * Metodo que retorna un carrito de compras de un usuario
     * @param usuario
     * @return 
     */
    public List<Mueble>  obtenerCarritoUsuario(Usuario usuario);
    
    public List<Mueble> getMuebles();
}
