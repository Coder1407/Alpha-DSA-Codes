import java.util.*;
public class XI_TreeSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Dehradun");
        cities.add("Chennai");
        cities.add("Bengaluru");
        cities.add(null);
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Dehradun");
        lhs.add("Chennai");
        lhs.add("Bengaluru");
        lhs.add(null);
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Dehradun");
        ts.add("Chennai");
        ts.add("Bengaluru");
        // ts.add(null);    // gives exception
        System.out.println(ts);
    }
}
