package com.ensup.Ensup.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.Ensup.dao.FormationDao;
import eu.ensup.Ensup.domaine.Formation;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GestionServlet
 */

@WebServlet("/Accueil")
public class GestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		CoursDao cd = new CoursDao();
		Cours c = new Cours(request.getParameter("cours"));
		cd.creerCours(c);
		this.getServletContext().getRequestDispatcher("cours.jsp").forward( request, response );
		
		EtudiantDao ed = new EtudiantDao();
		Etudiant e = new Etudiant(request.getParameter("etudiant"));
		ed.creerEtudiant(e);
		this.getServletContext().getRequestDispatcher("etudiant.jsp").forward( request, response );
	}

}
