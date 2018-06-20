package br.edu.ucsal.meucsal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.LoginDAO;


@WebServlet("/loginadm")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		LoginDAO lDAO = new LoginDAO();
		
		if(lDAO.validar(login, senha)){
			
		
		//response.sendRedirect("homeAdmin.jsp");
		request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
		
		}
		
}
}