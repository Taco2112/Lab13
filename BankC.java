import java.util.ArrayList;

public class BankC extends BankBranch
{

	private ArrayList<BankAccount> bankAccounts = new ArrayList();
	private int totalMoney;


	public BankC( )
	{

		super( "Medway", "Dean Bank of Medway" );
		setBankAccounts();
		setTotalMoney();

	}

	public int getNumAccounts( ) { return bankAccounts.size(); }

	public void setTotalMoney( )
	{

		for ( BankAccount bankAccount : bankAccounts ) {

			totalMoney += bankAccount.getBalance();

		}

	}

	public double getTotalMoney( ) { return totalMoney; }

	protected void addAccount( ) {



	}

	protected void removeAccount()
	{



	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{

		BankAccount john = new BankAccount( "John" , "Smith" , 9887 );
		BankAccount yaBoiMit = new BankAccount( "Mit" , "Romney" , 6545 );

		bankAccounts.add(john);
		bankAccounts.add(yaBoiMit);

	}

	public void displayBank()
	{

		System.out.println( "BankC Location: " + location + " | BankC Name: " + branchName );
		System.out.println( "Bank Accounts" );
		System.out.println();

		for ( BankAccount bankAccount : bankAccounts ) {

			System.out.println( bankAccount.toString() );

		}

	}

}
