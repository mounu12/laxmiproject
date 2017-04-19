package my.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.dao.CustomerDao;

public class ForgotPassword extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int uid=Integer.parseInt(req.getParameter("t1"));
		String emailid=req.getParameter("p1");
		String sq=req.getParameter("s1");
		String sans=req.getParameter("p2");
		CustomerDao cs=new CustomerDao();
		String pwd="your password is:"+cs.forgetPassword(uid,emailid,sq,sans);
		if(pwd!=null)
		{
			String subject="password";
		//PROVIDE ENVIRONMENT DETAILS OF MAIL SERVER
		Properties props=new Properties();    
        props.put("mail.smtp.host","smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port","465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth","true");    
        props.put("mail.smtp.port","465");
        
         //CONNECT TO MAIL SERVER   
         Session session=Session.getDefaultInstance(props,new javax.mail.Authenticator() 
													         {    
													          protected PasswordAuthentication getPasswordAuthentication() {    
													          return new PasswordAuthentication("internetbanking66@gmail.com","internetbanking");  
													          }    
													         });
         
         //COMPOSE EMAIL   
         try 
         {    
        	 MimeMessage mimeMessage= new MimeMessage(session);   
        	 mimeMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(emailid));    
        	 mimeMessage.setSubject(subject);    
        	 mimeMessage.setText(pwd);    
          
        	 //SEND EMAIL  
        	 Transport.send(mimeMessage);
        	 
        	 out.println("message sent successfully");    
         } 
         catch(MessagingException e) 
         {
        	 out.println(e);
         }
	}
}
}

