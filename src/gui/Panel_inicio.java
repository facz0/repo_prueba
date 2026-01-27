package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Panel_inicio extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private VentanaPrincipal ventanaPrincipal;
	/**
	 * Create the panel.
	 */
	public Panel_inicio(VentanaPrincipal principal) {
		//Llamamos al JFrame
		this.ventanaPrincipal = principal;
		setPreferredSize(new java.awt.Dimension(1280, 720));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al Banco x");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(512, 32, 302, 76);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(324, 138, 747, 472);
		add(panel);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
