/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.bos.Departamentos;
import com.losalpes.bos.Mueble;
import com.losalpes.bos.Paises;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.TipoPersona;
import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.TiposDocumentos;
import com.losalpes.bos.Usuario;
import com.losalpes.servicios.IServicioCarrito;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.IServicioSession;
import com.losalpes.servicios.ServicioCarritoMock;
import com.losalpes.servicios.ServicioCatalogoMock;
import com.losalpes.servicios.ServicioSessionMock;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado del catálogo de muebles en el sistema
 * 
 */
@ManagedBean
@SessionScoped
public class CatalogoBean
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Mueble mueble;

    
     private List<Mueble> muebles;
    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioCatalogo catalogo;

     private IServicioSession servicioSession;
     
     private IServicioCarrito catalogoCarritos;
    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public CatalogoBean()
    {
        mueble=new Mueble();
        catalogo=new ServicioCatalogoMock();
        servicioSession = new ServicioSessionMock();
        catalogoCarritos = new ServicioCarritoMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve el objeto mueble
     * @return mueble Objeto mueble
     */
    public Mueble getMueble()
    {
        return mueble;
    }

    /**
     * Modifica el objeto mueble
     * @param mueble Nuevo mueble
     */
    public void setMueble(Mueble mueble)
    {
        this.mueble = mueble;
    }

    /**
     * Devuelve una lista con todos los muebles del sistema
     * @return muebles Muebles del sistema
     */
    public List<Mueble> getMuebles()
    {

        return catalogo.darMuebles();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarMueble()
    {
        catalogo.agregarMueble(mueble);
        mueble=new Mueble();
    }

    /**
     * Elimina la información del mueble
     */
    public void limpiar()
    {
        mueble=new Mueble();
        
    }
    
    
    public void Eliminar(Mueble m)
    {
        System.out.println("asdf");
       catalogo.removerMueble(m);
       
    }
    
    

    /**
     * Devuelve los tipos de muebles
     * @return sitems Tipos de muebles en el sistema
     */
    public SelectItem[] getTiposMuebles()
    {
        TipoMueble[] tipos=  TipoMueble.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    
     public void AgregarCarrito(Mueble m) {
       
        System.out.println("ingrese agregar");
        Usuario u = new Usuario("admin", "adminadmin", TipoUsuario.ADMINISTRADOR, Paises.COLOMBIA,
                Departamentos.AMAZONAS, "1077845378", TiposDocumentos.NIT, "admin",
                "5555", "3186937253", "Av siempre viva", "Administrador del sistema", "admin@admin.com.co",
                TipoPersona.JURIDICA);
        Mueble sda = new Mueble("Coco","Sndres", "Descriocion",TipoMueble.Exterior);
        catalogoCarritos.AgregarMueble(m, u);
        
          FacesMessage msg = new FacesMessage("Muelbe Registrado correctamente.", "");
        FacesContext.getCurrentInstance().addMessage("Registrado", msg);

    }
}
