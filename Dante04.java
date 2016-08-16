package tw.org.iii;

import java.util.*;

public class Dante04 {

	public static void main(String[] args) 
	{
		// double year = (int)(Math.random() * 500 + 1) ;
		
		// System.out.println("西元 " + (int)year +" 年") ;
		
		System.out.println("請輸入西元年分");
   	        Scanner scan=new Scanner(System.in);
   	        String Input;
   	        Input=scan.nextLine();
   	        int year=Integer.parseInt(Input);
		
		if(year %400 == 0)
		{
			System.out.println("是閏年， 四月是 29  天");
		}
		else
		{
			if(year %100 == 0)
			{
				System.out.println("不是閏年");
			}
			else
			{
				if(year %4 == 0)
				{
					System.out.println("是閏年， 四月是 29  天");
				}
				else
				{
					System.out.println("不是閏年");
				}
			}
		}
		
		System.exit(0);
		// TODO Auto-generated method stub

	}

}
