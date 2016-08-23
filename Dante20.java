package tw.org.iii;

public class Dante20 {

	public static void main(String[] args) 
	{
		int i = 0 ,sum = 0 , n = 947 ;
//		while(i < 10)
//		{
//			System.out.println(i ++) ;
//		}
		
		while(i <= n)
		{		
			sum += i++ ;
		}
		
		System.out.println("1 + 2 + ... +  " + n + " = " + sum) ;
	}

}
