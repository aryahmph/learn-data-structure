package list;

public class DynamicArray {
    private int[] array;
    private int count;
    private int size;

    public DynamicArray(int size) {
        if (size < 1) throw new IllegalArgumentException();
        this.size = size;
        array = new int[size];
        count = 0;
    }

    public DynamicArray() {
        // Default the length is 10
        size = 10;
        array = new int[size];
        count = 0;
    }

    public void add(int data) {
        if (count == size) growSize();

        array[count] = data;
        count++;
    }

    public void addAt(int data, int index) {
        if (index > count - 1) throw new IllegalArgumentException("index out of bound");
        if (count == size) growSize();

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;
    }

    public void growSize() {
        int[] temp = null;
        if (count == size) {
            temp = new int[size * 2];
            if (size >= 0) System.arraycopy(array, 0, temp, 0, size);
        }
        array = temp;
        size *= 2;
    }

    public int size() {
        return count;
    }

    public int indexAt(int index) {
        return array[index];
    }
}
