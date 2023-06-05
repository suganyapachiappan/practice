import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equals -- compare arrays
		//deepEquals -- compare objects of array
		
		String[] arr1 = new String[] {"Apple","Banana","Mango","Orange"};
		String[] arr2 = new String[] {"Apple","Banana","Mango","Orange"};
		
		//Object[] arr11 = {arr1};
		//Object[] arr22 = {arr2};
		
		if(Arrays.equals(arr1, arr2))
		//if(Arrays.deepEquals(arr11, arr22))
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}

	}

}
