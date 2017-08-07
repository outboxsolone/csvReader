package com.csvreader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader; 



import java.io.FileReader;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Starting the program . . . ");
       
      //String fileName = "F\\programming\\JavaWorkSpace\\CsvReader\\file\\csvFile.csv";
      String fileName = "F://programming//JavaWorkSpace//CsvReader//file//CsvFile.csv";

      //Build reader instance
      //Read data.csv
      //Default seperator is comma
      //Default quote character is double quote
      //Start reading from line number 2 (line numbers start from zero)
      try {
		CSVReader reader = new CSVReader(new FileReader(fileName), ',' , '"' , 1);
		   //Read CSV line by line and use the string array as you want
		  String[] nextLine;
		  while ((nextLine = reader.readNext()) != null) {
		     if (nextLine != null) {
		        //Verifying the read data here
		        System.out.println("Whole line " + Arrays.toString(nextLine));
		        System.out.println("2nd Character : " + nextLine[1]);
		        
		}
		
		  		   	  
  }
		  //closing the csv reader object
	       reader.close();	  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
	{
		
		
		
	}
      
      
}
	
}


