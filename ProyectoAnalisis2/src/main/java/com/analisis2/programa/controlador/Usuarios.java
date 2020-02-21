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
public interface Usuarios {
    public String getNombre(); 
    public String getContra(); 
    public int getTipo();
    public void setTipo(int tipo);
    public void setNombre(String nombre); 
    public void setContra (String contrasena);
}
