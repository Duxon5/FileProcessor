package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessFile {

	public ProcessFile() { }
	
	public static String processFile(String folderName) throws IOException {
		
		File path = new File(UtilPreferences.getFolderPath(folderName));
		
		String fileContentProcessed = "";
		
		// If the folder is not empty
		if(path.listFiles().length != 0) {
			File[] listOfFiles = path.listFiles();
			
			// For each file
			for (File file : listOfFiles) {
			    if (file.isFile()) {
			    	fileContentProcessed += "********FILE*********\n";
			    	fileContentProcessed += file.getName()+"\n";
			    	fileContentProcessed += "*******CONTENT*******\n";
			        String fileContent = readFile(path, file);
			        fileContentProcessed += fileContent+"\n\n";
			        
			        file.delete();
			    }
			}
		}
		
		return fileContentProcessed;
	}
	
	private static String readFile(File folder, File file) throws IOException {
		String filePath = folder+ "/" + file.getName();
		
		String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
		
		return fileContent;
	}
	
}
