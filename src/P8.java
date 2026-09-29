
import java.util.TreeSet;

public class P8 {
	public static void main(String[] args) {

	TreeSet<String>set=new TreeSet<>();
	
	set.add("red");
	set.add("green");
	set.add("black");
	set.add("white");
	
	TreeSet<String>set1=new TreeSet<>();
	
	set1.add("red");
	set1.add("pink");
	set1.add("black");
	set1.add("orange");
	
	System.out.println(set);
	
	System.out.println(set1);
	
	for(String color:set){
	if(set1.contains(color))
	{
		System.out.println("yes");
	}else{
		System.out.println("No");
	}
	}

	}

}
