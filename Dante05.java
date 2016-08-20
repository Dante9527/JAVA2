package tw.org.iii;

public class Dante05 {

	public static void main(String[] args)
	{
		int year = 2100 ;
		
		if(year %4 == 0)
		{
			if(year %100 == 0)
			{
				if(year %400 == 0)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
			else
			{
				System.out.println("yes");
			}
		}
		else
		{
			System.out.println("no");
		}
	}

}
