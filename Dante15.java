package tw.org.iii;

public class Dante15 {

	public static void main(String[] args) 
	{	
		int[] a ;
		a = new int[4] ;
		a[0] = 9 ;
		a[3] = 20 ;
		for(int i = 0 ; i < a.length ; i ++)
		{
			System.out.println(a[i]) ;
		}
		
		System.out.println("*******************") ;
		
		int[] b = new int[3] ;
		int[] c = new int [] {1,2,3,4,5,6,6} ;
		/* ok
		 int[] c ;
		 c = new int[]{1,2,3,4,5,6,6} ;
		 */
		for(int i = 0 ; i < c.length ; i ++)
		{
			System.out.println(c[i]) ;
		}
		
		System.out.println("*******************") ;
		
		int[] d = {9,8,7,6,5,4,3} ;
		/*error
		d = {9,8,7,6,5,4,3} ; 
		*/
		for(int i = 0 ; i < d.length ; i ++)
		{
			System.out.println(d[i]) ;
		}
	}

}
