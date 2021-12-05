package views;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class VentanaFuchsia extends WFrame{

	private static final long serialVersionUID = 1L;
	private Canvas color1;

	public VentanaFuchsia(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		color1 = new Canvas();
		color1.setBounds(0,0,0,0);
		//Fuchsia	#FF00FF	rgb(255, 0, 255)
		//https://htmlcolorcodes.com/es/nombres-de-los-colores/
		color1.setBackground(new Color(255, 0, 255) ); 
		add(color1);
		
		setTitle("Ventana Color Fuchsia rgb(255, 0, 255)");
		setSize(600,360);
		this.setResizable(false);
		
        }	
}