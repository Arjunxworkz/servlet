package com.xworkz.primeminister;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3, urlPatterns = "/Pm")
public class PrimeMinisterServlet extends HttpServlet{
private static final Object Name = null;
private static final Object Country = null;
private static final Object Marriage = null;
private static final Object Party = null;
private static final Object Age = null;
private static final Object Gender = null;
private static final Object Repersent = null;

public PrimeMinisterServlet() {
	System.out.println("PrimeMinister");
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running do post method");
		String name=req.getParameter("Name");
		String country=req.getParameter("Country");
		String marriage=req.getParameter("Marriage");
		String party=req.getParameter("Party");
		String age=req.getParameter("Age");
		String gender=req.getParameter("Gender");
		String periodAs=req.getParameter("PeriodAs");
		String timesRepersented=req.getParameter("Repersent");
		
		
		req.setAttribute("Nm", name);
		req.setAttribute("Ct", country);
		req.setAttribute("Mar", marriage);
		req.setAttribute("Prt", party);
		req.setAttribute("Ag", age);
		req.setAttribute("gn", gender);
		req.setAttribute("pr", periodAs);
		req.setAttribute("Rpt", timesRepersented);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/contect.jsp");
		dispatcher.forward(req, resp);
		
	}
}
