package views;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class VentanaRojo extends WFrame {
	private static final long serialVersionUID = 1L;
	public Canvas color1;

	public VentanaRojo(Frame parentFrame) {
		super(parentFrame);
		initComponents();
	}
	
	public void initComponents() {
		color1 = new Canvas();
		color1.setBounds(0,0,0,0);
		color1.setBackground(Color.RED);
		add(color1);
		
		setTitle("Ventana Color Rojo");
		setSize(600,360);
		this.setResizable(false);
        }	
}
