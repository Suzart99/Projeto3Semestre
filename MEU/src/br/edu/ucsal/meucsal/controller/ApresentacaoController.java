package br.edu.ucsal.meucsal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.ApresentacaoDAO;
import br.edu.ucsal.meucsal.dao.EventoDAO;

@WebServlet("/ApresentacaoController")
public class ApresentacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ApresentacaoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String q = request.getParameter("q");
		if (q != null && q.equals("new")) {
			EventoDAO evtDAO = new EventoDAO();
			request.setAttribute("lista", evtDAO.listar());
			request.getRequestDispatcher("reservaform.jsp").forward(request, response);
		}else {
			ApresentacaoDAO aDAO = new ApresentacaoDAO();
			request.setAttribute("lista", aDAO.listar());
			request.getRequestDispatcher("reservalist.jsp").forward(request, response);
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String apresentacaoId = request.getParameter("id");
			
			String sinopse = request.getParameter("sinopse");
			String hora = request.getParameter("hora");
			//String 
		
			
	}

}
