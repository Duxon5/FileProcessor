package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import interfaces.PanelFolder;

public class FolderOnePanel extends JPanel implements PanelFolder {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	
	public FolderOnePanel() {
		initialize();
	}

	@Override
	public JPanel initialize() {
		
		initializeComponents();
		defineSettingsPanel();
		setAllTexts();
		setAllBackgrounds();
		setAllForegrounds();
		setAllFonts();
		setAllBounds();
		addAllComponentsToPanel();
		
		textArea.append("==================================================================\n");
		textArea.append("==========================LOG - FOLDER 1==========================\n");
		textArea.append("==================================================================\n");
				
		return panel;
	}

	@Override
	public void initializeComponents() {
		panel = new JPanel();
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}

	@Override
	public void defineSettingsPanel() {
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);			
	}

	@Override
	public void setAllTexts() {
		textArea.setEditable(false);
	}

	@Override
	public void setAllBackgrounds() {
		textArea.setBackground(Color.WHITE);		
	}

	@Override
	public void setAllForegrounds() {
		textArea.setForeground(Color.BLACK);		
	}

	@Override
	public void setAllFonts() {
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
	}

	@Override
	public void setAllBounds() {
		scrollPane.setBounds(5, 5, 557, 276);
	}

	@Override
	public void addAllComponentsToPanel() {
		panel.add(scrollPane);
	}
	
	public void appendToTextArea(String fileContent) {
		textArea.append(fileContent);
	}
	
}
