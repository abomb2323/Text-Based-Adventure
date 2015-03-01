package main.io;

import java.io.*;

/**
 * Library for use within the RPG used for clientside input/output, including
 * File input/output
 * 
 * @author Adam Crick
 * @version 0.0.1:1
 * 
 */
public class IOLibrary {
	
	
	/**
	 * 
	 * Method to make a directory if it isn't already there.
	 * Appends to the current path of the jar file.
	 * 
	 * @param dirName The directory to try to create. In the form of dir1\\dir2\\dir3
	 * @return Whether the operation was successful
	 */
	public boolean makeDirectory(String dirName){

		File f = new File(System.getProperty("java.class.path"));
		File dir = f.getAbsoluteFile().getParentFile();
		String path = dir.toString();
		
		File file = new File(path + dirName);
		if (!file.exists()) {
			if (file.mkdir()) {
				return true;
			} else {
				return false;
			}
		}
	 
		File files = new File("path + dirname");
		if (files.exists()) {
			if (files.mkdirs()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	
	/**
	 * 
	 * @param fileName The name of the file
	 * @param filePath The path to the file
	 * @return Whether the operation was completed successfully
	 */
	public boolean createFile(String fileName, String filePath){
		
		
		return false;
	}
	
	
}
