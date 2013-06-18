import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class VentanasCuadro extends JFrame {
	
	ControladorCuadro c;
	
	public VentanasCuadro(){
		this.setVisible(true);
		this.setSize(600, 600);
		this.setTitle("Cuadros");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=new ControladorCuadro(3);
		c.agregarElementos(new Dato(50,50,Color.BLUE));
		c.agregarElementos(new Dato(110,50,Color.RED));
		c.agregarElementos(new Dato(170,50,Color.yellow));
	}
	
	public void paint(Graphics g){
		Graphics2D g2= (Graphics2D) g;
		Rectangle2D.Double rect;
		
		for(int i=0;i<3.;i++){
			rect=new Rectangle2D.Double(c.getArregloX(i), c.getArregloY(i), 50, 50);
			g2.setPaint(c.getColorArreglo(i));
			g2.fill(rect);			
			
		}
		
	}
	
}
