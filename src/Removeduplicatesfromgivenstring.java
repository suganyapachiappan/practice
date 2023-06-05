import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicatesfromgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "India Malaysia India London Thailand London" ;
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for(String org : set)
		{
			System.out.println(org);
		}
		
	}

}
