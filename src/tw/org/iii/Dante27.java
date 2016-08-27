package tw.org.iii;

public class Dante27 {

	public static void main(String[] args) 
	{
		Dante27_2 obj1 = new Dante27_2() ;
		obj1.m1() ;
		obj1.m1(2) ;
		obj1.m2() ;
	}

}

class Dante27_1
{
	int a ;
	
	void m1()
	{
		System.out.println("Dante27_1 : m1()");
	}
}

class Dante27_2 extends Dante27_1
{
//	void m1()
//	{
//		super.m1();
//		System.out.println("Dante27_2 : m1()");
//	}
	
	void m1(int a)
	{
		super.m1();
		a++ ;
		System.out.println("Dante27_2 : m1(int)" + a);
	}
	void m2()
	{
		System.out.println("Dante27_2 : m2()");
	}
}