import java.util.ArrayList;

public class CounttheVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "The quick brown fox jumps over the lazy dog";
		
		//s = s.toLowerCase();
		
		//System.out.println(s);
		ArrayList<Character> list =new ArrayList<Character>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		
		int count =0;
		char[] ch= s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(list.contains(ch[i]))
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
