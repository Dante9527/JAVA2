package tw.org.iii;

import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;
import java.lang.String ;

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
			    		System.out.print("請輸入年份 :") ;
			    		year = Integer.parseInt(input.readLine()) ;
			    		if(year <= 0 || year > 4000)
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
			    		System.out.print("請輸入月份 :") ;
			    		month = Integer.parseInt(input.readLine()) ;
			    		if(month <= 0 || month > 12)
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
			    		date.print(theFirstDay,endDay);
			    	}
			    break ;
			    case 2 :
			    	tempYear  = true ;
			    	while(tempYear)
			    	{
			    		System.out.println("請輸入年份 :") ;
			    		year = Integer.parseInt(input.readLine()) ;
			    		if(year < 0 || year > 4000)
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
			    			date.print(theFirstDay, endDay);
			    		}
			    	}
			    break ;
			}
		}
	}
}

class Date
{
	static int  count_days(int year,int month)
	{
		int days ;
		
		if(year <= 1752 && year %4 == 0 && month == 2)
		{
			days = 29 ;
		}
		else if(year > 1752 && ((year %4 == 0 && year %100 == 0) || year %400 == 0) && month == 2)
		{
			days = 29 ;
		}
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			days = 31 ;
		}
		else if(month==4||month==6||month==9||month==11)
		{
			days = 30 ;
		}
		else
		{
			days = 28 ;
		}
		
		return days ;
	}
	
	static int count_first_day(int year,int month)
	{
		int fDay = 0 ;
		
		if(year < 1752 || (year == 1752 && month <= 8))
		{
			fDay = 6 ;
			
			for(int i = 1 ; year < 12 ; i ++)
			{
				if(i %4 == 0)
				{
					fDay = (fDay + 366) %7 ;
				}
				else
				{
					fDay = (fDay + 365) %7 ;
				}
			}
			for(int j = 0 ; j < month ; j ++)
			{
				fDay = (fDay + count_days(year,j)) %7 ;
			}
		}
		
		return fDay ;
	}
	
	static void special_program()
	{
		int counter,days,firstDay,endDay ;
		firstDay = 2  ;
		endDay   = 30 ;
		String s = "日\t一\t二\t三\t四\t五\t六\n" ;
		
		System.out.println("\t   西元     1752       年        九        月 ") ;
		
		for(counter = 0 ; counter < firstDay ; counter ++)
		{
			s += "\t" ;
		}
		for(days = 1 ; days < endDay ; days ++)
		{
			s += Integer.toString(days) + "\t" ;
			
			if((firstDay + days) %7 == 4 && days != 2)
			{
				s += "\n" ;
			}
			if(days ==2)
			{
				days = 14 ;
				s += Integer.toString(days) + "\t" ;
			}
		}
		
		System.out.println(s) ;
	}
	
	void print(int firstDay,int endDay)
	{
		int k = 1 , i = 1;
		String[][] num = new String[7][7] ;
		num[0] = new String[]{"日" , "一" , "二" , "三" , "四" , "五" , "六"} ; 
		
		for(String s : num[0])
			System.out.print(s + "\t") ;
		    System.out.println() ;
		    
		    for(i = 1 ; i < num.length ; i ++)
		    {
		    	for(int j = 1 ; j < num[0].length ; j ++)
		    	{
		    		String s = String.valueOf(k) ;
		    		
		    		if(i == 1 && j < firstDay)
		    		{
		    			System.out.print("\t");
		    		}
		    		else
		    		{
		    			if(k <= endDay)
		    			{
		    				num[i][j] = s ;
		    				k ++ ;
		    				System.out.print(s + "\t");
		    			}
		    		}
		    	}
		    	
		    	System.out.println();
		    }
	}
	
	
}