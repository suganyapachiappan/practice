import java.util.HashMap;
import java.util.Map.Entry;

public class FirstnonrepeatingcharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1 = "accommodation";
    char ct = FindingFistChar(s1);
    System.out.println(ct);
    
	}
    public static Character FindingFistChar(String s)
    {   	
    
    
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    
    for(int i=0;i<s.length();i++)
    {
    	char ch = s.charAt(i);
    	
    	
    	//checking map already contains key or not, if contain fetching the corresponding key value and increment by 1
    	if(map.containsKey(ch))
    	{
    		map.put(ch, map.get(ch)+1);
    	}
    	
    	else    		
    	{
    		map.put(ch, 1);
    	}
    	
    }
		
    for(Entry<Character,Integer> entry: map.entrySet())
    {
       // if(entry.getValue() == 1)
           // return entry.getKey();
        System.out.println(entry.getKey()+" "+entry.getValue());
        
        
    }
	return null;
   
		
		
	}

}
