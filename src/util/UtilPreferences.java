package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.FolderPath;

public class UtilPreferences {

	private static List<FolderPath> listOfPaths = null;
	private static File folder = new File("src/preferences");
	private static File filename = new File("preferences.txt");
	private static String filePath = folder+"/"+filename;
	
	private static List<String> loadPreferencesFile() throws IOException {
		List<String> foldersChosen = new ArrayList<String>();
		
		// If the folder is empty
		if(folder.listFiles().length != 0) {
			File[] listOfFiles = folder.listFiles();
			
			// Find the preferences.txt file
			for (File file : listOfFiles) {
			    if (file.isFile() && file.getName().equals(filename.toString())) {
					String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
					
					foldersChosen = new ArrayList<String>(Arrays.asList(fileContent.split("\\*")));
					
			        return foldersChosen;
			    }
			}
		}
		
		return null;
	}
	
	private static List<FolderPath> loadFolderPath(){
		
		List<String> listOfPaths = new ArrayList<String>();
		List<FolderPath> listOfFolderPaths = new ArrayList<>();
		
		try {
			listOfPaths = loadPreferencesFile();
		
			int folderNum = 1;
			for (String path : listOfPaths) {
				path = path.replace("\r\n", "");
				FolderPath folderPathEntity = new FolderPath("Folder"+folderNum, path);
				listOfFolderPaths.add(folderPathEntity);
				folderNum++;
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(listOfFolderPaths.isEmpty())
			return null;
		
		return listOfFolderPaths;
	}

	// Method created to get the paths from file 'preferecences.txt'
	public static List<FolderPath> getListOfPaths(){
		if(listOfPaths == null || listOfPaths.isEmpty()) {
			listOfPaths = loadFolderPath();
		}
		
		return listOfPaths;
	}
	
	// Method created to refresh the variable after updating the preferences by screen.
	public static void refreshListOfPaths() {
		listOfPaths = loadFolderPath();
	}
	
	// Write on the file
	public static void writeOnFile(String content) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(filePath, "UTF-8");
			writer.println(content);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isFolderExists(String path) {
		boolean isExists = false;
		
		File file = new File(path);
		isExists = file.exists();
		
		return isExists;
	}
	
}
