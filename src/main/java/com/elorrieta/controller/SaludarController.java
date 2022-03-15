package com.elorrieta.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaludarController
 */
@WebServlet("/saludar-controller")
public class SaludarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// recibir el PARAMETRO del formulario
		String nombre = request.getParameter("nombre");
		
		// enviamos ATRIBUTOS a la vista
		request.setAttribute("saludo", "Kaixo " + nombre);
		
		
		// ir a la Vista
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
