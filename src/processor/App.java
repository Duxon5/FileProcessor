package processor;

import javax.swing.UIManager;

import layout.ProcessorInterface;

public class App {

	public static void main(String[] args) {
		ProcessorInterface processor = new ProcessorInterface();
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		processor.initialize();

	}

}
