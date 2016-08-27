package tw.org.iii;

public class Dante23 {

	public static void main(String[] args) 
	{
//		TWid myId = new TWid("A123456789") ;
//		TWid urId = new TWid("B223456789") ;
//		
//		System.out.println(myId.getId()) ;
//		System.out.println(myId.getGender() ?"男":"女") ;
//		System.out.println(myId.getArea()) ;
//		
//		System.out.println(urId.getId()) ;
//		System.out.println(urId.getGender() ?"男":"女") ;
//		System.out.println(urId.getArea()) ;
		
		TWid id1 = new TWid(true, 8) ;
		System.out.println(id1.getId() + "\n" + id1.getArea());
		
		if(TWid.isRight(id1.getId()))
		{
			System.out.println("oK") ;
		}
		else
		{
			System.out.println("xx") ;
		}
	}
	//X223456789
}
