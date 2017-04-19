package my.to;

public class Customer {

	public int uid;
	public String password;
	private String name;
	public void setuid(int id)
	{
		this.uid=id;
		
	}
	public void setpassword(String pwd)
	{
		this.password=pwd;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getuid()
	{
		return uid;
		
	}
	public String getpassword()
	{
		return password;
		
	}
	public String getName() {
		return name;
	}
	
}
