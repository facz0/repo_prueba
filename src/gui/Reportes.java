package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Reportes extends JPanel {

	private static final long serialVersionUID = 1L;
	private VentanaPrincipal ventanaPrincipal;

	/**
	 * Create the panel.
	 */
	public Reportes(VentanaPrincipal principal) {
		this.ventanaPrincipal = principal;
		setPreferredSize(new java.awt.Dimension(1000, 620));
		setLayout(null);
		
		JButton btnNewButton = new JButton("Procesar");
		btnNewButton.setBounds(127, 65, 144, 34);
		add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(58, 140, 416, 190);
		add(textArea);
	}
}
