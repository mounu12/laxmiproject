package my.to;
import my.to.AccountDetails;

public class CustomerDetails {
private	int uid;
private String name;
private String address;
private int mobileNumber;
private String emailId;
private String aadharNo;
private String panNo;
AccountDetails ac=new AccountDetails();
public void setUid(int uid)
{
	this.uid=uid;
	
}
public int getUid()
{
	return uid;
}
public void setName(String name)
{
	this.name=name;
	
}
public String getName()
{
	return name;
}
public void setAddress(String address)
{
	this.address=address;
	
}
public String getAddress()
{
	return address;
}
public void setMobileNumber(int mn)
{
	this.mobileNumber=mn;
	
}
public int getMobileNumber()
{
	return mobileNumber;
}
public void setEmailId(String emailId)
{
	this.emailId=emailId;
	
}
public String getEmailId()
{
	return emailId;
}

public void setAadharNo(String aadharNo)
{
	this.aadharNo=aadharNo;
	
}
public String getAadharNo()
{
	return aadharNo;
}
public void setPanNo(String panNo)
{
	this.panNo=panNo;
	
}
public String getPanNo()
{
	return panNo;
}

}
