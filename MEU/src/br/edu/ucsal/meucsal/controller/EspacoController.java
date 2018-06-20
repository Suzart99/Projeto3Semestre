package br.edu.ucsal.meucsal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.EspacoDAO;
import br.edu.ucsal.meucsal.dao.EventoDAO;
import br.edu.ucsal.meucsal.dao.LocalDAO;
import br.edu.ucsal.meucsal.model.Espaco;


@WebServlet("/espaco")
public class EspacoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EspacoController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String q = request.getParameter("q");
		EspacoDAO eDAO = new EspacoDAO();
		
		if (q != null && q.equals("new")) {
			LocalDAO lDAO = new LocalDAO ();
			request.setAttribute("lista", lDAO.listar());
			
			EventoDAO evtDAO = new EventoDAO ();
			request.setAttribute("lista", evtDAO.listar());
			
			request.getRequestDispatcher("cadastroEspaco.jsp").forward(request, response);
		}
		
	

		if (q != null && q.equals("editar")) {
			String id = request.getParameter("id");
			Espaco espaco = eDAO.getByID(Integer.parseInt(id));
			request.setAttribute("espaco", espaco);
			request.getRequestDispatcher("cadastroEspaco.jsp").forward(request, response);
		}

		
		if (q != null && q.equals("excluir")) {
				String id = request.getParameter("id");
				eDAO.delete(Integer.parseInt(id));
		}
		
		request.setAttribute("lista", eDAO.listar());
		request.getRequestDispatcher("tabelaEspaco.jsp").forward(request, response);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id = request.getParameter("id");
		System.out.println(id);
		
		String nome = request.getParameter("nome");
		System.out.println(nome);
		Integer capMax = Integer.parseInt(request.getParameter("capMax"));
		Espaco e1 = new Espaco(nome, capMax);
		EspacoDAO eDAO = new EspacoDAO();
		
		
		
		if(id != null && !id.isEmpty()) {
			e1.setEspacoId(Integer.parseInt(id));
			eDAO.update(e1);
		}else {
			eDAO.inserir(e1);
		}
		

		request.setAttribute("lista", eDAO.listar());
		request.getRequestDispatcher("tabelaEspaco.jsp").forward(request, response);

		
		
	}

}
