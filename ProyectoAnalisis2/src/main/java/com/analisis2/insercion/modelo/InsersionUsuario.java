/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analisis2.insercion.modelo;

import com.analisis2.clases.modelo.Cuenta;
import com.analisis2.clases.modelo.CuentaJpaController;
import com.analisis2.clases.modelo.Usuario;
import com.analisis2.clases.modelo.UsuarioJpaController;
import static com.analisis2.clases.modelo.tiposusuario.TiiposUsuario.ADMIN;
import com.analisis2.programa.controlador.Cuentas;
import com.analisis2.programa.controlador.UsuarioBasico;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.analisis2.programa.controlador.Usuarios;

/**
 *
 * @author crist
 */
public class InsersionUsuario implements InsercionUsuarios {

    public InsersionUsuario() {
    }
    

    @Override
    public void insertar(Usuarios usuario) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");

        //TypedQuery<Cuenta> queryCuenta = em.createNamedQuery("Cuenta.findByNombre", Cuenta.class);
        //queryCuenta.setParameter("nombre", cuentaf.getNombre());
       // Cuenta c = queryCuenta.getSingleResult();
        Usuario usuario_nuevo = new Usuario();
        usuario_nuevo.setNombredeUsuario(usuario.getNombre());
        usuario_nuevo.setContraseña(usuario.getContra());
        usuario_nuevo.setTipo(usuario.getTipo());
        
       
        UsuarioJpaController cuentaController = new UsuarioJpaController(emf);
        cuentaController.create(usuario_nuevo); 

    }
}
