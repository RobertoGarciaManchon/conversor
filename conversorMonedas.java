import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conversorMonedas {

	private JFrame frmConversorMonedas;
	private JTextField caja1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversorMonedas window = new conversorMonedas();
					window.frmConversorMonedas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public conversorMonedas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorMonedas = new JFrame();
		frmConversorMonedas.setTitle("Conversor Monedas");
		frmConversorMonedas.setBounds(100, 100, 264, 234);
		frmConversorMonedas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorMonedas.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Euros");
		label1.setBounds(29, 24, 46, 14);
		frmConversorMonedas.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("D\u00F3lares");
		label2.setBounds(29, 59, 46, 14);
		frmConversorMonedas.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Libras");
		label3.setBounds(29, 84, 46, 14);
		frmConversorMonedas.getContentPane().add(label3);
		
		caja1 = new JTextField();
		caja1.setBounds(85, 21, 86, 20);
		frmConversorMonedas.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		JLabel label4 = new JLabel("            ");
		label4.setBackground(Color.LIGHT_GRAY);
		label4.setBounds(85, 56, 76, 20);
		frmConversorMonedas.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("  ");
		label5.setBounds(85, 81, 76, 20);
		frmConversorMonedas.getContentPane().add(label5);
		
		JButton boton = new JButton("Convertir");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   double dolares=Double.parseDouble(caja1.getText())*1.14;
			       double libras=Double.parseDouble(caja1.getText())*0.89;
			       
			       label4.setText(Double.toString(dolares));
			       label5.setText(Double.toString(libras));
			}
		});
		boton.setBounds(85, 130, 89, 23);
		frmConversorMonedas.getContentPane().add(boton);
	}
}
