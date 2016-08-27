package tw.org.iii;

public class Dante25 {

	public static void main(String[] args) 
	{
		String a = "0123" ;
		System.out.println(a.concat("abcd")) ;
		System.out.println(a) ;
		System.out.println(a.replace('2','k')) ;
		StringBuffer sb1 = new StringBuffer() ;
		sb1.append("abc") ;
		System.out.println(sb1);
		sb1.append("def") ;
		System.out.println(sb1.capacity());
		sb1.append("123456789012345678901234567890") ;
		System.out.println(sb1.capacity());
		sb1.append("") ;
		System.out.println(sb1.capacity());
	}

}
