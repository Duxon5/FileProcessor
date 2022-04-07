package processor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//		try {
//			processFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void processFile() throws IOException {
		File folder = new File("Files/Folder1");
		
		// If the folder is empty
		if(folder.listFiles().length == 0) {
			System.out.println("The folder '"+folder+"' is empty!");
		} else {
			File[] listOfFiles = folder.listFiles();
			
			// For each file
			for (File file : listOfFiles) {
			    if (file.isFile()) {
			        System.out.println("********FILE*********");
			        System.out.println(file.getName());
			        
			        System.out.println("*******CONTENT*******");
			        readFile(folder, file);
			        file.delete();
			        
			        System.out.println("");
			    }
			}
		}
	}
	
	private static void readFile(File folder, File file) throws IOException {
		String filePath = folder+ "/" + file.getName();
		
		String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
		
		System.out.println(fileContent);
		
	}

}
