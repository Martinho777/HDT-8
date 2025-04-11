import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase para leer pacientes desde un archivo de texto.
 */

public class Lector {

    public static ArrayList<Paciente> leerlistapacientes(String pacientes) {
        ArrayList<Paciente> listapacientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pacientes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String sintoma = partes[1].trim();
                    char prioridad = partes[2].trim().charAt(0);
                    listapacientes.add(new Paciente(nombre, sintoma, prioridad));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listapacientes;
    }
}
