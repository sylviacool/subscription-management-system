package com.example.Subscription;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

@SpringBootApplication
public class SubscriptionApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Subscription Application");
		System.out.println("Please select the member you want the plan for:");
		System.out.println("1. Self\n2. Spouse\n3. Exit");
		
		String userType = "";
		
		int userChoice = scanner.nextInt();
		scanner.nextLine();
		
		   switch (userChoice) {
           case 1 -> userType = "self";
           case 2 -> userType = "spouse";
           case 3 -> {
               System.out.println("Exiting...");
               scanner.close();
               context.close();
               return;
           }
           default -> {
               System.out.println("Invalid choice");
               scanner.close();
               context.close();
               return;
           }
       }

		
			User user = context.getBean(userType, User.class);
		
			System.out.println("Enter your name: ");
		    String userName = scanner.nextLine();
		    
		    System.out.println("Enter your age: ");
		    int userAge = scanner.nextInt();

		    System.out.println("Enter your contact: ");
		    Long userContact = scanner.nextLong();
		    scanner.nextLine(); 

		    System.out.println("Enter your address: ");
		    String userAddress = scanner.nextLine();

			user.setUserDetails(userName, userAge, userContact, userAddress);
			user.getUserDetails();
			
			scanner.close();
	        context.close();
			}
	}