package layout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import interfaces.Panel;

public class SettingsPanel extends JPanel implements Panel {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private Border processBorder;
	
	private JLabel defaultSettings;
	private JButton startAll;
	private JButton stopAll;
	private JButton chooseFolder;
	private JSeparator sepDefaultSettings;
	
	private JLabel folder1Settings;
	private JLabel processStatusFolder1;
	private JLabel processTimerFolder1;
	private JButton startFolder1;
	private JButton stopFolder1;
	private JSeparator sepFolder1;
	
	private JLabel folder2Settings;
	private JLabel processStatusFolder2;
	private JLabel processTimerFolder2;
	private JButton startFolder2;
	private JButton stopFolder2;
	private JSeparator sepFolder2;
	
	private JLabel folder3Settings;
	private JLabel processStatusFolder3;
	private JLabel processTimerFolder3;
	private JButton startFolder3;
	private JButton stopFolder3;
	
	
	public SettingsPanel() {
		initialize();
	}

	public JPanel initialize() {
		
		initializeComponents();
		defineSettingsPanel();
		setAllTexts();
		setAllBackgrounds();
		setAllForegrounds();
		setAllBorders();
		setAllFonts();
		setAllOpaques();
		setAllAlignments();
		setAllBounds();
		addAllComponentsToPanel();
		
		return panel;
	}

	@Override
	public void initializeComponents() {
		panel = new JPanel();
		processBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		defaultSettings = new JLabel();
		startAll = new JButton();
		stopAll = new JButton();
		chooseFolder = new JButton();
		sepDefaultSettings = new JSeparator();
		
		folder1Settings = new JLabel();
		processStatusFolder1 = new JLabel();
		processTimerFolder1 = new JLabel();
		startFolder1 = new JButton();
		stopFolder1 = new JButton();
		sepFolder1 = new JSeparator();
		
		folder2Settings = new JLabel();
		processStatusFolder2 = new JLabel();
		processTimerFolder2 = new JLabel();
		startFolder2 = new JButton();
		stopFolder2 = new JButton();
		sepFolder2 = new JSeparator();
		
		folder3Settings = new JLabel();
		processStatusFolder3 = new JLabel();
		processTimerFolder3 = new JLabel();
		startFolder3 = new JButton();
		stopFolder3 = new JButton();
	}

