package javaprograme;

class class1{
	
	public int speedlimit =90;
	
	public void speed1()
	{
		System.out.println("class1 Method");
	}
	
}

public class RuntimePolymorphism extends class1{
	
	public int speedlimit = 120;
	
	public void speed1()
	{
		System.out.println("class2 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class1 obj = new RuntimePolymorphism();
		System.out.println(obj.speedlimit);
		obj.speed1();
		
		RuntimePolymorphism obj2  = new RuntimePolymorphism();
		System.out.println(obj2.speedlimit);
		obj2.speed1();
		
		class1 obj1 =new class1();
		obj1.speed1();
		System.out.println(obj1.speedlimit);
	}

}
