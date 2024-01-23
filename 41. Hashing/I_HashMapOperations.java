import java.util.*;
public class I_HashMapOperations {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get
        int population = hm.get("India");
        System.out.println(population); //100

        System.out.println(hm.get("Indonesia")); //null

        //ContainsKey
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false

        //Remove
        System.out.println(hm.remove("China")); //150
        System.out.println(hm);

        System.out.println(hm.remove("Indonesia")); //null
        System.out.println(hm); //same hm

        //Size
        System.out.println(hm.size()); //2

        //Is Empty
        System.out.println(hm.isEmpty()); //false

        //Clear
        hm.clear();
        System.out.println(hm.isEmpty()); //true
        System.out.println(hm); //{}
    }
}