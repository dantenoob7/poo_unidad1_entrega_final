package uni1a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class ArchivoContenido {

    public static void guardarContenido(ContenidoAudiovisual[] contenidos, String archivo) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            for (ContenidoAudiovisual contenido : contenidos) {

                bw.write(
                        contenido.getId() + "," +
                        contenido.getTitulo() + "," +
                        contenido.getDuracionEnMinutos() + "," +
                        contenido.getGenero());

                bw.newLine();
            }

            System.out.println("Archivo guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar archivo.");
        }
    }
    
    public static void leerContenido(String archivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }
    }
}
