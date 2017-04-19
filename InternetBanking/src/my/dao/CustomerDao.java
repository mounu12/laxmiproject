package my.dao;

import java.sql.*;

import my.to.Customer;
import my.to.AccountDetails;
import my.to.CustomerDetails;

public class CustomerDao {
	int uid;
	public int customerDb(Customer cus,AccountDetails ac)
	{
		int result=0;
		uid=cus.getuid();
		String pwd=cus.getpassword();
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		ResultSet rs2=null;
	
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j33","root","root");
		smt=con.createStatement();
		
		String s="SELECT * FROM credentials WHERE uid="+uid+" and pwd='"+pwd+"'";
		rs=smt.executeQuery(s);
		if(rs.next())
		{
			result=1;
			
			String s2="SELECT * FROM account_details where uid="+uid+"";
			rs2=smt.executeQuery(s2);
				
			if(rs2.next());
			ac.setName(rs2.getString(3));
			ac.setAccNumber(rs2.getInt(2));
			ac.setAccBalance(rs2.getDouble(4));
			ac.setAccType(rs2.getString(5));
			
		}
		
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs2!=null)
					rs2.close();
                   if(rs!=null)
					
					rs.close();
				if(smt!=null)
					smt.close();
				if(con!=null)
					con.close();
				
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
		}
		
	return result;
	}
	public int myProfile(CustomerDetails cds,int uid)
	{
		int r=0;
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		
		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j33","root","root");
	smt=con.createStatement();
		String s="SELECT * FROM customer_details WHERE uid="+uid+"";
		rs=smt.executeQuery(s);
		
		if(rs.next())
		{
			r=1;
			cds.setName(rs.getString(2));
			cds.setAddress(rs.getString(3));
			cds.setMobileNumber(rs.getInt(4));
			cds.setEmailId(rs.getString(5));
			cds.setAadharNo(rs.getString(6));
			cds.setPanNo(rs.getString(7));
		
		}
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
					rs.close();
                   
				if(smt!=null)
					smt.close();
				if(con!=null)
					con.close();
				
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
		}
		return r;
	   }
	public int changePassword(String oldp,String newp)
	{
		Connection con=null;
	    Statement smt=null;
	    int rs=0;
	    try
	    {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j33","root","root");
		smt=con.createStatement();
			String s="UPDATE credentials set pwd='"+newp+"' WHERE pwd='"+oldp+"'";
			rs=smt.executeUpdate(s);
	    }
	    catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
			
				if(smt!=null)
					smt.close();
				if(con!=null)
					con.close();
				
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
		} 
	return rs;
	}
	public String forgetPassword(int uid,String emailid,String sq,String sans)
	{
		String pwd="";
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;	
		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j33","root","root");
	smt=con.createStatement();
		String s="SELECT emailid,sq,sans,pwd FROM credentials WHERE uid="+uid+"";
		rs=smt.executeQuery(s);
		if(rs.next())
		{
			if(rs.getString(1).equals(emailid))
			{
				if(rs.getString(2).equals(sq))
				{
					if(rs.getString(3).equals(sans))
					{
					pwd= rs.getString(4);	
					}
					else
					{
						System.out.println("incorrect Answer");
						return "";
					}
				}
				else
				{
					System.out.println("select valid question");
					return "";
				}
		    }
			else
			{
				System.out.println("enter correct emailid");
				return "";
			}
		}
	
		else
		{
			System.out.println("you are not a registered user");
			return "";
		}
	  }
		 catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
			
				if(smt!=null)
					smt.close();
				if(con!=null)
					con.close();
				
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
		}
		return pwd;	
	}
	public int register(int uid,String emailid,String pwd,String sq,String sans)
	{
		int r=0;
	Connection con=null;
		Statement smt=null;
	

		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j33","root","root");
	smt=con.createStatement();
	String s="insert into credentials values("+uid+",'"+pwd+"','"+sq+"','"+sans+"','"+emailid+"')";
      r=smt.executeUpdate(s);
    
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
			
				if(smt!=null)
					smt.close();
				if(con!=null)
					con.close();
				
			}
			catch(SQLException se1)
			{
				se1.printStackTrace();
			}
		}
      return r;
	}
}


