/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

public class Hospital implements Serializable{
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Ciudad ciudad;

    public Hospital(String n, int nC, double p, Ciudad c){
        nombre = n;
        numeroCamas = nC;
        presupuesto = p;
        ciudad = c;
    }
    
    
    public void establecerNombre(String x) {
        nombre = x;
    }

   
    public void establecerNumeroCamas(int x) {
        numeroCamas = x;
    }

    public void establecerPresupuesto(double x) {
        presupuesto = x;
    }

  
    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }
    
    
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }


    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
}