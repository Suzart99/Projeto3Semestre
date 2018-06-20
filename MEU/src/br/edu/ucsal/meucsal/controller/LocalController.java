package br.edu.ucsal.meucsal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.LocalDAO;
import br.edu.ucsal.meucsal.model.Local;



/**
 * Servlet implementation class LocalController
 */
@WebServlet("/local")
public class LocalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LocalController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String q = request.getParameter("q");
		
		LocalDAO lDAO = new LocalDAO ();
		
		if (q != null && q.equals("new")) {
			request.getRequestDispatcher("cadastroLocal.jsp").forward(request, response);
			return;
		}
		
	
		if (q != null && q.equals("editar")) {
			String id = request.getParameter("id");
			Local local = lDAO.getByID(Integer.parseInt(id));
			request.setAttribute("local", local);
			request.getRequestDispatcher("cadastroLocal.jsp").forward(request, response);
		}

		
		if (q != null && q.equals("excluir")) {
				String id = request.getParameter("id");
				lDAO.delete(Integer.parseInt(id));
		}
		
		request.setAttribute("lista", lDAO.listar());
		request.getRequestDispatcher("tabelaLocal.jsp").forward(request, response);
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		
		 String campus = request.getParameter("campus");
		 String andar = request.getParameter("andar");
		 String bloco = request.getParameter("bloco")  ;
		
		 Local local = new Local(campus, andar, bloco);
		 LocalDAO lDAO = new LocalDAO ();
		
		
		
		if(id != null && !id.isEmpty()) {
			local.setLocalId(Integer.parseInt(id));
			lDAO.update(local);
		}else {
			lDAO.inserir(local);
		}
		

		request.setAttribute("lista", lDAO.listar());
		request.getRequestDispatcher("tabelaLocal.jsp").forward(request, response);

			
	}

}
