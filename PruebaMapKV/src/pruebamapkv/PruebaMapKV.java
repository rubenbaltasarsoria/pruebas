/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamapkv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rubenbaltasar
 */
public class PruebaMapKV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear el mapa
        Map<String, String> aeropuertos = new HashMap<>();

        // Añadir datos
        aeropuertos.put("BIO", "Bilbao");
        aeropuertos.put("LHR", "Londres");
        aeropuertos.put("CDG", "París");
        aeropuertos.put("MAD", "Madrid");
        aeropuertos.put("BCN", "Barcelona");

        // Mostrar un elemento accediendo por KEY
        System.out.println("Uno: ");
        System.out.println("  " + aeropuertos.get("LHR"));

        //Mostrar la coleccion
        System.out.println(aeropuertos.values());

        // Crear una lista para recorrer la coleccion
        List<String> lista = new ArrayList<>(aeropuertos.values());

        System.out.println("Lista: ");
        for (String nombre : lista) {
            System.out.println("  " + nombre);
        }

    }

}
