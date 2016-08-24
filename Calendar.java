package tw.org.iii;

import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;


public class Calendar 
{
	public static void main(String[] args) throws IOException
	{
		int 
		year = 0 , month = 0 ; 
		
		System.out.print("請輸入年份 : ");
		BufferedReader inYear = new BufferedReader(new InputStreamReader(System.in)) ;
		year = Integer.parseInt(inYear.readLine()) ;
		
		System.out.print("請輸入月份 : ");
		BufferedReader inMonth = new BufferedReader(new InputStreamReader(System.in)) ;
		month = Integer.parseInt(inMonth.readLine()) ;
		
		if(!(year > 0 && year < 40000 && month > 0 && month <= 12))
		{
			if(!(year > 0 && year < 40000 ))
			{
				System.out.println("輸入年份 請大於0，小於 40000");
			}
			else
			{
				System.out.println("輸入月份 請大於0，小於等於 12");
			}
		}
		else
		{
			System.out.println("西元 " + year + " 年\t" + month + " 月");
		}

	}
}
