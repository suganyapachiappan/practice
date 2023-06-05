package javaprograme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");
		
		Collections.sort(al,new Comparator<Student>()
				{
			public int compare(Student)
			{
				
			}
			
				}

	}

}
