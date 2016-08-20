package tw.org.iii;

import javax.swing.JOptionPane;

public class Dante09 {

	public static void main(String[] args) 
	{
		String strYear = JOptionPane.showInputDialog("Year");
		String strMonth = JOptionPane.showInputDialog("Month");
		int intYear = Integer.parseInt(strYear) ;
		int intMonth = Integer.parseInt(strMonth) ;
		int day[] = {31,28,31,39,31,30,31,31,30,31,30,31} ;
		
		if(intYear %4 == 0 && intYear %100 != 0 || intYear %400 == 0)
		{
		   day[1] += 1 ; 
		   System.out.println(intYear + "/" + strMonth + "/" + day) ;
		   
		}
		else
		{
			
		}
		//System.out.println(intYear + "/" + strMonth) ;
	}

}
