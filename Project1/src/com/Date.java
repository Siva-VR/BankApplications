package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		 /*LocalDateTime myDateObj = LocalDateTime.now();    
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		    String formattedDate = myDateObj.format(myFormatObj); 
		    System.out.println("After Formatting: " + formattedDate); 
		    
		    LocalDateTime dateTime2 = LocalDateTime.now();
	        LocalDateTime dateTime1 = LocalDateTime.now().plusSeconds(100); // Adding 1 second to the current time
	        String date =dateTime1.toString();
	        
	        if (dateTime1.isBefore(dateTime2)) {
	            System.out.println("dateTime1 is before dateTime2");
	        } else if (dateTime1.isAfter(dateTime2)) {
	            System.out.println("dateTime1 is after dateTime2");
	        } else {
	            System.out.println("dateTime1 is equal to dateTime2");
	        }*/
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a date (dd/MM/yyyy): ");
		        String userInput = scanner.nextLine();
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E dd MM yyyy "); 
		        try {
		            LocalDate localDate = LocalDate.parse(userInput, dateFormatter);  
		            System.out.println("Parsed LocalDate: " + localDate.format(myFormatObj));
		        } catch (Exception e) {
		            System.out.println("Error parsing date. Please enter the date in the correct format.");
		        }

		       
		    
		

	}
}