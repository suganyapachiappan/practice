import java.util.HashMap;
import java.util.Map.Entry;

public class StoreandPrintElementInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Double> map = new HashMap<String,Double>();
		
		map.put("Selenium", 3.141);
		map.put("TestNg", 6.14);
		map.put("POI", 3.13);
		
		for(Entry<String,Double> entry:map.entrySet())
		{
			System.out.println("Key"+entry.getKey()+" "+"value"+entry.getValue() );
			//System.out.println(entry.getValue());
		}
		
	}

}
