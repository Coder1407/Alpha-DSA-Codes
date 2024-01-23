import java.util.ArrayList;
public class II_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); // add element 9 at index 1

        System.out.println(list);

        // Get Element
        System.out.println(list.get(2)); //index is given

        // Delete Element
        list.remove(2); // index given is removed
        System.out.println(list);
        
        // set
        list.set(2,10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
