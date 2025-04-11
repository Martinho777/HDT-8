import java.util.PriorityQueue;
import java.util.ArrayList;

/**
 * Clase principal que usa PriorityQueue de Java para atender pacientes por prioridad.
 */

public class MainJQ {
    public static void main(String[] args) {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();
        ArrayList<Paciente> pacientes = Lector.leerlistapacientes("pacientes.txt");

        for (Paciente p : pacientes) {
            cola.add(p);
        }

        System.out.println("Atendiendo pacientes con PriorityQueue de Java:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll()); // poll = remove + return
        }
    }
}
