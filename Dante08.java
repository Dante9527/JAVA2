package tw.org.iii;

public class Dante08 {

	public static void main(String[] args) 
	{
		int month = (int)(Math.random() *12 +1) ;
		System.out.println(month + "月") ;
		
		switch(month)
		{
		   case 1: case 3 : case 5 :  case 7 : case 8 :
		   case 10 : case 12 :   
			   System.out.println("31天");
			   break;
		   case 4 : case 6 : case 9 : case 11 :
			   System.out.println("30天");
			   break;
		   case 2:
			   System.out.println("28天");
			   break;
		   default:
			   System.out.println("Error");
			   break;
		}
	}

}
