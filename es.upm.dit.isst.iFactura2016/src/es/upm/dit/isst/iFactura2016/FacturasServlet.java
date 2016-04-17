package es.upm.dit.isst.iFactura2016;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.dao.impl.IFacturaDaoImpl;
import es.upm.dit.isst.iFactura2016.dto.FacturaGasDto;
import es.upm.dit.isst.iFactura2016.dto.FacturaLuzDto;
import es.upm.dit.isst.iFactura2016.dto.FacturaTelefonoDto;
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

@SuppressWarnings("serial")
public class FacturasServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		RequestDispatcher view = req.getRequestDispatcher("/jsp/facturas.jsp");

		// Se buscan todas las facturas en BBDD relativas al usuario y se envian
		// a la vista
		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		// Obtenemos el usuario de la sesion
		String nameUsuario = req.getUserPrincipal().getName();
		UsuariosCliente usuarioSesion = iFacturaDao.getUsuarioByName(nameUsuario);
		if (usuarioSesion == null) {
			usuarioSesion = iFacturaDao.getUsuarioByMail(nameUsuario);
		}
		Long idUsuario = usuarioSesion.getCliente();

		obtenerFacturasGas(req, iFacturaDao, idUsuario);

		obtenerFacturasLuz(req, iFacturaDao, idUsuario);

		obtenerFacturasTelefono(req, iFacturaDao, idUsuario);

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Obtener facturas telefono.
	 *
	 * @param req
	 *            the req
	 * @param ifacturaDao
	 *            the ifactura dao
	 * @param idUsuario
	 */
	private void obtenerFacturasTelefono(HttpServletRequest req, IFacturaDao ifacturaDao, Long idUsuario) {
		List<FacturaTelefono> facturasTelefono = ifacturaDao.getFacturasTelefonoByUser(idUsuario);
		List<FacturaTelefonoDto> facturasObtenidas = new ArrayList<FacturaTelefonoDto>();
		if (facturasTelefono != null && !facturasTelefono.isEmpty()) {
			req.setAttribute("existenFacturasTelefono", true);
			for (FacturaTelefono factura : facturasTelefono) {
				FacturaTelefonoDto facturaDevuelta = new FacturaTelefonoDto();
				facturaDevuelta.setId(factura.getId());
				facturaDevuelta.setCliente(factura.getCliente());
				facturaDevuelta.setNombre(factura.getNombre());
				facturaDevuelta.setCompania(factura.getEmpresa());
				facturaDevuelta.setImporte(factura.getImporte());
				facturaDevuelta.setDatosContratados(factura.getDatosContratados());
				facturaDevuelta.setDatosConsumidos(factura.getDatosConsumidos());
				facturaDevuelta.setLte(factura.getLte());
				facturaDevuelta.setVozContratada(factura.getVozContratada());
				facturaDevuelta.setVozConsumida(factura.getVozConsumida());
				facturaDevuelta.setFranjaHoraria(factura.getFranjaHoraria());
				facturaDevuelta.setFecha(factura.getFecha().toString());

				facturasObtenidas.add(facturaDevuelta);
			}
			req.setAttribute("facturasTelefono", facturasObtenidas);
		}
	}

	/**
	 * Obtener facturas luz.
	 *
	 * @param req
	 *            the req
	 * @param ifacturaDao
	 *            the ifactura dao
	 * @param idUsuario
	 */
	private void obtenerFacturasLuz(HttpServletRequest req, IFacturaDao ifacturaDao, Long idUsuario) {
		List<FacturaLuz> facturasLuz = ifacturaDao.getFacturasLuzByUser(idUsuario);
		List<FacturaLuzDto> facturasObtenidas = new ArrayList<FacturaLuzDto>();

		if (facturasLuz != null && !facturasLuz.isEmpty()) {
			req.setAttribute("existenFacturasLuz", true);
			for (FacturaLuz factura : facturasLuz) {
				FacturaLuzDto facturaDevuelta = new FacturaLuzDto();
				facturaDevuelta.setIdFactura(factura.getId());
				facturaDevuelta.setEmpresa(factura.getEmpresa());
				facturaDevuelta.setImporte(factura.getImporte());
				facturaDevuelta.setPotenciaContratada(factura.getPotenciaContratada());
				facturaDevuelta.setPotenciaFacturada(factura.getPotenciaFacturada());
				facturaDevuelta.setConsumoFacturado(factura.getConsumoFacturado());
				facturaDevuelta.setConsumoServicios(factura.getConsumoServicios());

				facturasObtenidas.add(facturaDevuelta);

			}
			req.setAttribute("facturasLuz", facturasObtenidas);
		}
	}

	/**
	 * Obtener facturas gas.
	 *
	 * @param req
	 *            the req
	 * @param ifacturaDao
	 *            the ifactura dao
	 * @param idUsuario
	 */
	private void obtenerFacturasGas(HttpServletRequest req, IFacturaDao ifacturaDao, Long idUsuario) {
		List<FacturaGas> facturasGas = ifacturaDao.getFacturasGasByUser(idUsuario);

		if (facturasGas != null && !facturasGas.isEmpty()) {
			req.setAttribute("existenFacturasGas", true);
			List<FacturaGasDto> facturasObtenidas = new ArrayList<FacturaGasDto>();
			for (FacturaGas factura : facturasGas) {
				FacturaGasDto facturaDevuelta = new FacturaGasDto();
				facturaDevuelta.setIdFactura(factura.getId());
				facturaDevuelta.setEmpresa(factura.getEmpresa());
				facturaDevuelta.setImporte(factura.getImporte());
				facturaDevuelta.setPotenciaContratada(factura.getPotenciaContratada());
				facturaDevuelta.setPotenciaFacturada(factura.getPotenciaFacturada());
				facturaDevuelta.setConsumoFacturado(factura.getConsumoFacturado());
				facturaDevuelta.setConsumoServicios(factura.getConsumoServicios());

				facturasObtenidas.add(facturaDevuelta);

			}
			req.setAttribute("facturasGas", facturasObtenidas);
		}
	}
}
