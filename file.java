//package com.mkyong.file;
 
import java.io.*;
//import java.io.IOException;
 
public class File 
{
    public static void main( String[] args )
    {	
    	try {
 
	      File file = new File("score.txt");
 
	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
 
    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
}