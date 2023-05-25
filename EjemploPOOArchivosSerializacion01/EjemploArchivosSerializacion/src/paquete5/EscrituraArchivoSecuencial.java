    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete2.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete1.Ciuadad;

/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Ciuadad ciudad;
    private ArrayList<Ciuadad> hospital;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerHospital(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerHospital().size() > 0) {
                for (int i = 0; i < obtenerHospital().size(); i++) {
                    establecerCiudad(obtenerHospital().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerCiudad(Ciuadad p) {
        ciudad = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(ciudad); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerHospital() {
        LecturaArchivoSecuencial l = 
                new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerProfesores();
        hospital = l.obtenerHospital();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Ciuadad> obtenerHospital() {
        return hospital;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 

}
