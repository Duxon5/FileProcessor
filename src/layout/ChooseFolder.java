package layout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entity.FolderPath;
import interfaces.Panel;
import util.UtilPreferences;

public class ChooseFolder extends JFrame implements Panel {
	
	private static final long serialVersionUID = 1L;

	private JFrame frame;
	
	private JLabel folder1;
	private JLabel folder2;
	private JLabel folder3;
	
	private JTextField pathFolder1;
	private JTextField pathFolder2;
	private JTextField pathFolder3;
	
	private JSeparator separator;
	
	private JButton btnSave;
	private JButton btnCancel;
	
	public ChooseFolder() {}
	
	public void initialize() {
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
		
		try {
			loadPreferences();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSave_addActionListener(e);
            }
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
            }
		});
	}

	@Override
	public void initializeComponents() {
		frame = new JFrame();
		
		folder1 = new JLabel();
		folder2 = new JLabel();
		folder3 = new JLabel();
		
		pathFolder1 = new JTextField();
		pathFolder2 = new JTextField();
		pathFolder3 = new JTextField();
		
		separator = new JSeparator();
		
		btnSave = new JButton();
		btnCancel = new JButton();
	}

	@Override
	public void defineSettingsPanel() {
		frame.setTitle("Choose Folder");
		frame.setSize(500,175);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void setAllTexts() {
		folder1.setText("Folder 1:");
		folder2.setText("Folder 2:");
		folder3.setText("Folder 3:");
		
		btnSave.setText("Save");
		btnCancel.setText("Cancel");
	}

	@Override
	public void setAllBackgrounds() {}

	@Override
	public void setAllForegrounds() {
		folder1.setForeground(Color.BLACK);
		folder2.setForeground(Color.BLACK);
		folder3.setForeground(Color.BLACK);
	}

	@Override
	public void setAllBorders() {}

	@Override
	public void setAllFonts() {
		folder1.setFont(new Font("Arial", Font.PLAIN, 16));
		folder2.setFont(new Font("Arial", Font.PLAIN, 16));
		folder3.setFont(new Font("Arial", Font.PLAIN, 16));
		
		pathFolder1.setFont(new Font("Arial", Font.PLAIN, 16));
		pathFolder2.setFont(new Font("Arial", Font.PLAIN, 16));
		pathFolder3.setFont(new Font("Arial", Font.PLAIN, 16));
		
		btnSave.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 16));
		
		folder1.setFont(folder1.getFont().deriveFont(Font.BOLD));
		folder2.setFont(folder2.getFont().deriveFont(Font.BOLD));
		folder3.setFont(folder3.getFont().deriveFont(Font.BOLD));
		
		btnSave.setFont(btnSave.getFont().deriveFont(Font.BOLD));
		btnCancel.setFont(btnCancel.getFont().deriveFont(Font.BOLD));
	}

	@Override
	public void setAllOpaques() {
		folder1.setOpaque(true);
		folder2.setOpaque(true);
		folder3.setOpaque(true);
		
		btnSave.setOpaque(true);
		btnCancel.setOpaque(true);		
	}

	@Override
	public void setAllAlignments() {
		//Horizontal
		folder1.setHorizontalAlignment(SwingConstants.CENTER);
		folder2.setHorizontalAlignment(SwingConstants.CENTER);
		folder3.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnSave.setHorizontalAlignment(SwingConstants.CENTER);
		btnCancel.setHorizontalAlignment(SwingConstants.CENTER);		
		
		//Vertical
		folder1.setVerticalAlignment(SwingConstants.CENTER);
		folder2.setVerticalAlignment(SwingConstants.CENTER);
		folder3.setVerticalAlignment(SwingConstants.CENTER);
		
		btnSave.setVerticalAlignment(SwingConstants.CENTER);
		btnCancel.setVerticalAlignment(SwingConstants.CENTER);		
	}

	@Override
	public void setAllBounds() {
		int labelWidth = 100;
		int labelHeight = 20;
		int tfWidth = 368;
		int tfHeight = 20;
		int separatorWidth = 473;
		int separatorHeight = 3;
		int btnWidth = 90;
		int btnHeight = 30;
		
		int spaceX = 0;
		int spaceBetweenX = 5;
		
		int spaceY = 0;
		int skipBlockY = 10;
		int skipBlockSepY = 5;
		
		spaceX += 5;
		spaceY += 5;
		
		folder1.setBounds(spaceX,spaceY,labelWidth,labelHeight);
		spaceX += labelWidth + spaceBetweenX;
		pathFolder1.setBounds(spaceX,spaceY,tfWidth,tfHeight);
		
		spaceX = 5;
		spaceY += labelHeight + skipBlockY;
		folder2.setBounds(spaceX,spaceY,labelWidth,labelHeight);
		spaceX += labelWidth + spaceBetweenX;
		pathFolder2.setBounds(spaceX,spaceY,tfWidth,tfHeight);
		
		spaceX = 5;
		spaceY += labelHeight + skipBlockY;
		folder3.setBounds(spaceX,spaceY,labelWidth,labelHeight);
		spaceX += labelWidth + spaceBetweenX;
		pathFolder3.setBounds(spaceX,spaceY,tfWidth,tfHeight);
		
		spaceX = 5;
		spaceY += labelHeight + skipBlockSepY;
		separator.setBounds(spaceX,spaceY,separatorWidth,separatorHeight);
		
		spaceX = 293;
		spaceY += separatorHeight + skipBlockSepY;
		btnSave.setBounds(spaceX, spaceY, btnWidth, btnHeight);
		spaceX += btnWidth + spaceBetweenX;
		btnCancel.setBounds(spaceX, spaceY, btnWidth, btnHeight);
	}

	@Override
	public void addAllComponentsToPanel() {
		frame.add(folder1);
		frame.add(folder2);
		frame.add(folder3);
		
		frame.add(pathFolder1);
		frame.add(pathFolder2);
		frame.add(pathFolder3);
		
		frame.add(separator);
		
		frame.add(btnSave);
		frame.add(btnCancel);
	}
	
	public void loadPreferences() throws IOException {
		List<FolderPath> foldersChosen = UtilPreferences.getListOfPaths();
		
		// If the folders are already chosen
		if(foldersChosen != null && !foldersChosen.isEmpty()) {
			if(foldersChosen.size() == 3) {
				pathFolder1.setText(foldersChosen.get(0).getPath());
				pathFolder2.setText(foldersChosen.get(1).getPath());
				pathFolder3.setText(foldersChosen.get(2).getPath());
			}
		}
	}

	private void btnSave_addActionListener(ActionEvent e) {
		savePreferences();
	}

	private void savePreferences() {
		String newPathFolder1 = pathFolder1.getText();
		String newPathFolder2 = pathFolder2.getText();
		String newPathFolder3 = pathFolder3.getText();
		
		boolean isExistsFolder1 = UtilPreferences.isFolderExists(newPathFolder1);
		boolean isExistsFolder2 = UtilPreferences.isFolderExists(newPathFolder2);
		boolean isExistsFolder3 = UtilPreferences.isFolderExists(newPathFolder3);
		
		// If all folders exists
		if(isExistsFolder1 && isExistsFolder2 && isExistsFolder3) {
			
			// If there isn't equal folders
			if(!((newPathFolder1.equals(newPathFolder2)) ||
					(newPathFolder2.equals(newPathFolder3)) ||
					(newPathFolder3.equals(newPathFolder1)))) {
				
				String newPaths = newPathFolder1 + "*" + newPathFolder2 + "*" + newPathFolder3;
				
				// Save the informations to file
				UtilPreferences.writeOnFile(newPaths);
				
				// Refresh the static variable that handles the paths
				UtilPreferences.refreshListOfPaths();
				
				JOptionPane.showMessageDialog(this, "The preferences has been saved sucessfully!", "Save Alert", JOptionPane.INFORMATION_MESSAGE);
				
				frame.dispose();
			
			} else {
				String message = "There are same paths defined to differents Folders.\n";
				message += "Same Paths:\n";
				
				message += (newPathFolder1.equals(newPathFolder2)) ? "===> Folder 1 and 2\n" : "";
				message += (newPathFolder2.equals(newPathFolder3)) ? "===> Folder 2 and 3\n" : "";
				message += (newPathFolder3.equals(newPathFolder1)) ? "===> Folder 1 and 3\n" : "";
				
				JOptionPane.showMessageDialog(this, message, "Same Paths", JOptionPane.WARNING_MESSAGE);
			}
		} else {
			String message = "The following folders do not exists:\n";
			
			message += (isExistsFolder1) ? "" : "===> Folder 1\n";
			message += (isExistsFolder2) ? "" : "===> Folder 2\n";
			message += (isExistsFolder3) ? "" : "===> Folder 3\n";
			
			JOptionPane.showMessageDialog(this, message, "Missing Folders", JOptionPane.WARNING_MESSAGE);
		}
		
	}
}