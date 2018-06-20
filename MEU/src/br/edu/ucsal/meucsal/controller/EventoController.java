package br.edu.ucsal.meucsal.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ucsal.meucsal.dao.EncarregadoDAO;
import br.edu.ucsal.meucsal.dao.EventoDAO;
import br.edu.ucsal.meucsal.model.Encarregado;
import br.edu.ucsal.meucsal.model.Evento;

@WebServlet("/evento")
public class EventoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EventoController() {
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String q = request.getParameter("q");
		EventoDAO evtDAO = new EventoDAO ();
		
		if (q != null && q.equals("new")) {
			EncarregadoDAO encDAO = new EncarregadoDAO ();
			request.setAttribute("lista", encDAO.listar());
			request.getRequestDispatcher("cadastroEvento.jsp").forward(request, response);
		}

		if (q != null && q.equals("editar")) {
			EncarregadoDAO encDAO = new EncarregadoDAO ();
			request.setAttribute("lista", encDAO.listar());
			String id = request.getParameter("id");
			Evento evt = evtDAO.getByID(Integer.parseInt(id));
			request.setAttribute("evento", evt);
			request.getRequestDispatcher("cadastroEvento.jsp").forward(request, response);
		}

		
		if (q != null && q.equals("excluir")) {
				String id = request.getParameter("id");
				evtDAO.delete(Integer.parseInt(id));
		}
		
		request.setAttribute("lista", evtDAO.listar());
		request.getRequestDispatcher("tabelaEvento.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		Evento evt = new Evento();
		Integer encarregadoId = Integer.parseInt(request.getParameter("enc"));
		 
		String nome = request.getParameter("nome");
	    String tema = request.getParameter("tema");
		String data = request.getParameter("data");
		
		EncarregadoDAO encDAO = new EncarregadoDAO();
		Encarregado enc = encDAO.getByID(encarregadoId);
		
		
		evt.setNomeEvento(nome);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		evt.setData(LocalDate.parse(data, dateFormat));
		evt.setTema(tema);
		evt.setEnc(enc);
		
		EventoDAO evtDAO = new EventoDAO();
		
		if(id != null && !id.isEmpty()) {
			evt.setEventoId(Integer.parseInt(id));
			//evtDAO.update(evt);
		}else {
			evtDAO.inserir(evt);
		}
		
		
		
		
		request.setAttribute("lista", evtDAO.listar());
		request.getRequestDispatcher("tabelaEvento.jsp").forward(request, response);


	}

}
