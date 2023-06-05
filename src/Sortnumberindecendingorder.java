import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortnumberindecendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {3,16,1,9};
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		 // Sorting ArrayList in descending Order
        // using Collection.sort() method
        // by passing Collections.reverseOrder() as comparator
        Collections.sort(list, Collections.reverseOrder());
  
		System.out.println(list);
		

	}

}
