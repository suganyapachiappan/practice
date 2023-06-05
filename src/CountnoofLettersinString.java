import javax.xml.stream.events.Characters;

public class CountnoofLettersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "MacPro 2012 model";

char[] ch = s.toCharArray();
int count =0;

for(int i=0; i<ch.length;i++)
{
	if(Character.isAlphabetic(ch[i]))
	{
		System.out.println(ch[i]);
		count++;
	}
	}

System.out.println("Count of Alphebet is"+count);
}

}
