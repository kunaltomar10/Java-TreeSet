import java.util.TreeSet;

public class P6 {

	public static void main(String[] args) {
		TreeSet<String>set1=new TreeSet<>();
		
		set1.add("black");
		set1.add("green");
		set1.add("pink");	
		set1.add("red");
		set1.add("orange");
		
		System.out.println("Orignal TreeSet :"+set1);
		
		System.out.println("Cloned tree list: "+set1.clone());
	}

}
