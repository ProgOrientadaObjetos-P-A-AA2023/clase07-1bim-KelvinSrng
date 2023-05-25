package paquete5;

import paquete5.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<Hospital> hospital;
    private String nombreArchivo;


    public LecturaArchivoSecuencial(String n) {
        nombreArchivo = n;
        File file = new File(obtenerNombreArchivo());
        if (file.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerHospital() {
        // 
        hospital = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Hospital registro = (Hospital) entrada.readObject();
                    hospital.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    
    public ArrayList<Hospital> obtenerHospital() {
        
        return hospital;
        
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales\n";
        for (int i = 0; i < obtenerHospital().size(); i++) {
            Hospital h = obtenerHospital().get(i);
            
            cadena = String.format("%s \n"
                    + "Nombre: %s\n"
                    + "Numero de Camas: %d\n"
                    + "Presupuesto: %.2f\n"
                    + "Ciudad: %s\n"
                    + "Provincia: %s\n", 
                    cadena,
                    
                    h.obtenerNombre(),
                    h.obtenerNumeroCamas(),
                    h.obtenerPresupuesto(),
                    h.obtenerCiudad().obtenerNombre(),
                    h.obtenerCiudad().obtenerProvincia());
        }

        return cadena;
        
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo

}
