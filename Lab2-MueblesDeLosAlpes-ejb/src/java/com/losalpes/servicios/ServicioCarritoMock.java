/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.CarritoCompras;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
public class ServicioCarritoMock implements IServicioCarrito {

    public ServicioCarritoMock() {
        carrito = new ArrayList<CarritoCompras>();
        muebles = new ArrayList<Mueble>();
    }

    private CarritoCompras carritoUnico;
    private ArrayList<CarritoCompras> carrito;

    private ArrayList<Mueble> muebles;

    @Override
    public void AgregarMueble(Mueble mueble, Usuario usuario) {
        carritoUnico = new CarritoCompras();
        muebles.add(mueble);

        carritoUnico.setUsuario(usuario);
        carritoUnico.setMuebles(muebles);

        //   nuevo.setMuebles(muebles);
        carrito.add(carritoUnico);
    }

    @Override
    public List<Mueble> obtenerCarritoUsuario(Usuario usuario) {
       muebles = new ArrayList<Mueble>();

        for (CarritoCompras carrito1 : carrito) {
           

                muebles.addAll(carrito1.getMuebles());
            

        }
        return muebles;
    }

    @Override
    public List<Mueble> getMuebles() {
        return muebles;
    }

}
