
public class Palindrome {
	
	public static void main(String[] args) {
		String s ="ACT";
		String rev = "";
		
		System.out.println("String value before reverse"+ " "+ s);
		
		char[] ch = s.toCharArray();
		
		/*for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev+ch[i];
			//System.out.println(rev);
		}*/
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
			
		}
		
		System.out.println("String value after reverse"+" " + rev);
		
		if(s.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
		
	}

}
