package tw.org.iii;

public class Dante19 {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5} ;
		int[][] b = {{1,2},
				     {3,4,5},
				     {6,7,8,9}} ;
		int[][][] c = {
				      {{1,1},{2,2}},
				      {{3,3,3},{4,4,4},{5,5,5}},
				      {{6,6,6,6},{7,7,7,7},{8,8,8,8}}
				      } ;
		for (int  v : a)
		{
			System.out.println(v);
		}
		
		System.out.println("-------------");
		
		for(int[] v1 : b)
		{
			for(int v2 : v1)
			{
				System.out.println(v2);
			}
			System.out.println("===========");
		}
		
		System.out.println("-------------");
		
		for(int[][] v1 : c)
		{
			for(int[] v2 : v1)
			{
				for(int v3 : v2)
				{
					System.out.println(v3);
				}
				System.out.println("===========");
			}
			System.out.println("###########");
		}
	}

}
