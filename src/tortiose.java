import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class tortiose {
	public static void main(String []args){
		   Frame w=new Frame();
		   w.setSize(300,400);
		   MyPanel mp=new MyPanel();
		   w.add(mp);
		   w.setVisible(true);
		   w.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e) {
				    System.exit(0);
				}
		});
		}	
}


class MyPanel extends Panel{
	int []a1={120,110,130,120};
	int []b1={120,130,130,120};
	int c1=4;
	
	int []a2={100,100,75};
	int []b2={270,300,330};
	int c2=3;
	
	int []a3={140,140,165};
	int []b3={270,300,330};
	int c3=3;
	
	int []a4={76,46,20};
	int []b4={225,225,240};
	int c4=3;
	
	int []a5={166,194,220};
	int []b5={225,225,240};
	int c5=3;
	
	public void paint(Graphics g){
		g.drawOval(80, 80, 80, 80);//Á³
		g.drawOval(90,100,20,20);//×óÑÛ
		g.drawOval(130,100,20,20);//ÓÒÑÛ
		g.drawPolyline(a1, b1, c1);//±Ç×Ó
		g.drawRoundRect(94, 140, 50, 6, 50, 80);//×ì
		g.drawLine(113, 160, 113, 180);//²±×Ó×ó
		g.drawLine(127, 160, 127, 180);//²±×ÓÓÒ
		g.drawRoundRect(76, 180, 90, 90, 50, 90);//ÉíÌå
		g.drawPolyline(a2, b2, c2);//×óÍÈ
		g.drawPolyline(a3, b3, c3);//ÓÒÍÈ
		g.drawPolyline(a4, b4, c4);//×ó¸ì²²
		g.drawPolyline(a5, b5, c5);//ÓÒ¸ì²²
		
		g.setColor(Color.black);
		g.fillOval(90,100,18,18);
		g.fillOval(130,100,18,18);
		g.setColor(Color.PINK);
		g.drawRoundRect(76, 180, 90, 90, 50, 90);
		g.fillRoundRect(76, 181, 91, 90, 50, 90);//ÉíÌå
		
		g.setColor(Color.blue);
		g.fillOval(113, 190, 18, 18);//²±×Ó×ó
		g.fillOval(113, 215, 18, 18);//²±×Ó×ó
		g.fillOval(113, 240, 18, 18);//²±×Ó×ó
	}
}


	 




