package basic_collections.lesson2;

public class ArrayList<T> implements List<T> {
    private Object[] list;
    private int size;
    private int reservedSize;

    ArrayList() {
        size = 0;
        reservedSize = 2;
        list = new Object[reservedSize];
    }

    @Override
    public void add(T x) {
        if(size >= reservedSize) {
            reservedSize = reservedSize * 2;
            Object[] newArray = new Object[reservedSize];
            System.out.println("NEW ARRAY CREATED! NEW SIZE: " + reservedSize);
            for(int i = 0; i < size; i++) {
                newArray[i] = list[i];
            }
            list = newArray;
        }
        list[size] = x;
        size++;
    }

    @Override
    public T get(int i) {
        return (T) list[i];
    }

    @Override
    public void removeAt(int i) {
        // TODO: Implement
    }

    @Override
    public int size() { return size; }
}
