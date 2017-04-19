package my.to;

public class AccountDetails {
	private int uid;
	private String name;
	private int accNumber;
	private double accBalance;
	private String accType;
	
	public void setUid(int uid)
	{
		this.uid=uid;
	}
	public int getUid()
	{
		return uid;
	}
	public void setAccNumber(int accNumber)
	{
		this.accNumber=accNumber;
	}
	public int getAccNumber()
	{
		return accNumber;
	}
	public void setAccType(String accType)
	{
		this.accType=accType;
	}
	public String getAccType()
	{
		return accType;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance=accBalance;
	}
	public double getAccBalance()
	{
		return accBalance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	

}
