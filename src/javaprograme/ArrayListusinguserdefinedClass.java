package javaprograme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListusinguserdefinedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student(101,"suganya",21);
		Student s2 = new Student(102,"pachiappan",23);
		Student s3 = new Student(103,"chelli",24);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		/*Iterator it  = al.iterator();
		
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			
			System.out.println(s.rollNo+s.name+s.age);
		}*/
		
		ListIterator<Student> li = al.listIterator(al.size());
		while(li.hasPrevious())
		{
			Student s = li.previous();
			System.out.println(s.rollNo+s.name+s.age);
			
		}
		
		
		System.out.println(al.contains(s3));
		System.out.println(al.indexOf(s3));
		//System.out.println(al.set(1 ,s2));
		
Iterator it  = al.iterator();
		
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			
			System.out.println(s.rollNo+s.name+s.age);
		}
		
		
	}

}