	@Override
	public void defineSettingsPanel() {
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);	
	}

	@Override
	public void setAllTexts() {
		defaultSettings.setText("Default Settings");
		startAll.setText("Start All");
		stopAll.setText("Stop All");
		chooseFolder.setText("Choose Folder");
		
		folder1Settings.setText("Folder 1 Settings");
		processStatusFolder1.setText("Status: Stopped");
		processTimerFolder1.setText("00:00:05");
		startFolder1.setText("Start Folder 1");
		stopFolder1.setText("Stop Folder 1");
		
		folder2Settings.setText("Folder 2 Settings");
		processStatusFolder2.setText("Status: Stopped");
		processTimerFolder2.setText("00:00:05");
		startFolder2.setText("Start Folder 2");
		stopFolder2.setText("Stop Folder 2");
		
		folder3Settings.setText("Folder 3 Settings");
		processStatusFolder3.setText("Status: Stopped");
		processTimerFolder3.setText("00:00:05");
		startFolder3.setText("Start Folder 3");
		stopFolder3.setText("Stop Folder 3");	
	}

	@Override
	public void setAllBackgrounds() {
		defaultSettings.setBackground(Color.WHITE);
		startAll.setBackground(Color.WHITE);
		stopAll.setBackground(Color.WHITE);
		chooseFolder.setBackground(Color.WHITE);
		
		folder1Settings.setBackground(Color.WHITE);
		processStatusFolder1.setBackground(Color.WHITE);
		processTimerFolder1.setBackground(Color.WHITE);
		startFolder1.setBackground(Color.WHITE);
		stopFolder1.setBackground(Color.WHITE);
		
		folder2Settings.setBackground(Color.WHITE);
		processStatusFolder2.setBackground(Color.WHITE);
		processTimerFolder2.setBackground(Color.WHITE);
		startFolder2.setBackground(Color.WHITE);
		stopFolder2.setBackground(Color.WHITE);
		
		folder3Settings.setBackground(Color.WHITE);
		processStatusFolder3.setBackground(Color.WHITE);
		processTimerFolder3.setBackground(Color.WHITE);
		startFolder3.setBackground(Color.WHITE);
		stopFolder3.setBackground(Color.WHITE);
	}

	@Override
	public void setAllForegrounds() {
		defaultSettings.setForeground(Color.BLACK);
		startAll.setForeground(Color.BLACK);
		stopAll.setForeground(Color.BLACK);
		chooseFolder.setForeground(Color.BLACK);
		
		folder1Settings.setForeground(Color.BLACK);
		processStatusFolder1.setForeground(Color.BLACK);
		processTimerFolder1.setForeground(Color.BLACK);
		startFolder1.setForeground(Color.BLACK);
		stopFolder1.setForeground(Color.BLACK);
		
		folder2Settings.setForeground(Color.BLACK);
		processStatusFolder2.setForeground(Color.BLACK);
		processTimerFolder2.setForeground(Color.BLACK);
		startFolder2.setForeground(Color.BLACK);
		stopFolder2.setForeground(Color.BLACK);
		
		folder3Settings.setForeground(Color.BLACK);
		processStatusFolder3.setForeground(Color.BLACK);
		processTimerFolder3.setForeground(Color.BLACK);
		startFolder3.setForeground(Color.BLACK);
		stopFolder3.setForeground(Color.BLACK);
	}

	@Override
	public void setAllBorders() {
		processStatusFolder1.setBorder(processBorder);
		processTimerFolder1.setBorder(processBorder);
		
		processStatusFolder2.setBorder(processBorder);
		processTimerFolder2.setBorder(processBorder);
		
		processStatusFolder3.setBorder(processBorder);
		processTimerFolder3.setBorder(processBorder);
	}

	@Override
	public void setAllFonts() {
		//Titles
		defaultSettings.setFont(new Font("Arial", Font.PLAIN, 16));
		folder1Settings.setFont(new Font("Arial", Font.PLAIN, 16));
		folder2Settings.setFont(new Font("Arial", Font.PLAIN, 16));
		folder3Settings.setFont(new Font("Arial", Font.PLAIN, 16));
		defaultSettings.setFont(defaultSettings.getFont().deriveFont(Font.BOLD));
		folder1Settings.setFont(folder1Settings.getFont().deriveFont(Font.BOLD));
		folder2Settings.setFont(folder2Settings.getFont().deriveFont(Font.BOLD));
		folder3Settings.setFont(folder3Settings.getFont().deriveFont(Font.BOLD));
		
		// Normal Texts
		processStatusFolder1.setFont(new Font("Arial", Font.PLAIN, 14));
		processTimerFolder1.setFont(new Font("Arial", Font.PLAIN, 14));
		processStatusFolder2.setFont(new Font("Arial", Font.PLAIN, 14));
		processTimerFolder2.setFont(new Font("Arial", Font.PLAIN, 14));
		processStatusFolder3.setFont(new Font("Arial", Font.PLAIN, 14));
		processTimerFolder3.setFont(new Font("Arial", Font.PLAIN, 14));
		processStatusFolder1.setFont(processStatusFolder1.getFont().deriveFont(Font.BOLD));
		processTimerFolder1.setFont(processTimerFolder1.getFont().deriveFont(Font.BOLD));
		processStatusFolder2.setFont(processStatusFolder2.getFont().deriveFont(Font.BOLD));
		processTimerFolder2.setFont(processTimerFolder2.getFont().deriveFont(Font.BOLD));
		processStatusFolder3.setFont(processStatusFolder3.getFont().deriveFont(Font.BOLD));
		processTimerFolder3.setFont(processTimerFolder3.getFont().deriveFont(Font.BOLD));
		
		// Buttons
		startAll.setFont(new Font("Arial", Font.PLAIN, 18));
		stopAll.setFont(new Font("Arial", Font.PLAIN, 18));
		chooseFolder.setFont(new Font("Arial", Font.PLAIN, 13));
		startFolder1.setFont(new Font("Arial", Font.PLAIN, 14));
		stopFolder1.setFont(new Font("Arial", Font.PLAIN, 14));
		startFolder2.setFont(new Font("Arial", Font.PLAIN, 14));
		stopFolder2.setFont(new Font("Arial", Font.PLAIN, 14));
		startFolder3.setFont(new Font("Arial", Font.PLAIN, 14));
		stopFolder3.setFont(new Font("Arial", Font.PLAIN, 14));
		startAll.setFont(startAll.getFont().deriveFont(Font.BOLD));
		stopAll.setFont(stopAll.getFont().deriveFont(Font.BOLD));
		chooseFolder.setFont(chooseFolder.getFont().deriveFont(Font.BOLD));
		startFolder1.setFont(startFolder1.getFont().deriveFont(Font.BOLD));
		stopFolder1.setFont(stopFolder1.getFont().deriveFont(Font.BOLD));
		startFolder2.setFont(startFolder2.getFont().deriveFont(Font.BOLD));
		stopFolder2.setFont(stopFolder2.getFont().deriveFont(Font.BOLD));
		startFolder3.setFont(startFolder3.getFont().deriveFont(Font.BOLD));
		stopFolder3.setFont(stopFolder3.getFont().deriveFont(Font.BOLD));
	}

	@Override
	public void setAllOpaques() {
		defaultSettings.setOpaque(true);
		
		folder1Settings.setOpaque(true);
		processStatusFolder1.setOpaque(true);
		processTimerFolder1.setOpaque(true);
		
		folder2Settings.setOpaque(true);
		processStatusFolder2.setOpaque(true);
		processTimerFolder2.setOpaque(true);
		
		folder3Settings.setOpaque(true);
		processStatusFolder3.setOpaque(true);
		processTimerFolder3.setOpaque(true);
	}

	@Override
	public void setAllAlignments() {
		//Horizontal
		defaultSettings.setHorizontalAlignment(SwingConstants.CENTER);
		
		folder1Settings.setHorizontalAlignment(SwingConstants.CENTER);
		processStatusFolder1.setHorizontalAlignment(SwingConstants.CENTER);
		processTimerFolder1.setHorizontalAlignment(SwingConstants.CENTER);
		
		folder2Settings.setHorizontalAlignment(SwingConstants.CENTER);
		processStatusFolder2.setHorizontalAlignment(SwingConstants.CENTER);
		processTimerFolder2.setHorizontalAlignment(SwingConstants.CENTER);
		
		folder3Settings.setHorizontalAlignment(SwingConstants.CENTER);
		processStatusFolder3.setHorizontalAlignment(SwingConstants.CENTER);
		processTimerFolder3.setHorizontalAlignment(SwingConstants.CENTER);

		//Vertical
		defaultSettings.setVerticalAlignment(SwingConstants.CENTER);
		
		folder1Settings.setVerticalAlignment(SwingConstants.CENTER);
		processStatusFolder1.setVerticalAlignment(SwingConstants.CENTER);
		processTimerFolder1.setVerticalAlignment(SwingConstants.CENTER);
		
		folder2Settings.setVerticalAlignment(SwingConstants.CENTER);
		processStatusFolder2.setVerticalAlignment(SwingConstants.CENTER);
		processTimerFolder2.setVerticalAlignment(SwingConstants.CENTER);
		
		folder3Settings.setVerticalAlignment(SwingConstants.CENTER);
		processStatusFolder3.setVerticalAlignment(SwingConstants.CENTER);
		processTimerFolder3.setVerticalAlignment(SwingConstants.CENTER);
		
	}

	@Override
	public void setAllBounds() {
		int titleWidth = 130;
		int titleHeight = 20;
		int buttonWidth = 130;
		int buttonHeight = 30;
		int processStatusWidth = 150;
		int processTimerWidth = 80;
		int processHeight = 30;
		int separatorWidth = 556;
		int separatorHeight = 3;

		int spaceX = 0;
		int spaceBetweenX = 5;
		
		int spaceY = 0;
		int sameBlockY = 5;
		int skipBlockY = 10;
		
		// Default Settings
		spaceX += 5;
		spaceY += 5;
		defaultSettings.setBounds(spaceX, spaceY, titleWidth, titleHeight);
		spaceY += titleHeight + sameBlockY;
		startAll.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		stopAll.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		chooseFolder.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		
		// Separator
		spaceX = 5;
		spaceY += buttonHeight + 5;
		sepDefaultSettings.setBounds(spaceX, spaceY, separatorWidth, separatorHeight);
		
		// Folder 1 Settings
		spaceY += skipBlockY;
		folder1Settings.setBounds(spaceX, spaceY, titleWidth, titleHeight);
		spaceY += titleHeight + sameBlockY;
		startFolder1.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		stopFolder1.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		processStatusFolder1.setBounds(spaceX, spaceY, processStatusWidth, processHeight);
		spaceX += processStatusWidth + spaceBetweenX;
		processTimerFolder1.setBounds(spaceX, spaceY, processTimerWidth, processHeight);
		
		// Separator
		spaceX = 5;
		spaceY += buttonHeight + 5;
		sepFolder1.setBounds(spaceX, spaceY, separatorWidth, separatorHeight);
		
		// Folder 1 Settings
		spaceY += skipBlockY;
		folder2Settings.setBounds(spaceX, spaceY, titleWidth, titleHeight);
		spaceY += titleHeight + sameBlockY;
		startFolder2.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		stopFolder2.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		processStatusFolder2.setBounds(spaceX, spaceY, processStatusWidth, processHeight);
		spaceX += processStatusWidth + spaceBetweenX;
		processTimerFolder2.setBounds(spaceX, spaceY, processTimerWidth, processHeight);
		
		// Separator
		spaceX = 5;
		spaceY += buttonHeight + 5;
		sepFolder2.setBounds(spaceX, spaceY, separatorWidth, separatorHeight);
		
		// Folder 1 Settings
		spaceY += skipBlockY;
		folder3Settings.setBounds(spaceX, spaceY, titleWidth, titleHeight);
		spaceY += titleHeight + sameBlockY;
		startFolder3.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		stopFolder3.setBounds(spaceX, spaceY, buttonWidth, buttonHeight);
		spaceX += buttonWidth + spaceBetweenX;
		processStatusFolder3.setBounds(spaceX, spaceY, processStatusWidth, processHeight);
		spaceX += processStatusWidth + spaceBetweenX;
		processTimerFolder3.setBounds(spaceX, spaceY, processTimerWidth, processHeight);
	}

	@Override
	public void addAllComponentsToPanel() {
		panel.add(defaultSettings);
		panel.add(startAll);
		panel.add(stopAll);
		panel.add(chooseFolder);
		panel.add(sepDefaultSettings);

		panel.add(folder1Settings);
		panel.add(processStatusFolder1);
		panel.add(processTimerFolder1);
		panel.add(startFolder1);
		panel.add(stopFolder1);
		panel.add(sepFolder1);

		panel.add(folder2Settings);
		panel.add(processStatusFolder2);
		panel.add(processTimerFolder2);
		panel.add(startFolder2);
		panel.add(stopFolder2);
		panel.add(sepFolder2);

		panel.add(folder3Settings);
		panel.add(processStatusFolder3);
		panel.add(processTimerFolder3);
		panel.add(startFolder3);
		panel.add(stopFolder3);		
	}
	
}
