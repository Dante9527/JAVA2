package tw.org.iii;

public class Dante07 {

	public static void main(String[] args) 
	{
		int a = 1 ; 
		final int b = 10 ;
		
		switch(a)
		{
		case 1:
			System.out.println("A");
			break ;
		case 2:
			System.out.println("B");
			break ;
		case 3:
			System.out.println("C");
			break ;
		case b :
			System.out.println("C");
			break ;
		case b + 2:
			System.out.println("C");
			break ;
		default:
			System.out.println("x");
			break;
		}
		
//		int dir = 1 ; // 0: stop 1: left 2: right 3: up 4: down 
//		final int stop  = 0 ;
//		final int left  = 1 ;
//		final int right = 2 ;
//		final int up    = 3 ;
//		final int down  = 4 ;
//
//		switch(dir)
//		{
//		case stop:
//			System.out.println("停");
//			break ;
//		case left:
//			System.out.println("左");
//			break ;
//		case right:
//			System.out.println("右");
//			break ;
//		case up:
//			System.out.println("上");
//			break ;
//		case down:
//			System.out.println("下");
//			break ;
//		default:
//			System.out.println("x");
//			break;
//		}

	}

}
