package tw.org.iii;

public class Dante03 {

	public static void main(String[] args) 
	{
		double Achievement = (int)(Math.random() * 100 + 1) ;
		
        System.out.println("學生成績 : "  + Achievement) ;
        
        if(Achievement >= 90)
        {
        	System.out.println("A") ;
        }
        else
        {
        	if(Achievement >= 80)
        	{
        		System.out.println("B") ;
        	}
        	else
        	{
        		if(Achievement >= 70)
        		{
        			System.out.println("C") ;
        		}
        		else
        		{
        			if(Achievement >= 60)
        			{
        				System.out.println("D") ;
        			}
        			else
        			{
        				System.out.println("E") ;
        			}
        		}
        	}
        }
        
        System.exit(0);
		// TODO Auto-generated method stub

	}

}
