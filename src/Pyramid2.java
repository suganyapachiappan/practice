
public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=4;i++)
		{
			for(int s =1;s<=i-1; s++)
			{
				System.out.print(" ");
			}	
			for(int k =1; k<=9-i*2;k++)
				{
					System.out.print("*");
				}
			
			System.out.println();
			}
		
		
		}
	}

}
