package tw.org.iii;

public class Dante11 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 100; i++) 
		{
			boolean isOk = true ;
			for(int k = 2 ; k < i ; k++)
			{
				if(i %k == 0)
				{
					isOk = false ;
					break ;
				}
			}
			System.out.print(i +(isOk?"*":" ") + " ");

			if (i % 10 == 0) 
			{
				System.out.println();
			}
		}
		System.out.println();
	}

}
