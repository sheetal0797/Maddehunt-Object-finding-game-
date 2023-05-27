//package com.mkyong.file;
 
import java.io.*;
//import java.io.IOException;
 
public class Files 
{ 
public Files()
{}
    public static void main( String[] args )
    {	
    	try {
 
	      File file = new File("newfile.txt");
 
	    /*  if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }*/

 FileWriter writer = new FileWriter(file); 
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      //Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a); // reads the content to the array
      for(char c : a)
          System.out.print(c); //prints the characters one by one
      fr.close();
 
    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
}