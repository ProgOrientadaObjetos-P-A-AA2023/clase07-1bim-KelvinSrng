package paquete5;

import java.util.ArrayList;


public class Ejecutor {
    
    String nombreArchivo = "Ciudad.data";
    
    ArrayList<Ciudad> hs = new ArrayList();
    
    Ciudad c1 = new Ciudad("Loja", "Loja");
    Ciudad c2 = new Ciudad("Zamora", "Zamora Chinchipe");
    Ciudad c3 = new Ciudad("Cuenca", "Azuay");
    Ciudad c4 = new Ciudad("Guayaquil", "Guayas");
    Ciudad c5 = new Ciudad("Quito", "Pichincha");

    Hospital h1 = new Hospital("Isidro Ayora", 100, 20000, c1);
    Hospital h2 = new Hospital("San Agustin", 150, 20500, c2);
    Hospital h3 = new Hospital("San Paulo", 200, 35000, c3);
    Hospital h4 = new Hospital("Natali", 248, 15000,c4);
    Hospital h5 = new Hospital("Santa Isabel", 158, 19000, c5);
    
    
    
}
