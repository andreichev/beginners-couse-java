package basic_collections.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        list.removeAt(1);

        // One
        // Three
        // Four
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
