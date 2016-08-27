package tw.org.iii;

public class Dante26 {

	public static void main(String[] args) 
	{
//		Dante26_1.a1() ;
//		Dante26_1 obj1 = new Dante26_1() ;
		Dante26_2 obj2 = new Dante26_2() ;
//		Dante26_3 obj3 = new Dante26_3() ;
	}

}

class Dante26_1
{
	int b =44004 ;
	static{
		System.out.println("Dante26_1 :static{}") ;
	}
	{
		System.out.println("Dante26_1 :" + b) ;
	}
	Dante26_1()
	{
		System.out.println("Dante26_1") ;
	}
	
	static void a1()
	{
		System.out.println("Dante26_1 : a1()");
	}
}

class Dante26_2 extends Dante26_1
{
	Dante26_2()
	{
		System.out.println("Dante26_2") ;
	}
}

class Dante26_3 extends Dante26_2
{
	Dante26_3()
	{
		System.out.println("Dante26_3") ;
	}
}