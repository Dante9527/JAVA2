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
    
    public ChangeNum(String qs) 
    {
        this.qs = qs ;
    }
    
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
	    {
	    	e.printStackTrace();
	    }
        }
        while(!(Integer.parseInt(r) > 0 && Integer.parseInt(r) < 1000000000)) ; 
	    
        ChangeNum cn = new ChangeNum(r + "") ;
        System.out.print(cn.getUpper() + " 元正");
    }
	
    public String getUpper() //轉大寫
    {
        this.com() ;
    	return this.result ;
    }
    
    public void com() //計算
    {
        this.turnNumNotZero() ;
        this.turnZero() ;
    }
    
    public void turnZero() //將0轉換為零
    {
        if(this.result.lastIndexOf("0") == this.result.length() -1) //最後是0的情況
    	{
            //lastIndexOf : 回傳搜尋字串最後出現的索引值 
    		
            this.result=this.result.substring(0,this.result.length()-1);
            //substring : 回傳從 beginIndex 到 endIndex 之間的子字串
    	}
    	
        this.result = this.result.replaceAll("0",this.word[0]) ;
    	//replaceAll : 將符合 regex 置換成 replacement
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
            else
            {
                this.result += "0" ;
            }
        }
    }
}
