package basic_collections.lesson1;

public class ArrayList implements List{
    private int[] list;
    private int size;
    private int reservedSize;

    ArrayList() {
        size = 0;
        reservedSize = 2;
        list = new int[reservedSize];
    }

    @Override
    public void add(int x) {
        if(size >= reservedSize) {
            reservedSize = reservedSize * 2;
            int[] newArray = new int[reservedSize];
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
    public int get(int i) {
        return list[i];
    }

    @Override
    public void removeAt(int i) {
        // TODO: Implement
    }

    @Override
    public int size() { return size; }
}
