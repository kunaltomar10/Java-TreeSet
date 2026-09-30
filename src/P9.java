import java.util.TreeSet;

public class P9 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(6);

        System.out.println("Tree set data:");

        for (Integer num : set.headSet(7)) {
            System.out.println(num);
        }
       
    }
}

