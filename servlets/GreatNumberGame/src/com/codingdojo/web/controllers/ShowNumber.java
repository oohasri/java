package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowNumber
 */
@WebServlet("/ShowNumber")
public class ShowNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		if(session.getAttribute("random") == null) {
			int random = (int) ((Math.random() * ((100 - 0) + 1)) + 0);
			session.setAttribute("random", random);
		}
		String number = request.getParameter("number");  
		if(Integer.parseInt(number) > (int)session.getAttribute("random")) {
			String message = "Number is High";
			request.setAttribute("message", message);
		}
		if(Integer.parseInt(number) < (int)session.getAttribute("random")) {
			String message = "Number is Low";
			request.setAttribute("message", message);
		}
		else if(Integer.parseInt(number)==((int)(session.getAttribute("random")))){
			String message = "yay!";
			request.setAttribute("message", message);
		}
        request.setAttribute("number", number);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
        view.forward(request, response);
//		doGet(request, response);
	}

}
