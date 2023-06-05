package javaprograme;

public class FindingfirstnonduplicateCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "accommodation";
		char[] ch = s.toCharArray();
		
		
		
		for (int i=0;i<ch.length;i++)
		{
			int count =0;
			
			for(int j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='0';
				}
				
			}
		
		
		if(count==0)
		{
			System.out.println(ch[i]);
			break;
		}
		}
	}

}
