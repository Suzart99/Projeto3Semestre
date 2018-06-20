package br.edu.ucsal.meucsal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.EncarregadoDAO;

import br.edu.ucsal.meucsal.model.Encarregado;



@WebServlet("/encarregado")
public class EncarregadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EncarregadoController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String q = request.getParameter("q");
		EncarregadoDAO eDAO = new EncarregadoDAO();
		
		if (q != null && q.equals("new")) {
			request.getRequestDispatcher("cadastroEnc.jsp").forward(request, response);
			return;
		}

		if (q != null && q.equals("editar")) {
			String id = request.getParameter("id");
			Encarregado enc = eDAO.getByID(Integer.parseInt(id));
			request.setAttribute("encarregado", enc);
			request.getRequestDispatcher("cadastroEnc.jsp").forward(request, response);
		}

		
		if (q != null && q.equals("excluir")) {
				String id = request.getParameter("id");
				eDAO.delete(Integer.parseInt(id));
		}
		
		request.setAttribute("lista", eDAO.listar());
		request.getRequestDispatcher("tabelaEnc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String cargo = request.getParameter("cargo");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		
		Encarregado e = new Encarregado(nome,cargo, login, senha);
		EncarregadoDAO eDAO = new EncarregadoDAO();
		
	
		
		if(id != null && !id.isEmpty()) {
			e.setEncarregadoId(Integer.parseInt(id));
			eDAO.update(e);
		}else {
			eDAO.inserir(e);
		}
		

		request.setAttribute("lista", eDAO.listar());
		request.getRequestDispatcher("tabelaEnc.jsp").forward(request, response);
		
		
	}

}
