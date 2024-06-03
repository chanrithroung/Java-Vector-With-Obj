package Collection;
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String []args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Before add, size: " + list.size());

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("before add, size: " + list.size());

        System.out.println("Each element: " + list);

        // adding data by index.
        list.add(0, "Coconut");
        System.out.println("Before adding element using index : " + list);
    }
}
