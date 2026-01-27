package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Declarar los paneles como atributos
	private Panel_inicio panel_inicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel_inicio = new Panel_inicio(this);
		panel_inicio.setPreferredSize(new java.awt.Dimension(1280, 720));
		setContentPane(panel_inicio);
		pack();
		setLocationRelativeTo(null);
		Panel_inicio();
	}
	
	public void Panel_inicio() {
		setContentPane(panel_inicio);
		revalidate();
		repaint();
	}

}
