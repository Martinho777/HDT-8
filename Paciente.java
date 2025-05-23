/**
 * Representa un paciente que llega al hospital.
 * Cada paciente tiene un nombre, sintoma y un nivel de prioridad de atencion.
 */

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char prioridad;

    public Paciente(String nombre, String sintoma, char prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getNombre() {return nombre;}

    public String getSintoma() {return sintoma;}

    public char getPrioridad() {return prioridad;}

    @Override
    public int compareTo(Paciente otro) {
        // Compara  prioridades: A es más urgente que B, etc.
        return Character.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + prioridad;
    }
}
