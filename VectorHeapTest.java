import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorHeapTest {

    @Test
    public void testAddAndRemove() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Juan", "fractura", 'C'));
        heap.add(new Paciente("Maria", "apendicitis", 'A'));
        heap.add(new Paciente("Luis", "gripa", 'D'));

        // El primero que debe salir es Maria (prioridad A)
        assertEquals("Maria", heap.remove().getNombre());
        // Luego Juan (C)
        assertEquals("Juan", heap.remove().getNombre());
        // Luego Luis (D)
        assertEquals("Luis", heap.remove().getNombre());
    }

    @Test
    public void testIsEmpty() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        assertTrue(heap.isEmpty());

        heap.add(new Paciente("Ana", "tos", 'E'));
        assertFalse(heap.isEmpty());

        heap.remove();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testPeek() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        heap.add(new Paciente("Carlos", "dolor de cabeza", 'B'));
        heap.add(new Paciente("Beatriz", "fiebre", 'A'));

        // Beatriz debería estar arriba por tener prioridad A
        assertEquals("Beatriz", heap.peek().getNombre());
        // Asegurarse de que peek no elimina
        assertFalse(heap.isEmpty());
    }
}

