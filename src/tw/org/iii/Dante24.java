package tw.org.iii;

public class Dante24 {

	public static void main(String[] args) 
	{
//		Dante24_1 da24_1 =new Dante24_1(false) ;
		Dante24_2 da24_2 =new Dante24_2("2") ;
	}

}

class Dante24_1
{
//	Dante24_1()
//	{
//		System.out.println("A") ;
//	}
	
	Dante24_1(int a)
	{
		System.out.println("B") ;
	}
//	Dante24_1(boolean a)
//	{
//		System.out.println("C") ;
//	}
}

class Dante24_2 extends Dante24_1
{
	Dante24_2()
	{
		super(1) ;
		System.out.println("c") ;
	}
	
	Dante24_2(int a)
	{
		this() ;
		System.out.println("d") ;
	}
	
	Dante24_2(String a)
	{
		this(1) ;
		System.out.println("e") ;
	}
}