import java.util.ArrayList;

public class BankB extends BankBranch
{

	private ArrayList<BankAccount> bankAccounts = new ArrayList();
	private int totalMoney;


	public BankB()
	{

		super( "Wrentham" , "Dean Bank of Wrentham" );
		setBankAccounts();
		setTotalMoney();

	}

	public int getNumAccounts() { return bankAccounts.size(); }
	public void setTotalMoney()
	{

		for ( int i = 0 ; i < bankAccounts.size() ; i++ )
		{

			totalMoney += bankAccounts.get(i).getBalance();

		}

	}

	public double getTotalMoney() { return totalMoney; }

	protected void addAccount()
	{



	}

	protected void removeAccount()
	{



	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{

		BankAccount joe = new BankAccount( "Joe" , "Shmo" , 2345 );
		BankAccount obama = new BankAccount( "Barrack" , "Obama" , 8765 );

		bankAccounts.add(joe);
		bankAccounts.add(obama);

	}

	public void displayBank()
	{

		System.out.println( "BankB Location: " + location + " | BankB Name: " + branchName );
		System.out.println( "Bank Accounts" );
		System.out.println();

		for ( BankAccount bankAccount : bankAccounts ) {

			System.out.println( bankAccount.toString() );

		}

	}

}
