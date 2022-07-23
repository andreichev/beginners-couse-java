package basic_collections.lesson2;

public interface List<T> {
    void add(T x);
    T get(int i);
    void removeAt(int i);
    int size();
}
