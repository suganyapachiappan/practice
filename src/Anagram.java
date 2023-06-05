import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
		String s1 = "Dusty";
		String s2 = "Study";
		 s1 = s1.toLowerCase();
		 s2 = s2.toLowerCase();
		 
		 if(s1.length()!=s2.length())
		 {
			 System.out.println("Both the Strings are not anagram");
		 }
		 
		 else {
			 
			 char[] ch1 = s1.toCharArray();
			 char[] ch2 = s1.toCharArray();
			 
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 if(Arrays.equals(ch1, ch2)==true)
			 {
				 System.out.println("Both the Strings are Anagram");
			 }
			 else
			 {
				 System.out.println("Both the Strings are not Anagram");
			 }
		 }
	}

}
