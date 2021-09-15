package com.lockedme;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedmeLocked {

	 static final String folderpath= "D:\\assesment project1\\lockedmefiles";
	 
	 public static void main(String[] args)
	 {
		 int proceed=1;
		 do
		 {
			 //variable Declaration
			 int ch;
			 //Display menu.
			 ch=displayMenu1();
			 switch(ch)
			 {
			 case 1: getAllFiles1();
			     break;
			 case 2: createFiles();
			      break;
			 case 3: deleteFiles1();
			       break;
			 case 4: searchFiles1();
			       break;
			 case 5: System.exit(0); 
			        break;
			   default : System.out.println("Invalid option");
			       break;
			 }
			 }while(proceed>0);
		 
		 }
	 private static void createFiles() {
		// TODO Auto-generated method stub
		
	}
	public static int displayMenu1()
	 {
		 Scanner obj=new Scanner(System.in);
		 int ch;
		 
		 System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		 System.out.println("\t\t\tLockedMe.com");
		 System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		 System.out.println("1). Display All Files.");
		 System.out.println("2). Add a New File");
		 System.out.println("3). Delete a File");
		 System.out.println("4). Search a File");
		 System.out.println("5).  Exit");
		 System.out.println("***********************************************************************");
		 System.out.println("Enter your choice:");
		 ch=Integer.parseInt(obj.nextLine());
		 return ch;
	 }
	 /**
	  * the method will return the file name from the folder.
	 * @param folderpath
	  * return List<String>
	  
	  */
	 public static void getAllFiles1()
	 {
		 //getting files name
	List<String> fileNames=FileManager.getAllFiles(folderpath);	
	if(fileNames.size()==0)
		System.out.println("files not found ");
	else
	{
		System.out.println("file list is there:\n");
		
		//sorting file name in ascending order
		Collections.sort(fileNames);
		//printoutput
		for(String f:fileNames)
			System.out.println(f);
	}
	 }
	
	/* this method will create content into the file specified.
	 * 
	 * 
	 */
	public static void CreateFiles()
	{
	//variable declaration.

		Scanner obj1=new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String>content=new ArrayList<String>();
		//read files name from the users.
		System.out.println("Enter file name:");
		fileName=obj1.nextLine();
		//read number of lines from the user.
		System.out.println("Enter how many lines in the file:");
		linesCount=Integer.parseInt(obj1.nextLine());
		for(int i=1;i<=linesCount;i++)
		{
			System.out.println("Enter line "+i+":");
		content.add(obj1.nextLine());
	}
	 boolean isSaved=FileManager.createFiles(folderpath,fileName,content);
	 if(isSaved)
		 System.out.println("File and data saved successfully");
	 else
		 System.out.println("errors occurred contact to the administration ");
	}
	
	 //method will delete the file if exists
	public static void deleteFiles1()
	{
		//code for deleting the file
	
	 String fileName1;
	 @SuppressWarnings("resource")
	Scanner obj1=new Scanner(System.in);
	 System.out.println("enter the file name to be deleted");
	 fileName1=obj1.nextLine();
	 boolean isdeleted=FileManager.deleteFile(folderpath,fileName1);
	 if(isdeleted)
		 System.out.println("files not present ");
	 else
		 System.out.println("files  present");
	}
	//this method will search the file if exists.
	public static void searchFiles1()
	{
	 
	 //code for searching file
	 String fileName11;
	 Scanner obj11=new Scanner(System.in);
	 System.out.println("enter file name to be searched:");
	 fileName11=obj11.nextLine();
	 //searching the file
	 boolean IsFound=FileManager.searchFile(folderpath,fileName11);
	 if(IsFound)
	 
		 System.out.println("files searched successfully");
	 else
		 System.out.println("File not Found");
	}
	 }
		    
	 
		

		
	

	
		

	
	 


