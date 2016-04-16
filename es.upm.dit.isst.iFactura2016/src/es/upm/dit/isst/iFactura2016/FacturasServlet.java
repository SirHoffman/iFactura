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
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;

@SuppressWarnings("serial")
public class FacturasServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		RequestDispatcher view = req.getRequestDispatcher("/jsp/facturas.jsp");

		// Se buscan todas las facturas en BBDD relativas al usuario y se envian
		// a la vista
		IFacturaDao ifacturaDao = IFacturaDaoImpl.getInstance();

		obtenerFacturasGas(req, ifacturaDao);

		obtenerFacturasLuz(req, ifacturaDao);

		obtenerFacturasTelefono(req, ifacturaDao);

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}

	private void obtenerFacturasTelefono(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaTelefono> facturasTelefono = ifacturaDao.getFacturasTelefonoByUser(1);
		if (facturasTelefono != null && !facturasTelefono.isEmpty()) {
			req.setAttribute("existenFacturasTelefono", true);
			req.setAttribute("facturasTelefono", facturasTelefono);
		}
	}

	private void obtenerFacturasLuz(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaLuz> facturasLuz = ifacturaDao.getFacturasLuzByUser(1);
		if (facturasLuz != null && !facturasLuz.isEmpty()) {
			req.setAttribute("existenFacturasLuz", true);
			req.setAttribute("facturasLuz", facturasLuz);
		}
	}

	private void obtenerFacturasGas(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaGas> facturasGas = ifacturaDao.getFacturasGasByUser(1);
		// TODO: MOCKUP PRUEBAS
		req.setAttribute("existenFacturasGas", true);
		List<FacturaGasDto> facturasObtenidas = new ArrayList<>();

		FacturaGasDto facturaDevuelta = new FacturaGasDto();
		facturaDevuelta.setIdFactura(1);
		facturaDevuelta.setImporte(3);
		facturaDevuelta.setConsumo((double) 280);
		facturaDevuelta.setFechaEmision("1/4/2016");
		facturaDevuelta.setFechaInicio("1/1/2016");
		facturaDevuelta.setFechaFin("1/3/2016");

		facturasObtenidas.add(facturaDevuelta);
		req.setAttribute("facturasGas", facturasObtenidas);

		// TODO: FIN MOCKUP
		if (facturasGas != null && !facturasGas.isEmpty()) {
			req.setAttribute("existenFacturasGas", true);

			for (FacturaGas factura : facturasGas) {
				// FacturaGasDto facturaDevuelta = new FacturaGasDto();
				facturaDevuelta.setIdFactura(1);
				facturaDevuelta.setImporte(3);
				facturaDevuelta.setConsumo((double) 280);
				facturaDevuelta.setFechaEmision("1/4/2016");
				facturaDevuelta.setFechaInicio("1/1/2016");
				facturaDevuelta.setFechaFin("1/3/2016");

				facturasObtenidas.add(facturaDevuelta);

			}
			req.setAttribute("facturasGas", facturasObtenidas);
		}
	}
}
