import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ocurranceofeachchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "APPLE";
		
		ArrayList<Character>   ch  = new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(!Character.isWhitespace(c))
			{
				ch.add(c);
			}
		}
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int j=0; j<ch.size();j++)
			
			//It counts the frequency of the specified element in the given list.
			//ch - Listname , ch.get(j) - specific element need to count
		{
			map.put(ch.get(j),Collections.frequency(ch, ch.get(j)) );
		}
		
		System.out.println(map);
		
		}

}
