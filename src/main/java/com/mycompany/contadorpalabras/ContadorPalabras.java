/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorpalabras;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author usuario
 */
public class ContadorPalabras {

    public static void main(String[] args) {
        // Comprobamos si se nos ha pasado algún texto
        if (args.length == 0) {
            System.out.println("Proporciona un texto");
            return;
        }

        // Obtener el texto del primer argumento y convertirlo todo a minúsculas
        String texto = args[0].toLowerCase();
        
        // Dividir el texto en palabras utilizando caracteres no alfabéticos como separadores
        String[] palabras = texto.split("[^a-zA-Z]+");

        // Crear un mapa para almacenar palabras y sus frecuencias
        Map<String, Integer> frecuenciasPalabras = new HashMap<>();

        // Contar la frecuencia de cada palabra
        for (String palabra : palabras) {
            // Ignorar palabras vacías
            if (!palabra.isEmpty()) {
                // Actualizar la frecuencia de la palabra en el mapa
                frecuenciasPalabras.put(palabra, frecuenciasPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Mostrar la cantidad de palabras y sus frecuencias
        System.out.println("Número total de palabras: " + palabras.length);
        System.out.println("Palabras y sus frecuencias:");
        for (Map.Entry<String, Integer> entry : frecuenciasPalabras.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }
    }
}