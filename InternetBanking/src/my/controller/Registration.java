package my.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.dao.CustomerDao;

public class Registration extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int uid=Integer.parseInt(req.getParameter("t1"));
		String emailid=req.getParameter("t2");
		String pwd=req.getParameter("t3");
		String sq=req.getParameter("s1");
		String sans=req.getParameter("t4");
		CustomerDao cd=new CustomerDao();
		int result=cd.register(uid,emailid,pwd,sq,sans);
		if(result!=0)
		{
			out.println("registration successful");
			RequestDispatcher rd=req.getRequestDispatcher("Registration.html");
		rd.include(req,res);
		}
}
}
