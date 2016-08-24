package tw.org.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dante22
{
    String[] capital = {" ","拾","佰","仟","萬","拾萬","佰萬","仟萬","億","拾億","佰億","仟億"} ;
    String[] word={" ","壹","貳","叁","肆","伍","陸","柒","捌","玖"} ;
    String result = "" ;
    String qs ;
	

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
            ystem.out.println("請輸入正整數 : ") ;
			
            try //得到輸入正整數 
	    {
		r = in.readLine() ; 
		r = Integer.parseInt(r) + "" ;  
	    }
            catch(IOException e)
	    {
                e.printStackTrace() ;
            }
        }
        while(!(Integer.parseInt(r) > 0 && Integer.parseInt(r) < 1000000000)) ; 
	    
        Dante22 cn = new Dante22(r + "") ;
        System.out.println(cn.getUpper() + " 元正");

    }
	
    public String getUpper()
    {
        this.com() ;
        return this.result ;
    }
	
    public void com()
    {
        this.turnNumNotZero() ;
    }
	
    public void turnNumNotZero() //將非0數字轉換為大寫
    {
    	for(int i = 0 ; i < this.qs.length() ; i ++)
    	{
            int index = Integer.parseInt(this.qs.charAt(i) + "") ;
            //charAt : 返回指定索引的char值
    		
            if(index != 0)
            {
                this.result += this.word[index] + this.capital[this.qs.length() -i -1] ;
            }
         }
    }
}
