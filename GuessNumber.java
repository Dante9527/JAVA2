package tw.org.iii;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args) 
	{
		Boolean isWINNER = false ;
		String answer = createAnswer(3) ;
		System.out.println(answer) ;
		
		for(int i = 0 ; i <= 10 ; i ++)
		{
			String guess = JOptionPane.showInputDialog("Start") ;
			
			if(guess.equals(answer))
			{
				isWINNER = true ;
				JOptionPane.showMessageDialog(null, "Win");
				break ;
			}
			else
			{
				String result = checkAB(answer,guess) ;
				JOptionPane.showMessageDialog(null, guess + ":" + result);
			}
		}
		if(!isWINNER)
		{
			JOptionPane.showMessageDialog(null, "answer:" + answer);
		}
	}
	
	static  String checkAB(String a , String g)
	{
		int A, B ;
		A = B = 0 ;
		for(int i = 0 ; i < g.length() ; i++)
		{
			if(g.charAt(i) == a.charAt(i))
			{
				A++ ;
			}
			else if(a.indexOf(g.charAt(i)) != -1)
			{
				B++ ;
			}
		}
		return A + "A" + B + "B" ;
	}
	
	static String createAnswer(int n)
	{
		int[] ans = new int[n] ;
		int ran ;
		Boolean isOk ;
		for(int i = 0 ; i < ans.length ; i++)
		{
			do
			{
				ran = (int)(Math.random() *10) ;
				isOk = true ;
				for(int j = 0 ; j < i ; j ++)
				{
					if(ans[j] == ran)
					{
						isOk = false ;
						break ;
					}
				}
			}
			while(!isOk) ;
			
			ans[i] = ran ;
		}
		
		String str = "" ;
		
		for(int v : ans)
		{
			str += v ; 
		}
		return str ;
	}

}
