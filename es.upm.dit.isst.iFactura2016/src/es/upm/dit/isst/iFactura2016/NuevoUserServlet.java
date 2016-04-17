package es.upm.dit.isst.iFactura2016;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.dao.impl.IFacturaDaoImpl;
import es.upm.dit.isst.iFactura2016.model.Clientes;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

@SuppressWarnings("serial")
public class NuevoUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellidos");
		Integer edad = Integer.parseInt(req.getParameter("edad"));
		String dni = req.getParameter("dni");
		Integer codigoPostal = Integer.parseInt(req.getParameter("codigopostal"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		// Creamos el id propio de usuario
		// TODO: Revisar modelo de datos
		Long cliente = ThreadLocalRandom.current().nextLong();

		// Insertamos en la tabla Clientes
		Clientes newCliente = new Clientes();
		newCliente.setId(cliente);
		// Por defecto a false
		newCliente.setReciboOfertas(false);
		iFacturaDao.save(newCliente);

		// Insertamos en la tabla Usuarios Cliente
		UsuariosCliente newUsuarioCliente = new UsuariosCliente();
		newUsuarioCliente.setCliente(cliente);
		newUsuarioCliente.setNombre(nombre);
		newUsuarioCliente.setApellido(apellido);
		newUsuarioCliente.setEdad(edad);
		newUsuarioCliente.setDni(dni);
		newUsuarioCliente.setCodigoPostal(codigoPostal);
		newUsuarioCliente.setEmail(email);
		newUsuarioCliente.setPassword(password);
		iFacturaDao.save(newUsuarioCliente);

		RequestDispatcher view = req.getRequestDispatcher("/jsp/main.jsp");

		req.getSession().setAttribute("user", nombre);

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}
}
