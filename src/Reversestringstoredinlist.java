import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversestringstoredinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<String>();
list.add("Java");
list.add("Python");
list.add("C++");
list.add("Ruby");


Collections.reverse(list);

System.out.println(list);

	}

}
