/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioSeguridad.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Departamentos;
import com.losalpes.bos.Paises;
import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.Usuario;
import com.losalpes.excepciones.AutenticacionException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de la autenticación de un usuario en el sistema
 * 
 */
public class ServicioSeguridadMock implements IServicioSeguridad
{

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
    public ServicioSeguridadMock()
    {
        //Inicializa el arreglo que contiene los usuarios
        usuarios=new ArrayList<Usuario>();

        //Agrega usuarios al sistema
        usuarios.add(new Usuario("admin","adminadmin",TipoUsuario.ADMINISTRADOR, Paises.COLOMBIA, Departamentos.AMAZONAS, "1077845378"));
        usuarios.add(new Usuario("client","clientclient",TipoUsuario.CLIENTE, Paises.COLOMBIA, Departamentos.HUILA, "1077845379"));

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Registra el ingreso de un usuario al sistema.
     * @param nombre Login del usuario que quiere ingresar al sistema.
     * @param contraseña Contraseña del usuario que quiere ingresar al sistema.
     * @return usuario Retorna el objeto que contiene la información del usuario que ingreso al sistema.
     */
    @Override
    public Usuario login(String nombre, String contraseña) throws AutenticacionException
    {
        Usuario u=null;

        boolean termino=false;

        for (int i = 0; i < usuarios.size() && !termino; i++)
        {
            u=usuarios.get(i);

            if(u.getNombre().equals(nombre)&& u.getContraseña().equals(contraseña))
            {
               termino=true;
            }
            else if(i==usuarios.size()-1)
            {
                throw new AutenticacionException("Usuario Inválido");
            }
        }

        return u;
    }

    /**
     * Agrega un nuevo usuario al sistema
     * @param usuario nuevo Usuario del sistema
     */
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
