import java.util.ArrayList;

public class IX_MuliDim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);

        // getting back original lists
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            // System.out.println(currlist);
            for(int j=0; j<currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

        // creating new lists according to question
        System.out.println();
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        ArrayList<Integer> newlist1 = new ArrayList<>();
        ArrayList<Integer> newlist2 = new ArrayList<>();
        ArrayList<Integer> newlist3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            newlist1.add(i*1); // 1 2 3 4 5
            newlist2.add(i*2); // 2 4 6 8 10
            newlist3.add(i*3); // 3 6 9 12 15
        }

        newList.add(newlist1);
        newList.add(newlist2);
        newList.add(newlist3);
        System.out.println(newList);

        // traversing
        for(int i=0; i<newList.size(); i++) {
            ArrayList<Integer> currlist = newList.get(i);
            // System.out.println(currlist);
            for(int j=0; j<currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
