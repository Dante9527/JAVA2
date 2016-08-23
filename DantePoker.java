package tw.org.iii;

import java.util.Arrays;

public class DantePoker {

	public static void main(String[] args) 
	{
		//洗牌
		int[] poker = new int[52] ;
		int ran ;
		boolean isOk ;
		
		for(int i = 0 ; i < poker.length ; i++)
		{
			do
			{
				ran = (int)(Math.random() *poker.length) ;
				//檢查
				isOk = true ;
				for(int j = 0 ; j < i ; j++)
				{
					if(poker[j] == ran)
					{
						isOk = false ;
						break ;
					}
				}
			}
			while(!isOk) ;
				
			poker[i]  = ran ;
			System.out.println(poker[i]) ;
		}
		System.out.println("========================");
		
		//發牌 => 四個玩家
		
		int[][] player =new int[4][13] ;
		for(int i = 0 ; i < poker.length ; i ++)
		{
			player[i %4][i/4] = poker[i] ;
		}
				
		//理牌 => 
		String[] suit = {"方塊","紅心","黑桃","梅花"} ;
		String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"} ;
		for (int[] cards : player)
		{
			Arrays.sort(cards);
			for(int card : cards)
			{
				System.out.print(suit[card /13] + value[card %13] + "  ") ;
			}
			System.out.println();
		}
		

	}

}
