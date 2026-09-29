import java.util.TreeSet;

public class P5 {

	public static void main(String[] args) {
		TreeSet<String>set1=new TreeSet<>();
		
		set1.add("black");
		set1.add("green");
		set1.add("pink");	
		set1.add("red");
		set1.add("orange");
		
		System.out.println("Orignal TreeSet :"+set1);
		
		System.out.println("First Element :"+set1.first());
		System.out.println("Last Element :"+set1.last());
	}

}
