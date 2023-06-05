
public class CountingSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "She is a singer & dancer as well.";
		
		int count =0;
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				if(!Character.isDigit(s.charAt(i)))
				{
					if(!Character.isWhitespace(s.charAt(i)))
					{
						count++;
					}
					
				}
				
			}
		}
		
		System.out.println("count"+count);  
		
		/*for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A'&& s.charAt(i)<='Z'))
			{
				if(!(s.charAt(i)>='0'&& s.charAt(i)<=9))
				{
					if(!(s.charAt(i)==' '))
					{
						System.out.println(s.charAt(i));
					}
				
				
			}
		}
		*/
		
		
		
	}

}
