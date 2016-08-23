package tw.org.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dante22
{
	
	String[] capital = {" ","拾","佰","仟","萬","拾萬","佰萬","仟萬","億","拾億","佰億","仟億"} ;
	String[] word={" ","壹","貳","叁","肆","伍","陸","柒","捌","玖"} ;
	public String qs ;
	public String result = "" ;

	public Dante22(String qs)
	{
		this.qs = qs ;
	}
	
	public static void main(String[] args) 
	{
		String r = "0" ;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
		
		do
		{
			System.out.println("請輸入正整數 : ");
			try
			{
				r = in.readLine() ;
				r = Integer.parseInt(r) + "";
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		while(!(Integer.parseInt(r) > 0 && Integer.parseInt(r) < 100000000)) ;
		
		Dante22 cn = new Dante22(r + "") ;
		System.out.println(cn.getUpper() + " 元正") ;
	}
	
	public String getUpper()
	{
		com() ;
		return result ;
	}
	
	public void com()
	{
		turnZero() ;
		turnNumNotZero() ;
	}
	
	 private void turnZero() 
	 {
		  if(result.lastIndexOf("0") == result.length() -1)
		  {
			  result = result.substring(0,result.length()-1) ;
		  }
		  
		  result = result.replaceAll("0",word[0]) ;
	 }
	 
	public void turnNumNotZero()
	{
		for(int i = 0 ; i < qs.length() ; i++ )
		{
			int index = Integer.parseInt(this.qs.charAt(i) + "") ;
			
			if(index != 0)
			{
				result += word[index] + capital[qs.length() -i -1] ;
			}
			else
			{
				result += "0" ;
			}
		}
	}
}
