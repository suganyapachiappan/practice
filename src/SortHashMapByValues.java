import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValues {
	
	public static HashMap<String,Integer> sortByValue(HashMap<String,Integer> map)
	{
		List<Map.Entry<String,Integer>>  list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>()
		{
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}
		
		});
		
		//we should use only linked hashmap, because linked hashmap only maintain insertion order
		
		HashMap<String,Integer> temp = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String, Integer>  a :list)
		{
			temp.put(a.getKey(), a.getValue());
			
		}
		return temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Suganya",11);
		map.put("Shree", 8);
		map.put("Naveen", 20);
		map.put("Chelli", 6);
		map.put("Ammi", 9);
		
		HashMap<String, Integer> aftersort = sortByValue(map);
		
		for(Entry<String, Integer> sortedValue : aftersort.entrySet())
		{
		
			System.out.println(sortedValue.getKey()+" "+sortedValue.getValue());
		}
		
		

	}

}
