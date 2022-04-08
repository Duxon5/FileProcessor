package layout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import entity.FolderPath;
import interfaces.Panel;
import util.UtilPreferences;

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
	
	private Thread threadFolder1 = new Thread();
	private Thread threadFolder2 = new Thread();
	private Thread threadFolder3 = new Thread();
	
	int timerFolder1 = 10;
	int timerFolder2 = 10;
	int timerFolder3 = 10;
	
	List<FolderPath> folderPaths = new ArrayList<>();
	
	ProcessorInterface processorInterface = new ProcessorInterface();
	
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
		//TODO: Temp
		fillFolderPaths();
		
		// Start with all processes
		stopProcessAllFolders();
		
		
		chooseFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseFolder_addActionListener(e);
            }
		});
		
		startAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startAllFolders_addActionListener(e);
            }
		});
		
		startFolder1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startFolder1_addActionListener(e);
            }
		});
		
		startFolder2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startFolder2_addActionListener(e);
            }
		});
		
		startFolder3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startFolder3_addActionListener(e);
            }
		});
		
		stopAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopAllFolders_addActionListener(e);
            }
		});
		
		stopFolder1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopFolder1_addActionListener(e);
            }
		});
		
		stopFolder2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopFolder2_addActionListener(e);
            }
		});
		
		stopFolder3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopFolder3_addActionListener(e);
            }
		});
		
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
	
	private void chooseFolder_addActionListener(ActionEvent e) {
		openChooseFolder();
	}

	private void startAllFolders_addActionListener(ActionEvent e) {
		startProcessAllFolders();
	}
	
	private void startFolder1_addActionListener(ActionEvent e) {
		try {
			startProcessFolder1();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	private void startFolder2_addActionListener(ActionEvent e) {
		try {
			startProcessFolder2();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	private void startFolder3_addActionListener(ActionEvent e) {
		try {
			startProcessFolder3();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	private void stopAllFolders_addActionListener(ActionEvent e) {
		stopProcessAllFolders();
	}
	
	private void stopFolder1_addActionListener(ActionEvent e) {
		stopProcessFolder1();
	}
	
	private void stopFolder2_addActionListener(ActionEvent e) {
		stopProcessFolder2();
	}
	
	private void stopFolder3_addActionListener(ActionEvent e) {
		stopProcessFolder3();
	}
	
	private void openChooseFolder() {
		ChooseFolder frmChooseFolder = new ChooseFolder();
		frmChooseFolder.initialize();
	}
	
	
	private void startProcessAllFolders() {
		try {
			// If all folders are valid
			if(UtilPreferences.isAllFolderExists()) {
				startProcessFolder1();
				startProcessFolder2();
				startProcessFolder3();
			} else {
				JOptionPane.showMessageDialog(this, "It's needed to define all folders before starting!", "Choose Folder", JOptionPane.INFORMATION_MESSAGE);
				openChooseFolder(); 
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void startProcessFolder1() throws InterruptedException {
		
		// If all folders are valid
		if(UtilPreferences.isFolderExistsByName("Folder1")) {
			processStatusFolder1.setText("Status: Started");
			processStatusFolder1.setBackground(Color.GREEN);
			
			processTimerFolder1.setText("Starting...");
			
			if(threadFolder1.isAlive()) {
				timerFolder1 = 10;
				threadFolder1.stop();
			}
			
			threadFolder1 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
						while (true) {
							processTimerFolder1.setText(intToTime(timerFolder1));
							timerFolder1--;
							Thread.sleep(1000);
							if(timerFolder1 == -1) {
								timerFolder1 = 10;
							} // If time is 0, it means that it will start processing 
							else if(timerFolder1 == 0) {
								if(UtilPreferences.isFolderExistsByName("Folder2")) {
									
								} else {
									processTimerFolder1.setText(intToTime(timerFolder1));
									Thread.sleep(1000);
									stopProcessFolder1();
								}
								
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			threadFolder1.start();
		} else {
			stopProcessFolder1();
			JOptionPane.showMessageDialog(this, "Path from Folder 1 not found. Define the path before starting!", "Choose Folder", JOptionPane.INFORMATION_MESSAGE);
			openChooseFolder();
		}
	}
	
	private void startProcessFolder2() throws InterruptedException {
		
		// If folder is valid
		if(UtilPreferences.isFolderExistsByName("Folder2")) {
			processStatusFolder2.setText("Status: Started");
			processStatusFolder2.setBackground(Color.GREEN);
			
			processTimerFolder2.setText("Starting...");
			
			if(threadFolder2.isAlive()) {
				timerFolder2 = 10;
				threadFolder2.stop();
			}
			
			threadFolder2 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
						while (true) {
							processTimerFolder2.setText(intToTime(timerFolder2));
							timerFolder2--;
							Thread.sleep(1000);
							if(timerFolder2 == -1) {
								timerFolder2 = 10;
							} // If time is 0, it means that it will start processing 
							else if(timerFolder2 == 0) {
								if(UtilPreferences.isFolderExistsByName("Folder2")) {
									
								} else {
									processTimerFolder2.setText(intToTime(timerFolder2));
									Thread.sleep(1000);
									stopProcessFolder2();
								}
								
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			threadFolder2.start();
		} else {
			stopProcessFolder2();
			JOptionPane.showMessageDialog(this, "Path from Folder 2 not found. Define the path before starting!", "Choose Folder", JOptionPane.INFORMATION_MESSAGE);
			openChooseFolder();
		}
	}
	
	private void startProcessFolder3() throws InterruptedException {
		
		// If all folders are valid
		if(UtilPreferences.isFolderExistsByName("Folder3")) {
			processStatusFolder3.setText("Status: Started");
			processStatusFolder3.setBackground(Color.GREEN);
			
			processTimerFolder3.setText("Starting...");
			
			if(threadFolder3.isAlive()) {
				timerFolder3 = 10;
				threadFolder3.stop();
			}
			
			threadFolder3 = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
						while (true) {
							processTimerFolder3.setText(intToTime(timerFolder3));
							timerFolder3--;
							Thread.sleep(1000);
							if(timerFolder3 == -1) {
								timerFolder3 = 10;
							} // If time is 0, it means that it will start processing 
							else if(timerFolder3 == 0) {
								if(UtilPreferences.isFolderExistsByName("Folder3")) {
									
								} else {
									processTimerFolder3.setText(intToTime(timerFolder3));
									Thread.sleep(1000);
									stopProcessFolder3();
								}
								
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			threadFolder3.start();
		} else {
			stopProcessFolder3();
			JOptionPane.showMessageDialog(this, "Path from Folder 3 not found. Define the path before starting!", "Choose Folder", JOptionPane.INFORMATION_MESSAGE);
			openChooseFolder();
		}
	}
	
	private void stopProcessAllFolders() {
		stopProcessFolder1();
		stopProcessFolder2();
		stopProcessFolder3();
	}
	
	private void stopProcessFolder1() {
		processStatusFolder1.setText("Status: Stopped");
		processStatusFolder1.setBackground(Color.RED);
		processTimerFolder1.setText("99:99:99");
		timerFolder1 = 10;
		threadFolder1.stop();
	}
	
	private void stopProcessFolder2() {
		processStatusFolder2.setText("Status: Stopped");
		processStatusFolder2.setBackground(Color.RED);
		processTimerFolder2.setText("99:99:99");
		timerFolder2 = 10;
		threadFolder2.stop();
	}
	
	private void stopProcessFolder3() {
		processStatusFolder3.setText("Status: Stopped");
		processStatusFolder3.setBackground(Color.RED);
		processTimerFolder3.setText("99:99:99");
		timerFolder3 = 10;
		threadFolder3.stop();
	}

	private String intToTime(int iTime) {
		String sTimeAux = Integer.toString(iTime);
		sTimeAux = (sTimeAux.length() == 1) ? "0"+sTimeAux : sTimeAux;
		return "00:00:"+sTimeAux;
	}
	
	private void fillFolderPaths() {
		folderPaths.add(new FolderPath("Folder 1", "..\\Files\\Folder1"));
		folderPaths.add(new FolderPath("Folder 2", "..\\Files\\Folder2"));
		folderPaths.add(new FolderPath("Folder 3", "..\\Files\\Folder3"));
	}
}