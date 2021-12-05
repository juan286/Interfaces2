package views;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;

import misc.event.FormInterface;

public class MainFrame extends Frame implements FormInterface{
	
	private Button button1 , button2 , button3, button4;
        private Label label1, label2, label3;
        private TextField textField1, textField2, textField3;
        private CheckboxGroup group1;
        private Checkbox checkbox1, checkbox2, checkbox3, checkbox4;
	private Frame instance;
	
	public MainFrame() {
		initComponents();
		instance = this;
	}
	
	public void initComponents() {
		setLayout(null);
		button1 = new Button("Azul");button1.setBounds(120,50,100,32);add(button1);
		button2 = new Button("Azul y Blanco");button2.setBounds(270,50,100,32);add(button2);
		button3 = new Button("Rojo");button3.setBounds(120,109,100,32);add(button3);
		button4 = new Button("Fuchsia");button4.setBounds(270,109,100,32);add(button4);
                
                addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		button1.addMouseListener(new MouseAdapter () {
			public void mousePressed(MouseEvent e) {
				VentanaAzul va = new VentanaAzul(instance);
				va.showForm();
			}
		});
		
		button2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaAzulyBlanco vab = new VentanaAzulyBlanco(instance);
				vab.showForm();
			}
		});
		
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaRojo vr = new VentanaRojo(instance);
				vr.showForm();
			}
		});
		
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				VentanaFuchsia vf = new VentanaFuchsia(instance);
				vf.showForm();
				
			}
		});
		label1 = new Label("Numero 1");label1.setBounds(20,150,100,32);add(label1);
                textField1= new TextField("");textField1.setBounds(122,150,250,32);add(textField1);
                label2= new Label("Numero 2");label2.setBounds(20,200,100,32);add(label2);
                textField2= new TextField("");textField2.setBounds(122,200,250,32);add(textField2);
                label3= new Label("Resultado");label3.setBounds(20,250,100,32);add(label3);
                textField3= new TextField("");textField3.setBounds(122,250,250,32);
                textField3.setEnabled(false);add(textField3);

                group1= new CheckboxGroup();
                checkbox1 = new Checkbox("Suma", group1, true);checkbox1.setBounds(380,150,100,24);add(checkbox1);
                checkbox2 = new Checkbox("Resta", group1, false);checkbox2.setBounds(380,175,100,24);add(checkbox2);
                checkbox3 = new Checkbox("Multiplicacion", group1, false);checkbox3.setBounds(380,200,100,24);add(checkbox3);
                checkbox4 = new Checkbox("Division", group1, false);checkbox4.setBounds(380,225,100,24);add(checkbox4);

                button1 = new Button("Borrar");button1.setBounds(20,300,100,32);add(button1);
                button2 = new Button("Calcular");button2.setBounds(370,300,100,32);add(button2);


                button1.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                                    }
                            });

                button2.addActionListener(new ActionListener () {
                public void actionPerformed(ActionEvent e) {
                String s1 = textField1.getText();    
                String s2 = textField2.getText();    
                double a = Double.parseDouble(s1);    
                double b = Double.parseDouble(s2);    
                double c = 0;	  
                NumberFormat redondear =NumberFormat.getNumberInstance();
                redondear.setMaximumFractionDigits(4);

	        if (checkbox1.getState()) {
	        	 c = a + b; 	
	        }
	        
	        if (checkbox2.getState()) {
	        	c = a - b;
	        }
	        
	        if(checkbox3.getState()) {
	        	c = a * b;
	        }
	        
	        if(checkbox4.getState()) {
	        	c = a / b;
	        }
	         
	        String resultado= redondear.format(c) ;
	                 
	        textField3.setText(String.valueOf(resultado));    
			}
		});
		
	
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void showForm() {
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
                
        setTitle("Mi primera ventana");
		setSize(500,400);
		this.setResizable(false);
		setLocationRelativeTo(null);
		
		
	}


}
