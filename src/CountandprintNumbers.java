
public class CountandprintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "ID: 1234";
     
     int count = 0;
      
     char[] ch = s.toCharArray();
     
     for(int i=0;i<ch.length;i++)
     {
  if(Character.isDigit(ch[i]))
  {
	  System.out.println(ch[i]);
	  count++;
  }
     }
     
     System.out.println("Total no of no:"+count);
		
	}

}
