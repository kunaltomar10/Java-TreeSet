import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		TreeSet<String>set1=new TreeSet<>();
		
		set1.add("green");
		set1.add("orange");
		set1.add("red");
		
        TreeSet<String>set2=new TreeSet<>();
		
		set2.add("black");
		set2.add("pink");
		set2.add("white");
		
		System.out.println("Set1"+set1);
		
		System.out.println("Set2"+set2);
		
		set1.addAll(set2);
		
		System.out.println("Set1"+set1);
	}

}
