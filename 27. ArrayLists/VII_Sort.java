import java.util.ArrayList;
import java.util.Collections; // to be imported

public class VII_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        // Use Collections class not Collection Interface
        Collections.sort(list); // ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        //Comparator - function that defines logic of sorting order
        System.out.println(list);
    }
}
