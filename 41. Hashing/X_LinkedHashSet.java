import java.util.*;

public class X_LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Dehradun");
        cities.add("Chennai");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Dehradun");
        lhs.add("Chennai");
        lhs.add("Bengaluru");
        System.out.println(lhs);
    }
}
