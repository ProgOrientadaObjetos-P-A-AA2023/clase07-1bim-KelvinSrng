package paquete5;


public class Ejecutor {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "Ciudad.data";
        
        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Zamora", "Zamora Chinchipe");
        Ciudad c3 = new Ciudad("Cuenca", "Azuay");
        Ciudad c4 = new Ciudad("Guayaquil", "Guayas");
        Ciudad c5 = new Ciudad("Quito", "Pichincha");

        Hospital h1 = new Hospital("Isidro Ayora", 100, 20000.75, c1);
        Hospital h2 = new Hospital("San Agustin", 150, 20500.86, c2);
        Hospital h3 = new Hospital("San Paulo", 200, 35000.45, c3);
        Hospital h4 = new Hospital("Natali", 248, 15000.20,c4);
        Hospital h5 = new Hospital("Santa Isabel", 158, 19000.50, c5);
    
        paquete5.EscrituraArchivoSecuencial archivo = 
                new paquete5.EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerHospital(h1);
        archivo.establecerSalida();
        archivo.establecerHospital(h2);
        archivo.establecerSalida();
        archivo.establecerHospital(h3);
        archivo.establecerSalida();
        archivo.establecerHospital(h4);
        archivo.establecerSalida();
        archivo.establecerHospital(h5);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        paquete5.LecturaArchivoSecuencial lectura = 
                new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        
        System.out.println(lectura);
    }
}
