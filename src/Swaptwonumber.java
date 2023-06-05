
public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 10;
		
		System.out.println("Before swap a value"+a+" "+"Before swap b value"+b);
		
		a= a*b ;// 200;   a=a+b;  //30
		b = a/b ; //20    b=a-b;   //20
		a=a/b;  //10      a=a-b  //10
		
		System.out.println("After swap a value"+a+" "+"After swap b value"+b);
		
	}

}
