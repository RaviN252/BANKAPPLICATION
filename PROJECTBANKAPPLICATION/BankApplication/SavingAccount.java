package BankApplication;

import java.util.Scanner;

public class SavingAccount implements Accounts{
		public void OpenNewBankAccount() {
		int age = 18;
		System.out.println("Saving account is for above age " + age + "+" );
		}

		public void showmenu() {
			// TODO Auto-generated method stub
		    	  char option='\0' ;
		    	  Scanner Sc = new Scanner(System.in);
		    	  
		  		  
		  		 do 
		  		 {
		  			 System.out.println("Enter An option");
		  			 option = Sc.next().charAt(0);
		  			 System.out.println("********************");
		  			 
		  			 switch (option) 
		  			 {
		  			 case 'A':System.out.println("Type of Account is Saving Account ");
		  			 		  System.out.println("Thank you");
		  				       break;
		  			 case 'B':System.out.println("Type of Account is joint Account");
		  			 		  System.out.println("Thank you");
		 				     break;
		  			 case 'C':	System.out.println("Type of Account is Business account"); 
		  			 			
		  			}
		  		}
		  		 while (option!=('A'|'B'|'C'));
		  		 System.out.println("Thank you");
		  		System.out.println("************************");
		      }
		      
		}
	


