package views;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class VentanaAzulyBlanco extends WFrame{
	
	private static final long serialVersionUID = 1L;
	private Canvas color1;
	private Canvas color2;

	public VentanaAzulyBlanco(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		color1 = new Canvas();
		color1.setBackground(Color.BLUE);
		color1.setBounds(100,500,500,600);
		add(color1);
		
		color2 = new Canvas();
		color2.setBackground(Color.WHITE);
		color2.setBounds(0,175,600,460);//101,101,600,460
		add(color2);
		
		setTitle("Ventana Color Azul y Blanco");
		setSize(600,360);
		this.setResizable(false);
		
		
		
		add(color1);
		

		
	}
}
