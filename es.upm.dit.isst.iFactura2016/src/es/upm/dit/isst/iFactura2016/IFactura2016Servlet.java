package es.upm.dit.isst.iFactura2016;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.dao.impl.IFacturaDaoImpl;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

@SuppressWarnings("serial")
public class IFactura2016Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		UserService userService = UserServiceFactory.getUserService();
		String url = userService.createLoginURL(req.getRequestURI());
		String urlLinktext = "Login";
		String user = null;

		RequestDispatcher view = req.getRequestDispatcher("/jsp/login.jsp");

		if (req.getUserPrincipal() != null) {

			// Comprobamos si existe un usuario registrado con ese nombre
			// si no existe se pedir� registro
			String nameUsuario = req.getUserPrincipal().getName();
			UsuariosCliente usuarioSesion = iFacturaDao.getUsuarioByName(nameUsuario);
			if (usuarioSesion == null) {
				usuarioSesion = iFacturaDao.getUsuarioByMail(nameUsuario);
			}
			if (usuarioSesion != null) {

				user = req.getUserPrincipal().getName();
				url = userService.createLogoutURL(req.getRequestURI());
				urlLinktext = "Logout";

				view = req.getRequestDispatcher("/jsp/home.jsp");
			} else {
				req.getSession().setAttribute("alert", "El usuario no existe");
			}
		}
		req.getSession().setAttribute("user", user);
		req.getSession().setAttribute("url", url);
		req.getSession().setAttribute("urlLinktext", urlLinktext);

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}
}
