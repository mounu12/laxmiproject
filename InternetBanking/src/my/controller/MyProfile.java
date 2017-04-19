package my.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import my.to.CustomerDetails;

import my.dao.CustomerDao;

import java.io.IOException;
import java.io.PrintWriter;
public class MyProfile extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		CustomerDao cd=new CustomerDao();
		HttpSession ses=req.getSession();
		int uid=(Integer)ses.getAttribute("uid");
		CustomerDetails cds=new CustomerDetails(); 
		int r=cd.myProfile(cds,uid);
	
			if(r!=0)
			{
			
			ses.setAttribute("customerdetails",cds);
		
		RequestDispatcher rd=req.getRequestDispatcher("Myprofile.jsp");
		rd.forward(req,res);
		
	
			}

}
}
