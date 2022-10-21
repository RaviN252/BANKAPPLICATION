package BankApplication;
import java.util.*;


public class AxisBank {
	int blance;
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Hello welcome to Axis BANK ");
		System.out.println("Enter The Details");
		System.out.println("The Details should consisit of Name,Gender,Age,Mobile No");
		String name =obj1.next();
		char gender = obj1.next().charAt(0);
		int age = obj1.nextInt();
		long mobileNo = obj1.nextLong();
		System.out.println("Name:"+ name);
		System.out.println("Gender:" +gender);
		System.out.println("Age:"+ age);
		System.out.println("MobileNo:"+mobileNo);
		System.out.println("********************");
		
		// interface
		System.out.println("Select A type of Account");
		SavingAccount ob = new  SavingAccount();
		jointAccount ob1 = new jointAccount();
		System.out.println("A.For Saving Account ");
		System.out.println("B.For joint Account ");
		System.out.println("C.For Business Account ");
		ob.OpenNewBankAccount();
		ob1.OpenNewBankAccount();
		ob.showmenu();
		
		
		//for transaction
		BankAccount obj = new BankAccount("Ravi","AXIS001");
		obj.showmenu();
		
		
	}
}
class BankAccount extends BankApp{
	int balance ;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	BankAccount(String name, String id)
	{
		customerName = name;
		customerId = id;
	}
	
	void deposite(int amount) {
		if (amount!=0) {
			balance = balance + amount;
			previousTransaction  = amount;
		}
	}
	void withdraw(int amount){
		if (amount!=0) {
			balance = balance - amount;
			previousTransaction= - amount;
		}
	}
	
	 void getPreviousTransaction() 
	 {
		 if(previousTransaction > 0)
		 {
			 System.out. println("Deposited:"+previousTransaction);
		 }
		 else if(previousTransaction < 0)
	 	{
			 System.out.println("withdrawn:"+Math.abs(previousTransaction));
		 }
		 else
		 {
			 System.out.println("No transaction occured");
		 }
	
	 }

	 void showmenu() 
	 {
		 char option = '\0';
		 Scanner Sc = new Scanner(System.in);
		 System.out.println(" Welcome :"+ customerName);
		 System.out.println(" Your ID is :"+ customerId);
		 System.out.println(" A.Check Balance");
		 System.out.println(" B.Deposit");
		 System.out.println(" C.Withdraw");
		 System.out.println(" D.previousTransaction");
		 System.out.println(" E.Exit  ");
	 
	 do 
	 {
		 System.out.println("ENTER AN OPTION"); 
		 option = Sc.next().charAt(0);
		 System.out.println("*******");
	 
	 
		 switch (option)
		 {
		 case 'A':
			 System.out.println("Balance ="+ balance);
			 System.out.println("*********");
			 break;
			 
		 case 'B':
			 System.out.println("Enter the amount to deposite:");
			 int amount = Sc.nextInt();
			 deposite(amount);
			 System.out.println("***********");
			 break;
			 
		 case 'C':
			 System.out.println("Enter the amount to withdraw:");
			 int amount2 = Sc.nextInt();
			 withdraw(amount2);
			 System.out.println("**********");
			 break;
			 
		 case 'D':
			 getPreviousTransaction();
			 System.out.println("\n");
			 break;
			 
		 case 'E':
			 System.out.println("***********");
			 break;
		 }
	 	
	 }while(option !='E');
		 	System.out.println("THANK YOU");

	}

} 

	
