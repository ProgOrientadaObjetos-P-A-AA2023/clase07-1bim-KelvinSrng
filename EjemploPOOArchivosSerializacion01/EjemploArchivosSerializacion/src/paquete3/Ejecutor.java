/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Calificacion;
import paquete1.Ciuadad;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "calificaciones.data";

        Calificacion c1 = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Lógica");
        Calificacion c3 = new Calificacion(8, "Literatura");

        Ciuadad profesor1 = new Ciuadad("Tara Hernandez", "contratado");
        Ciuadad profesor2 = new Ciuadad("Gregory Walsh", "nombramiento");
        Ciuadad profesor3 = new Ciuadad("Kevin Page", "nombramiento");

        c1.establecerProfesor(profesor1);
        c2.establecerProfesor(profesor2);
        c3.establecerProfesor(profesor3);

        Calificacion[] lista = {c1, c2, c3};

        EscrituraArchivoSecuencial archivo = new
         EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
