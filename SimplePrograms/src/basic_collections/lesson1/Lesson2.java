package basic_collections.lesson1;

public class Lesson2 {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(1);
        list.add(3);
        list.add(10);
        list.add(5);

        list.removeAt(1);

        // 1
        // 10
        // 5
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
