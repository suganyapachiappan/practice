import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		
		set.add("Kumar");
		set.add("Anu");
		set.add("Balu");
		set.add("Sudha");
		set.add("Chelli");
		
		ArrayList<String> arr = new ArrayList<String>(set);
		Collections.sort(arr);
		Collections.reverse(arr);
		
		for(String i : arr)
		{
			System.out.println(i); 
		}
		
		
	}

}
