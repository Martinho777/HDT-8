import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {
    protected ArrayList<E> data;

    public VectorHeap() {
        data = new ArrayList<>();
    }

    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    public E remove() {
        if (data.isEmpty()) return null;

        E minVal = data.get(0);
        E last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            percolateDown(0);
        }
        return minVal;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public E peek() {
        return data.isEmpty() ? null : data.get(0);
    }

    private void percolateUp(int index) {
        E value = data.get(index);
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (value.compareTo(data.get(parent)) >= 0) break;
            data.set(index, data.get(parent));
            index = parent;
        }
        data.set(index, value);
    }

    private void percolateDown(int index) {
        E value = data.get(index);
        int size = data.size();
        while (index * 2 + 1 < size) {
            int left = index * 2 + 1;
            int right = left + 1;
            int child = left;

            if (right < size && data.get(right).compareTo(data.get(left)) < 0) {
                child = right;
            }

            if (data.get(child).compareTo(value) >= 0) break;

            data.set(index, data.get(child));
            index = child;
        }
        data.set(index, value);
    }
}
