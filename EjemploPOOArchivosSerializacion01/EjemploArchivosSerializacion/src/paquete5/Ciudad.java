/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author Jhonder
 */
public class Ciudad implements Serializable{
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String prov) {
        nombre = n;
        provincia = prov;
    }
    

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    
    public void establecerNombre(String x) {
        nombre = x;
    }


    public void establecerProvincia(String x) {
        provincia = x;
    }
    
    
}
