/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Ciuadad;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "profesores.data";
        
        Ciuadad profesor1 = new Ciuadad("Tara Hernandez", "contratado");
        Ciuadad profesor2 = new Ciuadad("Gregory Walsh", "nombramiento");
        Ciuadad profesor3 = new Ciuadad("Kevin Page", "nombramiento");

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroProfesor(profesor1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroProfesor(profesor2);
        archivo.establecerSalida();
        archivo.establecerRegistroProfesor(profesor3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerProfesores();
        System.out.println(lectura);
    }
}
