package com.elorrieta.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListadoAlumnosController
 */
@WebServlet("/listado-alumnos")
public class ListadoAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO llamar al DAO para recuperar lista de alumnos
		
		
		// enviar datos (ATRIBUTOS) a la vista
		ArrayList<String> alumnos = new ArrayList<String>();
		alumnos.add("pepe");
		alumnos.add("marioanita");
		alumnos.add("fulanita");
		alumnos.add("menganita");
		
		request.setAttribute("alumnos", alumnos );
		request.setAttribute("titulo", "Listado Alumnos");
		
		
		// ir a la Vista
		request.getRequestDispatcher("listado.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
