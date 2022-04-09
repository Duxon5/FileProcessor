package view;

import javax.swing.UIManager;

import util.UtilPreferences;

public class Init {

	public static void main(String[] args) {
		ProcessorInterface processor = new ProcessorInterface();
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Load preferences from file
		UtilPreferences.getListOfPaths();
		
		processor.initialize();

	}

}
