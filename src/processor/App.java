package processor;

import javax.swing.UIManager;

import layout.ProcessorInterface;
import threads.FolderThread;

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
