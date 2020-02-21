/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analisis2.programa.controlador;

/**
 *
 * @author crist
 */
public class UsuarioBasico implements Usuarios{
    private String Nombre; 
    private String Contrasena; 
    private int Tipo; 
    public UsuarioBasico() {
    }

    @Override
    public String getNombre() {
        return this.Nombre;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContra() {
        return this.Contrasena; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTipo() {
        return this.Tipo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipo(int tipo) {
        this.Tipo = tipo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        this.Nombre = nombre; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContra(String contrasena) {
        this.Contrasena = contrasena;  //To change body of generated methods, choose Tools | Templates.
    }
    
}
