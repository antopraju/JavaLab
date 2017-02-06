/*
Create a class called account with the data members(Accno - integer,name String, Phone_NO:integer, balance_amt:float), and folowing methods:
a.getinput() to get input from the user
b.Deposit() method which takes the amount to be deposited in to his/her account do the calculation.
c.Withdraw() method which gets the amount to be withdraw his/her account.
Print the appropriate results.
*/

import java.util.*;

class Account{
	int Accno;
	String name;
	long Phone_No;
	float balance_amt;

	

	void getinput(){
		try{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account number:");
		Accno = sc.nextInt();
		System.out.println("Enter the Name:");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the Phone number:");
		Phone_No = sc.nextLong();
		System.out.println("Enter the Balance amount:");
		balance_amt = sc.nextFloat();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	void deposit(){
		try{
			char c;
			Scanner in = new Scanner(System.in);
			do{
	
			System.out.println("Enter the amount to be deposited:");
			float deposit = in.nextFloat();
			balance_amt = balance_amt + deposit;
			System.out.println("Do you what to Try Again?");			
			c = (char) System.in.read();
			}while(c == 'y');
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	void withdraw(){
		try{
			char c;
			Scanner wd = new Scanner(System.in);
			do{
					
			System.out.println("Enter the amount to be Withdrawn: ");
			float draw = wd.nextFloat();
			if(draw > balance_amt){
				System.out.println("Insufficient, Try again"); 
				return;
			}
			if(draw > 24000){
				System.out.println("The Amount to be withdrawn is greater than the max limit! Try again within the limit");
				return;
			}
			balance_amt -= draw;
			System.out.println("Do you what to Try Again?");			
			c = (char) System.in.read();
			}
			while(c == 'y');
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	void display(){
	
		System.out.println("The Account number is: "+Accno);
		System.out.println("The Account holder Name: "+name);
		System.out.println("The Phone number: "+Phone_No);
		System.out.println("The Balance amount: "+balance_amt);
	}
		
	public static void main(String[] args){
		Account ac = new Account();
		Account ac1 = new Account();
		//System.out.println("Do you want to create a new account?");
		
		ac.getinput();
		ac.deposit();
		ac.withdraw();
		ac1.getinput();
		ac1.deposit();
		ac1.withdraw();
		System.out.println("The Account details is:");
		ac.display();
		ac1.display();
		
	}
}
