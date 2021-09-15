package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	private static final String FileName = null;
	/**
	 * this return the file names from  the folder
	 * @param folderpath
	 * @returnList<string>
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		// creating file object
File fl=new File(folderpath);

//getting all the files into file array
File[] listofFiles =fl.listFiles();
//Declare a list to store the file name.
List<String> filenames=new ArrayList<String>();

for(File f:listofFiles)
	filenames.add(f.getName());
	
	//return the file list
return filenames;
	}
	/**
	 * 
	 * @param folderapth
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String folderapth,String fileName,List<String>content) 
	{
		try
		{
			String folderpath = null;
			File fl=new File(folderpath, fileName);
				
			FileWriter	fw=new FileWriter(fl);
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}
		catch(Exception Ex)
		
		{
			return false;
			}
	}
	/**
	 * 
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean deleteFile(String folderpath,String fileName)
	{
		File file=new File(folderpath+"\\"+fileName);
		try
		{
			if(file.delete())
				return true;
			else
				return false;
		}
		catch(Exception Ex)
		{
			return false;
		}
		
	}
	/**
	 * 
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean searchFile(String folderpath,String fileName)
	{
		File file=new File(folderpath+"\\"+fileName);
		if(file.exists())
			return true;
		else
			return false;
	}
}

	
		
	
		
	
	
		



