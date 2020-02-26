import java.io.*;

public class BankAccount implements AccountsInterface
{

	private double balance;
	private long accountID;
	private String name;
	private String shaPIN;
	private int accountPIN;

	public BankAccount()
	{

		balance = 0;
		setAccountID();
		name = "";

	}

	public BankAccount( String firstName , String lastName , int accountPIN)
	{

	

		balance = 0;
		setAccountID();
		setName( firstName , lastName );
		this.accountPIN = accountPIN;

	}

	public double getBalance() { return balance; }

	public void deposit( double amount )
	{

		this.balance += amount;

	}

	public void withdraw( double amount )
	{

		this.balance -= amount;

	}

	private void setAccountID()
	{

		accountID = Util.randomInt( 10000 , 10000000 );

	}

	private void setName( String firstName , String lastName )
	{

		name = lastName + ", " + firstName;

	}

	public String toString()
	{

		return "[ " + "$" + ( Math.round( balance * 100.0 ) / 100.0 ) + ", " + accountID + ", " + name + ", " + accountPIN + " ]";

	}



}
