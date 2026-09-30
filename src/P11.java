import java.util.TreeSet;

public class P11{
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
        
        System.out.println("Removes the last element:"+set.remove(89));
        
        System.out.println("Tree set after removing last element:"+set);
	}

}
