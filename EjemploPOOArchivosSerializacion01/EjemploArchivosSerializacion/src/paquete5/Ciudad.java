/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Jhonder
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String prv) {
        nombre = n;
        provincia = prv;
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
