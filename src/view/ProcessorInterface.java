package view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class ProcessorInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private JTabbedPane tabGroup;
	private SettingsPanel settingsPanel;
	private FolderOnePanel folderOnePanel;
	private FolderTwoPanel folderTwoPanel;
	private FolderThreePanel folderThreePanel;
	
	public ProcessorInterface() {
		
	}
	
	public void initialize() {
		initializeComponents();
		defineSettingsFrame();
		setAllBounds();
		createTabs();
		addAllComponentsToFrame();

	}

	private void initializeComponents() {
		frame = new JFrame();
		tabGroup = new JTabbedPane();
		settingsPanel = new SettingsPanel();
		folderOnePanel = new FolderOnePanel();
		folderTwoPanel = new FolderTwoPanel();
		folderThreePanel = new FolderThreePanel();
	}
	
	private void defineSettingsFrame() {
		frame.setTitle("File Processor");
		frame.setSize(600, 360);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void setAllBounds() {
		tabGroup.setBounds(5, 0, 573, 315);
	}
	
	private void createTabs() {
		tabGroup.add("Settings", settingsPanel.initialize());
		tabGroup.add("Folder 1", folderOnePanel.initialize());
		tabGroup.add("Folder 2", folderTwoPanel.initialize());
		tabGroup.add("Folder 3", folderThreePanel.initialize());
		
		// Send the panels to setting panel after build the screen
		settingsPanel.getPanelFromFolderTabs(folderOnePanel, folderTwoPanel, folderThreePanel);
	}
	
	private void addAllComponentsToFrame() {
		frame.add(tabGroup);
	}
	
}
