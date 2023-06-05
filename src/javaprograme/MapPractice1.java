package javaprograme;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "apple");
		map.put(2,"banana");
		map.put(3, "orange");
		map.put(4,"gouva");
		map.put(5,"papaya");
		
		//Convert map into set
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry = (Map.Entry<Integer,String>)it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
				}
		
			
		map.putIfAbsent(3, "kkk");
		System.out.println("put if Absent"+map);
		map.putIfAbsent(6, "kkk");
		System.out.println(map);
		
		System.out.println(map.get(1));
		
		for(Map.Entry<Integer, String> entry1 : map.entrySet())
		{
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}
		
		
		//remove the element
		map.remove(1);
		System.out.println(map);
		
		map.replace(3, "replace");
		System.out.println(map);
		
		map.replaceAll((k,v)->"ajay");
		System.out.println(map);
		
		
		
		

	}

}
