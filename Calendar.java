package tw.org.iii;

import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;

public class Calendar 
{
	public static void main(String[] args) throws IOException
	{
		int 
		year = 0 , month = 0 , firstDay = 0 , endDay = 0 , chose = 0 , theFirstDay ; 
		
		boolean 
		tempYear , tempMonth , check=true;
		
		Date date = new Date() ;
		
		while(check)
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in)) ;
			
			System.out.println("--------------萬年曆------------------------") ;
			System.out.println("   (1).列印指定年份及月分(月曆)") ;
			System.out.println("   (2).列印指定年份月曆") ;
			System.out.println("   (0).離開") ;
			
			chose=Integer.parseInt(input.readLine());
			
			switch(chose)
			{
			    case 0 :
			    	System.out.println("結束程式");
			    	check = false ;
			    break ;
			    case 1 :
			    	tempYear  = true ;
			    	tempMonth = true ; 
			    	while(tempYear)
			    	{
			    		System.out.println("請輸入年份") ;
			    		year = Integer.parseInt(input.readLine()) ;
			    		if(year < 0 || year <4000)
			    		{
			    			System.out.println("請輸入合理的年份") ;
			    		}
			    		else
			    		{
			    			tempYear = false ;
			    		}
			    	}
			    	while(tempMonth)
			    	{
			    		System.out.println("請輸入月份") ;
			    		month = Integer.parseInt(input.readLine()) ;
			    		if(month < 0 || month > 12)
			    		{
			    			System.out.println("請輸入合理的月份") ;
			    		}
			    		else
			    		{
			    			tempMonth = false ;
			    		}
			    	}
			    	System.out.println("---------------萬年曆------------------") ;
			    	System.out.println("西元 \t"+year+"\t年\t"+month+"\t月\t") ;
			    	theFirstDay=date.count_first_day(year,month);
			    	endDay=date.count_days(year,month) ;
			    	System.out.println("---------------") ;
			    	
			    	if(year == 1752 && month == 9)
			    	{
			    		date.special_program() ;
			    	}
			    	else
			    	{
			    		date.print(theFirst_day,end_day);
			    	}
			    break ;
			    case 2 :
			    	tempYear  = true ;
			    	while(tempYear)
			    	{
			    		System.out.println("請輸入年份") ;
			    		year = Integer.parseInt(input.readLine()) ;
			    		if(year < 0 || year <4000)
			    		{
			    			System.out.println("請輸入合理的年份") ;
			    		}
			    		else
			    		{
			    			tempYear = false ;
			    		}
			    	}
			    	for(month = 1 ; month <= 12 ; month ++)
			    	{
			    		theFirstDay = date.count_first_day(year,month) ;
			    		endDay      =date.count_days(year, month) ;
			    		if(year == 1752 && month == 9)
			    		{
			    			date.special_program() ;
			    		}
			    		else
			    		{
			    			System.out.println("西元 \t"+year+"\t年\t"+month+"\t月\t") ;
			    			date.print(theFirst_day, end_day);
			    		}
			    	}
			    break ;
			}
		}
	}
}

class Date
{

}
