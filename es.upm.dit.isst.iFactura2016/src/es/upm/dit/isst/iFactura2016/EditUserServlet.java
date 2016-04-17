package es.upm.dit.isst.iFactura2016;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.dao.impl.IFacturaDaoImpl;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

@SuppressWarnings("serial")
public class EditUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellidos");
		Integer edad = Integer.parseInt(req.getParameter("edad"));
		String dni = req.getParameter("dni");
		Integer codigoPostal = Integer.parseInt(req.getParameter("codigopostal"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		// Obtenemos el usuario de la sesion
		String nameUsuario = req.getUserPrincipal().getName();
		UsuariosCliente usuarioSesion = iFacturaDao.getUsuarioByName(nameUsuario);
		if (usuarioSesion == null) {
			usuarioSesion = iFacturaDao.getUsuarioByMail(nameUsuario);
		}
		Long id = usuarioSesion.getId();
		Long cliente = usuarioSesion.getCliente();

		// Insertamos en la tabla Usuarios Cliente
		UsuariosCliente updateUsuarioCliente = new UsuariosCliente();
		updateUsuarioCliente.setId(id);
		updateUsuarioCliente.setCliente(cliente);
		updateUsuarioCliente.setNombre(nombre);
		updateUsuarioCliente.setApellido(apellido);
		updateUsuarioCliente.setEdad(edad);
		updateUsuarioCliente.setDni(dni);
		updateUsuarioCliente.setCodigoPostal(codigoPostal);
		updateUsuarioCliente.setEmail(email);
		updateUsuarioCliente.setPassword(password);
		iFacturaDao.update(updateUsuarioCliente);

		RequestDispatcher view = req.getRequestDispatcher("/jsp/home.jsp");

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}
}
