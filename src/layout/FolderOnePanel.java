package layout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FolderOnePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JButton btnTeste;
	
	public FolderOnePanel() {
		initialize();
	}
	
	public void initialize() {
		
		initializeComponents();
		
		btnTeste.setBounds(20,80,195,40);
		btnTeste.setBackground(Color.WHITE);
		btnTeste.setFont(new Font("Arial", Font.PLAIN, 14));
	
		panel.add(btnTeste);
	}

	private void initializeComponents() {
		panel = new JPanel();
		btnTeste = new JButton();
	}
	
}
