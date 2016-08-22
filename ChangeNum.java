package tw.org.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChangeNum 
{
	String[] capital = {" ","拾","佰","仟","萬","拾萬","佰萬","仟萬","億","拾億","佰億","仟億"} ;
	String[] word={" ","壹","貳","叁","肆","伍","陸","柒","捌","玖"} ;
    String result = "" ;
    String qs ;
    
	public static void main(String[] args)
	{
    	String r = "0" ;
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
	    
	    do
	    {
			System.out.println("請輸入正整數 : ") ;
			
			try //得到輸入正整數 
			{
				r = in.readLine() ; 
				r = Integer.parseInt(r) + "" ;  
			}
			catch(IOException e)
			{}
	    }
	    while(!(Integer.parseInt(r) > 0 && Integer.parseInt(r) < 1000000000)) ; 
	    
	    ChangeNum cn = new ChangeNum(r + "") ;
	    System.out.print(cn.getUpper() + " 元正");
	 }
	
	public String getUpper()
    {
    	this.com() ;
    	return this.result ;
    	
   
    }
    
    public void com()
    {
    	//this.turnNumNotZero() ;
    	//this.deleteTooMuchZero() ;
    	//this.turnZero() ;
    	
    	if(this.result.lastIndexOf("0") == this.result.length() -1)
    	{
    		this.result=this.result.substring(0,this.result.length()-1);
    	}
    	this.result = this.result.replaceAll("0",this.word[0]) ;
    	
    	if(this.result.lastIndexOf("00") == -1)
    	{
    		return ;
    	}
    		
    	this.result = this.result.replace("00" , "0") ;
    	//this.deleteTooMuchZero();
    	
    	for(int i = 0 ; i < this.qs.length() ; i ++)
    	{
    		int index = Integer.parseInt(this.qs.charAt(i) + "") ;
    		
    		if(index != 0)
    		{
    			this.result += this.word[index] + this.capital[this.qs.length() -i -1] ;
    		}
    		else
    		{
    			this.result += "0" ;
    		}
    	}
    	
    	
    }
    
    /*public void turnZero()
    {
    	if(this.result.lastIndexOf("0") == this.result.length() -1)
    	{
    		this.result=this.result.substring(0,this.result.length()-1);
    	}
    	this.result = this.result.replaceAll("0",this.word[0]) ;
    }
    
    public void deleteTooMuchZero()
    {
    	if(this.result.lastIndexOf("00") == -1)
    	{
    		return ;
    	}
    		
    	this.result = this.result.replace("00" , "0") ;
    	this.deleteTooMuchZero();
    }
    
    public void turnNumNotZero()
    {
    	for(int i = 0 ; i < this.qs.length() ; i ++)
    	{
    		int index = Integer.parseInt(this.qs.charAt(i) + "") ;
    		
    		if(index != 0)
    		{
    			this.result += this.word[index] + this.capital[this.qs.length() -i -1] ;
    		}
    		else
    		{
    			this.result += "0" ;
    		}
         }
    }*/
	
	public ChangeNum(String qs) 
	{
		this.qs = qs ;
	}
}