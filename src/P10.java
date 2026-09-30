import java.util.TreeSet;

public class P10 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(22);
        set.add(25);
        set.add(36);
        set.add(16);
        set.add(70);
        set.add(82);
        set.add(89);
        set.add(14);

        System.out.println("Tree set data:"+set);
        
        System.out.println("Less than or equal to 86 :"+set.floor(86));
        
        System.out.println("Less than or equal to 29 :"+set.floor(29));

	}

}
