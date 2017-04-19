package my.controller;
import my.to.AccountDetails;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import my.to.Customer;
import my.dao.CustomerDao;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginProcess extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int uid=Integer.parseInt(req.getParameter("t1"));
		String pwd=req.getParameter("t2");
		Customer cus=new Customer();
		AccountDetails ac=new AccountDetails();
		
		cus.setuid(uid);
		cus.setpassword(pwd);
		CustomerDao cd=new CustomerDao();
		int result=cd.customerDb(cus,ac);
		
		
		if(result!=0)
		{
			HttpSession ses=req.getSession();
			ses.setAttribute("customer",cus);
			ses.setAttribute("account",ac);
			ses.setAttribute("uid",uid);
			
			RequestDispatcher rd=req.getRequestDispatcher("Loginsuccess.jsp");
			rd.forward(req,res);
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req,res);
			
		}
		
		
	
		
	}

}
