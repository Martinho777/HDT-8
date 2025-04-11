import java.util.ArrayList;
/**
 * Clase principal que usa VectorHeap para atender pacientes por prioridad.
 */

public class MainVH {
    public static void main(String[] args) {
        VectorHeap<Paciente> cola = new VectorHeap<>();
        ArrayList<Paciente> lista = Lector.leerlistapacientes("pacientes.txt");

        for (Paciente p : lista) {
            cola.add(p);
        }

        System.out.println("Atendiendo pacientes por orden de prioridad y Heap:");
        while (!cola.isEmpty()) {
            System.out.println(cola.remove());
        }
    }
}
