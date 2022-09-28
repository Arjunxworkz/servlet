package com.xworkz.companydetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
@WebServlet(loadOnStartup = 2,urlPatterns = {"/Camp","/showdetials"})
public class CompanyDetails extends HttpServlet{
	
	List<CompanyEntity> campEntity=new ArrayList<CompanyEntity>();
	
	
			public CompanyDetails() {
		System.out.println(this.getClass().getSimpleName() + "is created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Calling do post method");
		 res.setContentType("text/html");
			
		String name=req.getParameter("Company");
		String founder=req.getParameter("founder");
		String since =req.getParameter("since");
		String employees=req.getParameter("Employees");
		String address =req.getParameter("Address");
		String business=req.getParameter("Business");
		System.out.println(name);
		System.out.println(founder);
		System.out.println(since);
		System.out.println(employees);
		System.out.println(address);
		System.out.println(business);
		// res.setContentType("text/html");
		
		
		 PrintWriter writer = res.getWriter();
		 writer.append("<html>")
		       .append("<body>")
		       .append("<h1>Dynamic data</h1>")

		        .append("name ") .append(name).append("<br>")
				.append("founder ").append(founder).append("<br>")
				.append("since ").append(since).append("<br>")
				.append("employees ").append(employees).append("<br>")
				.append("address ").append(address).append("<br>")
				.append("business ").append(business)
				
				
		        .append("<body>")
		
		        .append("</html>");
		 
		 CompanyEntity entity =new CompanyEntity(name,founder,since,employees,address,business);
		 campEntity.add(entity);
		 
		 
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling do get method");
		
	 resp.setContentType("text/html");
		
		
	 PrintWriter writer = resp.getWriter();
	 writer.append("<html>")
			
		       .append("<body>")
		       .append("<h1>Dynamic data</h1>")
		       .append("<table>");
		       for (CompanyEntity companyEntity : campEntity) {
				
			
		    	writer.append("<tr>")
		       .append("<td>")
		       .append(companyEntity.getName())
		       .append("</td>")
		       .append("<td>")
		       .append(companyEntity.getFounder())
		       .append("</td>")
		       .append("<td>")
		       .append(companyEntity.getSince())
		       .append("</td>")
		       .append("<td>")
		       .append(companyEntity.getEmployees())
		       .append("</td>")
		       .append("<td>")
		       .append(companyEntity.getAddress())
		       .append("</td>")
		       .append("<td>")
		       .append(companyEntity.getBusiness())
		       .append("</td>")
		       .append("<tr>");
		       }
		       writer.append("</table>")
		        .append("<body>")
		
		        .append("</html>");	
			}
		 
	}
	

