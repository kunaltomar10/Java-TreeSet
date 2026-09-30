import java.util.TreeSet;

public class P12{
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
        
        boolean removed = set.remove(70);
        
        System.out.println("Removes 70 from the list:"+removed);
        
        System.out.println("Tree set after removing last element:"+set);
    }
}
    
