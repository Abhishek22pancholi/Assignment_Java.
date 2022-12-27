import java.util.Scanner;
import java.util.Random;
public class Bank {	
	public int Account_Number;
	public double Balance;
	public String Name;
	public float Intrest;
	Bank()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Bank");
		System.out.print("Enter Name : ");
		this.Name = scan.nextLine();
		this.Balance=0;
		Random random =new Random();
		this.Account_Number=random.nextInt(1000000);
		this.Intrest=5;
		System.out.println("Your Account Created with Account number : "+Account_Number);		
	}
	public void deposit(double amount)
	{
			Balance+=amount;
			System.out.println("Amount Deposited");
	}
	
	public void withdraw(double amount)
	{
		if(Balance-amount>=5000)
		{
			Balance-=amount;
			System.out.println("Amount Withdrawed");
		}else
			System.out.println("Insufficient Balance");
	}
	
	public void intrest()
	{
		System.out.println("Intrest : "+Intrest+"%");
	}
	
	public void details()
	{
			System.out.println("Name : "+ Name);
			System.out.println("Account Number : "+Account_Number);
			System.out.println("Balance : "+Balance);
			System.out.println("Rate of intrest : "+Intrest+"%");
	}
	
	public void getinput()
	{
		System.out.println("");
		System.out.println("How can i help ?");
		System.out.println("1. Deposite");
		System.out.println("2. Withdraw");
		System.out.println("3. Rate of Intrest");
		System.out.println("4. Account Details");
		System.out.println("5. Exit");
		System.out.println("Type Choice Number");
	}
}
class Main
{
	public static void main(String[] s)
	{
		Bank NewAccount = new Bank();
		Scanner scan=new Scanner(System.in);
		int State = 0;
		while(State==0)
		{
			NewAccount.getinput();
			int process=scan.nextInt();
			if(process==1)
			{
				System.out.print("Enter amount to be deposited : ");
				NewAccount.deposit(scan.nextDouble());
			}
			else if(process==2)
			{
				System.out.print("Enter amount to be withdraw : ");
				NewAccount.withdraw(scan.nextDouble());
			}
			else if(process==3)
			{
				NewAccount.intrest();
			}
			else if(process==4)
			{
				NewAccount.details();
			}
			else if(process==5)
			{
				System.out.println("Thank You");
				State=1;
			}
		}
	}
}
