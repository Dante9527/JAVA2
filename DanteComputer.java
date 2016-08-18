package tw.org.iii;

import java.awt.* ;
import java.awt.event.* ;

public class DanteComputer 
{
   private static Frame frm = new Frame("計算機") ;
   private static Panel pa1 = new Panel(new GridLayout(4,3)) ;
   private static Panel pa2 = new Panel(new GridLayout(4,1)) ;
   private static Label lab = new Label("0",Label.RIGHT) ;
   private static Button cn,ad,sub,mul,div,amo ;
   private static Button digits[] = new Button[10] ;
   
   private static long num ;
   private static byte op ;
   
   public static void main(String args[])
   {
	   frm.setLayout(null) ;
	   frm.setBounds(450,250,160,180);
	   frm.setResizable(false);
	   
	   lab.setBounds(20,30,120,20) ;
	   lab.setBackground(new Color(240,220,190));
	   
	   pa1.setBounds(20,60,90,105);
	   pa2.setBounds(110,60,30,105);
	   
	   for(int i = 9 ; i >= 0 ; i--)
	   {
		   digits[i] = new Button(Integer.toString(i)) ;
		   pa1.add(digits[i]) ;
		   digits[i].addActionListener(new ActLis());
	   }
	   
	   cn = new Button("C") ;
	   pa1.add(cn) ;
	   cn.addActionListener(new ActLis());
	   amo = new Button("=") ;
	   pa1.add(amo);
	   amo.addActionListener(new ActLis());
	   ad = new Button("+") ;
	   pa1.add(ad) ;
	   ad.addActionListener(new ActLis());
	   sub = new Button("-") ;
	   pa1.add(sub) ;
	   sub.addActionListener(new ActLis());
	   mul = new Button("*") ;
	   pa1.add(mul) ;
	   mul.addActionListener(new ActLis());
	   div = new Button("/") ;
	   pa1.add(div);
	   div.addActionListener(new ActLis());
	   
	   frm.addWindowListener(new WindowAdapter()
	   {public void windowSlosing(WindowEvent e){System.exit(0);}});
	   frm.add(lab) ;
	   frm.add(pa1) ;
	   frm.add(pa2) ;
	   frm.setVisible(true) ;
	   
   }
   
   public static class ActLis implements ActionListener
   {
	   public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException
	   {
		   Button btn = (Button) e.getSource() ; 
		   try
		   {
			   for(int i = 0 ; i <= 9 ; i++)
			   {
				   if(btn == digits[i])
				   {
					   output_digit(digits[i]) ; //??
					   break ;   
				   }
			   }
			   
			   if(btn == cn)
			   {
				   //result = 0L ;
				   num    = 0L ;
				   op     = 0  ;
				   lab.setText(Long.toString(num));
			   }else if(btn == ad)
			   {
				   save_num(ad) ;
			   }
		   }
		   catch(NumberFormatException ne)
		   {}
	   }
   }
}