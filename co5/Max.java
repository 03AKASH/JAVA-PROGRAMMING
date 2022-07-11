import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Max extends Applet implements ActionListener {
	   TextField t1,t2,t3,t4;
   	 Button b1;
	

	public void init() {
	  setLayout(null);
	  
	  t1 = new TextField(25);
	  t1.setBounds(100,25,80,20);	  
	  t2 = new TextField(25);
	  t2.setBounds(100,50,80,20);
	  t3 = new TextField(25);
	  t3.setBounds(100,75,80,20);
	  t4 = new TextField("RESULT");
	  t4.setBounds(100,160,80,20);
	  
	  b1 = new Button("FIND");
	  b1.setBounds(230,65,50,30);

	  add(t1);
	  add(t2);
	  add(t3);
	  add(t4);
	  add(b1);

	  b1.addActionListener(this);
    }

	public void actionPerformed(ActionEvent e) {
	
	   int i,j,k;
	   i = Integer.parseInt(t1.getText());
	   j=Integer.parseInt(t2.getText());
	   k=Integer.parseInt(t3.getText());
	   if(i>j) {
	        if(i>k)
	            t4.setText(""+i);
	        else
	            t4.setText(""+k);
       	  }
    	else
	       {	
		if(j>k)
	                    	t4.setText(""+j);
		else
			t4.setText(""+k);
         }}
	public static void main(String args[]){
	  
	   new Max();
	
	}
}
/* <applet code="Max.class" height=300 width=300>
</applet> */

