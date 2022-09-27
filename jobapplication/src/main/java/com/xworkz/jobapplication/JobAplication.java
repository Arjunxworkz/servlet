package com.xworkz.jobapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 2, urlPatterns = "/jobapp")
public class JobAplication extends HttpServlet{
	List<JobApplicationEntity> jobEntity=new ArrayList<JobApplicationEntity>();
	
public JobAplication() {
	System.out.println("Job Application");
}
 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 String name=req.getParameter("name");
	 String email=req.getParameter("Email");
	 String phone=req.getParameter("Phone");
	 String alternativePhoneNo=req.getParameter("AlternativePhoneNO");
	 String redio=req.getParameter("fav_language");
	 String qualification=req.getParameter("Qualification");
	 
	 String yop=req.getParameter("Yop");
	 String university=req.getParameter("University");
	 String address=req.getParameter("Address");
	 String skill=req.getParameter("Skill");
	
	 String salary=req.getParameter("Salary");
	 String exp=req.getParameter("Exp");
	 String idproof=req.getParameter("Proof");
	 String idProofNumber=req.getParameter("pNumber");
	 System.out.println(name);
		
	 
	 res.setContentType("text/html");
	 PrintWriter writer = res.getWriter();
	 writer.append("<html>")
	    .append("<head>")
	    .append("</head>")
		.append("<body>")
		
		.append("<h1>Candidate Detials</h1>")
		
		.append(name)
		.append(email)
		.append(phone)
		.append(alternativePhoneNo)
		.append(redio)
		.append(qualification)
		.append(yop)
		.append(university)
		.append(address)
		.append(skill)
		.append(salary)
		.append(exp)
		.append(idproof)
		.append(idProofNumber)
		
		
		
		
		.append("</body>")
		.append("</html>");
	 JobApplicationEntity entity=new JobApplicationEntity(name, email,phone,alternativePhoneNo,redio,qualification,yop,
			 university,address,skill,salary,exp,idproof,idProofNumber);
	         boolean save=jobEntity.add(entity);
		 
	 }
 
 

	}
