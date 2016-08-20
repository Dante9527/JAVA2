package tw.org.iii;

public class Dante10 {

	public static void main(String[] args) 
	{
//		for(;;)
//		{
//			
//		}
		
//		for(int i = 0 ; i < 10 ; i ++)
//		{
//			System.out.println(i);
//		}
//		System.out.println("Over");
		
//		int i = 0 ;
//		for(System.out.println("Dante");;System.out.println("*****"))
//		{
//			System.out.println(i++);
//		}
		
//		int i = 0 ;
//		for(i = 0; i < 10; i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println(i);
		
//		for(int i = 2 ; i <= 9 ; i ++)
//		{
//			for(int j = 1 ; j <= 5 ; j ++)
//			{
//				System.out.print(i + " * " + j + " = " + i*j + "\t");
//			}
//			
//			//System.out.println("************");
//			
//			for(int j = 6 ; j <= 9 ; j ++)
//			{
//				System.out.print(i + " * " + j + " = " + i*j + "\t");
//			}
//			System.out.println();
//		}
		
		for(int k = 0 ; k < 3 ; k ++)
		{
			for(int j = 1 ; j <= 9 ; j ++)
			{
				for(int  i = 2 ; i <= 5 ; i ++)
				{
					int newi = i + k * 4 ; //??
					int r = newi * j ;
					System.out.print(newi + "*" + j + " =" + r + "\t");
				}
				System.out.println();
			}
			System.out.println("=======================") ;
		}
	}

}
