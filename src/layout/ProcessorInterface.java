package layout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import constants.Tab;

public class ProcessorInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private JSeparator separator;
	private JLabel processStatus;
	private JLabel processTimer;
	private Border processBorder;
	private JTabbedPane tabGroup;
	private SettingsPanel settingsPanel;
	private FolderOnePanel folderOnePanel;
	private FolderTwoPanel folderTwoPanel;
	private FolderThreePanel folderThreePanel;
	private Tab tab;
	
	public ProcessorInterface() {
		
	}
	
	public void initialize() {
		
		initializeComponents();
		defineSettingsFrame();
		setAllTexts();
		setAllBackgrounds();
		setAllForegrounds();
		setAllBorders();
		setAllFonts();
		setAllOpaques();
		setAllAlignments();
		setAllBounds();
		createTabs();
		addAllComponentsToFrame();
		
		tabGroup.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	tabGroup_addChangeListener(e);
	        }
	    });
		
		

	}

	private void initializeComponents() {
		frame = new JFrame();
		separator = new JSeparator();
		processStatus = new JLabel();
		processTimer = new JLabel();
		processBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		tabGroup = new JTabbedPane();
		settingsPanel = new SettingsPanel();
		folderOnePanel = new FolderOnePanel();
		folderTwoPanel = new FolderTwoPanel();
		folderThreePanel = new FolderThreePanel();
		
		tab = new Tab();
	}
	
	private void defineSettingsFrame() {
		frame.setTitle("File Processor");
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	private void setAllTexts() {
		processStatus.setText("Status: Stopped");
		processTimer.setText("00:00:05");
	}
	
	private void setAllBackgrounds() {
		processStatus.setBackground(Color.WHITE);
		processTimer.setBackground(Color.WHITE);
	}
	
	private void setAllForegrounds() {
		processStatus.setForeground(Color.BLACK);
		processTimer.setForeground(Color.BLACK);
	}
	
	private void setAllBorders() {
		processStatus.setBorder(processBorder);
		processTimer.setBorder(processBorder);
	}
	
	private void setAllFonts() {
		processStatus.setFont(new Font("Arial", Font.PLAIN, 14));
		processTimer.setFont(new Font("Arial", Font.PLAIN, 14));
		
		processStatus.setFont(processStatus.getFont().deriveFont(Font.BOLD));
		processTimer.setFont(processTimer.getFont().deriveFont(Font.BOLD));
	}
	
	private void setAllOpaques() {
		processStatus.setOpaque(true);
		processTimer.setOpaque(true);
	}

	private void setAllAlignments() {
		processStatus.setHorizontalAlignment(SwingConstants.CENTER);
		processTimer.setHorizontalAlignment(SwingConstants.CENTER);
		
		processStatus.setVerticalAlignment(SwingConstants.CENTER);
		processTimer.setVerticalAlignment(SwingConstants.CENTER);
	}

	private void setAllBounds() {
		separator.setBounds(5, 320, 573, 10);
		processStatus.setBounds(5, 325, 150, 30);
		processTimer.setBounds(498, 325, 80, 30);
		tabGroup.setBounds(5, 0, 573, 315);
	}
	
	private void createTabs() {
		tabGroup.add("Settings", settingsPanel.initialize());
		tabGroup.add("Folder 1", folderOnePanel.initialize());
		tabGroup.add("Folder 2", folderTwoPanel.initialize());
		tabGroup.add("Folder 3", folderThreePanel.initialize());

		if(tabGroup.getSelectedIndex() == tab.SETTINGS) {
			processStatus.setVisible(false);
			processTimer.setVisible(false);
		}
		
	}
	
	private void addAllComponentsToFrame() {
		frame.add(separator);
		frame.add(processStatus);
		frame.add(processTimer);
		frame.add(tabGroup);
	}

	private void tabGroup_addChangeListener(ChangeEvent e) {
		if(tabGroup.getSelectedIndex() == tab.SETTINGS) {
			processStatus.setVisible(false);
			processTimer.setVisible(false);
		} else {
			processStatus.setVisible(true);
			processTimer.setVisible(true);
		}
	}
	
	// TODO: Está dando log catch. Avaliar a criação de 1 status e timer pra cada folder.
	public void startProcess() {
//		processStatus.setText("Status: Started");
//		processTimer.setText("Status: 00:00:04");
	}
	
}
