import java.io.*;


public abstract class BankBranch implements Bank
{

	protected String location;
	protected String branchName;

	public BankBranch()
	{

		location = "";
		branchName = "";

	}

	public BankBranch( String location , String branchName )
	{

		this.location = location;
		this.branchName = branchName;

	}

	public String getLocation() { return this.location; }

	public String getBranchName() { return this.branchName; }

	protected abstract void addAccount();

	protected abstract void removeAccount();

}
