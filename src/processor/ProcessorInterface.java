package processor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JToolBar.Separator;
import javax.swing.SwingConstants;

public class ProcessorInterface extends JFrame {

	private JFrame frame;
	private JSeparator separator;
	private JLabel processStatus;
	private JLabel processTimer;
	
	public void initialize() {
		
		initializeComponents();
		defineSettingsFrame();
		setAllTexts();
		setAllBackgrounds();
		setAllForegrounds();
		setAllFonts();
		setAllOpaques();
		setAllAlignments();
		setAllBounds();
		addAllComponentsToFrame();
		
	}

	private void initializeComponents() {
		frame = new JFrame();
		separator = new JSeparator();
		processStatus = new JLabel();
		processTimer = new JLabel();
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

	private void addAllComponentsToFrame() {
		frame.add(separator);
		frame.add(processStatus);
		frame.add(processTimer);
	}

	private void setAllBounds() {
		separator.setBounds(5, 320, 573, 10);
		processStatus.setBounds(5, 325, 150, 30);
		processTimer.setBounds(498, 325, 80, 30);
	}

	private void setAllAlignments() {
		processStatus.setHorizontalAlignment(SwingConstants.CENTER);
		processTimer.setHorizontalAlignment(SwingConstants.CENTER);
		
		processStatus.setVerticalAlignment(SwingConstants.CENTER);
		processTimer.setVerticalAlignment(SwingConstants.CENTER);
	}

	private void setAllOpaques() {
		processStatus.setOpaque(true);
		processTimer.setOpaque(true);
	}

	private void setAllFonts() {
		processStatus.setFont(new Font("Arial", Font.PLAIN, 14));
		processTimer.setFont(new Font("Arial", Font.PLAIN, 14));
		
		processStatus.setFont(processStatus.getFont().deriveFont(Font.BOLD));
		processTimer.setFont(processStatus.getFont().deriveFont(Font.BOLD));
	}

	private void setAllForegrounds() {
		processStatus.setForeground(Color.BLACK);
		processTimer.setForeground(Color.BLACK);
	}

	private void setAllBackgrounds() {
		processStatus.setBackground(Color.WHITE);
		processTimer.setBackground(Color.WHITE);
	}

	private void setAllTexts() {
		processStatus.setText("Status: Stopped");
		processTimer.setText("00:00:05");
	}
	
}
