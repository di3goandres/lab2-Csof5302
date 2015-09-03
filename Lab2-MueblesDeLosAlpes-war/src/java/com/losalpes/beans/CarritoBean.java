/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.CarritoCompras;
import com.losalpes.bos.Departamentos;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Paises;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.TipoPersona;
import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.TiposDocumentos;
import com.losalpes.bos.Usuario;
import com.losalpes.servicios.IServicioCarrito;
import com.losalpes.servicios.IServicioSession;
import com.losalpes.servicios.ServicioCarritoMock;
import com.losalpes.servicios.ServicioSessionMock;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Diego Andres Montealegre Garcia
 */
@ManagedBean
@SessionScoped
public class CarritoBean {

    private CarritoCompras carrito;

    private List<Mueble> muebles;

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Mueble mueble;

    /**
     * 
     * @return muebles
     */
    public List<Mueble> getMuebles() {
        Usuario u = new Usuario("admin", "adminadmin", TipoUsuario.ADMINISTRADOR, Paises.COLOMBIA,
                Departamentos.AMAZONAS, "1077845378", TiposDocumentos.NIT, "admin",
                "5555", "3186937253", "Av siempre viva", "Administrador del sistema", "admin@admin.com.co",
                TipoPersona.JURIDICA);
        muebles = new ArrayList<Mueble>();
        muebles.addAll(catalogoCarritos.obtenerCarritoUsuario(u));
        return muebles;
    }

    public void setMuebles(List<Mueble> muebles) {
        this.muebles = muebles;
    }

    public CarritoCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoCompras carrito) {
        this.carrito = carrito;
    }

    private IServicioCarrito catalogoCarritos;

    /**
     * Realacion con la interfaz adecuada para la session del usuario
     */
    private IServicioSession servicioSession;

    /**
     * Creates a new instance of CarritoBean
     */
    public CarritoBean() {
        carrito = new CarritoCompras();
        catalogoCarritos = new ServicioCarritoMock();
        servicioSession = new ServicioSessionMock();
    }

    public void AgregarCarrito(Mueble m) {
//          FacesMessage msg = new FacesMessage("Usuario Registrado correctamente.", "");
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        System.out.println("ingrese agregar");
//        Usuario u = null;
//      
//       
//        LoginBean a = new LoginBean();
//        u = a.getSesionUsuario();
//     
//        System.out.println("ingrese asdfa");
//        catalogoCarritos.AgregarMueble(m,u);
        System.out.println("ingrese agregar");
        Usuario u = new Usuario("admin", "adminadmin", TipoUsuario.ADMINISTRADOR, Paises.COLOMBIA,
                Departamentos.AMAZONAS, "1077845378", TiposDocumentos.NIT, "admin",
                "5555", "3186937253", "Av siempre viva", "Administrador del sistema", "admin@admin.com.co",
                TipoPersona.JURIDICA);
        Mueble sda = new Mueble("Coco", "Sndres", "Descriocion", TipoMueble.Exterior);
        catalogoCarritos.AgregarMueble(m, u);

        FacesMessage msg = new FacesMessage("Muelbe Registrado correctamente.", "");
        FacesContext.getCurrentInstance().addMessage("Registrado", msg);

    }

    /**
     * Devuelve el objeto mueble
     *
     * @return mueble Objeto mueble
     */
    public Mueble getMueble() {
        return mueble;
    }

    /**
     * Modifica el objeto mueble
     *
     * @param mueble Nuevo mueble
     */
    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }
}
