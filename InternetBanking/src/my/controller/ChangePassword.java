package my.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.dao.CustomerDao;

public class ChangePassword extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String oldp=req.getParameter("t1");
		String newp=req.getParameter("t2");
		String rnewp=req.getParameter("t3");
		if(newp.compareTo(rnewp)==0&&oldp.compareTo(newp)!=0)
		{
			CustomerDao cd=new CustomerDao();
			int r=cd.changePassword(oldp,newp);
			if(r!=0)
			{
				out.println("<html>");
				out.println("<body>");
				out.println("<font color='green'>");
			out.println("updated successfully");
			out.println("</font>");
			RequestDispatcher rd=req.getRequestDispatcher("ChangePassword.jsp");
			rd.include(req,res);
			
			}
		}
		else
		{
			out.println("<font color='red'>");
			out.println("new password should not be same as old password");
			out.println("(or)");
			out.println("retype password correctly");
			out.println("</font>");
			
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher rd=req.getRequestDispatcher("ChangePassword.html");
			rd.include(req,res);
		}
		}
}
