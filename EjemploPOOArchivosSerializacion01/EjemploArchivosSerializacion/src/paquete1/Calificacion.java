/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;

public class Calificacion implements Serializable {

    private double nota;
    private String nombreMateria;
    private Ciuadad profesor;

    public Calificacion(double n, String nombre) {
        nota = n;
        nombreMateria = nombre;
        
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }
    
    public void establecerProfesor(Ciuadad n) {
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }
    
    public Ciuadad obtenerProfesor() {
        return profesor;
    }

}
