import java.util.TreeSet;
public class P2 {

	public static void main(String[] args) {
		
		TreeSet<String>set=new TreeSet<>();
		
		set.add("black");
		set.add("green");
		set.add("orange");
		set.add("red");
		set.add("white");
		
		System.out.println("TreeSet :"+set);
		
		for(String color:set)
		{
			System.out.println(color);
		}


	}

}
