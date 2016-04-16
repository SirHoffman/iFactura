package es.upm.dit.isst.iFactura2016;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class NuevaFacturaServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		Integer cantidad = Integer.parseInt(req.getParameter("cantidad"));
		Double consumo = Double.parseDouble(req.getParameter("consumo"));

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		Date fechaInicio = new java.util.Date();
		Date fechaFin = new java.util.Date();
		Date fechaEmision = new java.util.Date();
		try {
			fechaInicio = formatter.parse(req.getParameter("fechainicio"));
			fechaFin = formatter.parse(req.getParameter("fechafin"));
			fechaEmision = formatter.parse(req.getParameter("fechaemision"));

		} catch (ParseException e) {
			e.printStackTrace();
		}

		FacturaGas nuevaFacturaGas = new FacturaGas();
		nuevaFacturaGas.setCliente(1);
		nuevaFacturaGas.setConsumoFacturado(consumo);
		nuevaFacturaGas.setConsumoServicios(consumo);
		nuevaFacturaGas.setEmpresa("ETSIT");
		nuevaFacturaGas.setEquiposMedida(false);
		nuevaFacturaGas.setImporte((double) cantidad);
		nuevaFacturaGas.setPotenciaContratada((double) 3);
		nuevaFacturaGas.setPotenciaFacturada((double) 3);

		iFacturaDao.save(nuevaFacturaGas);

		obtenerFacturasGas(req, iFacturaDao);

		obtenerFacturasLuz(req, iFacturaDao);

		obtenerFacturasTelefono(req, iFacturaDao);

		RequestDispatcher view = req.getRequestDispatcher("/jsp/facturas.jsp");

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

		if (facturasGas != null && !facturasGas.isEmpty()) {
			req.setAttribute("existenFacturasGas", true);
			List<FacturaGasDto> facturasObtenidas = new ArrayList<>();
			for (FacturaGas factura : facturasGas) {
				FacturaGasDto facturaDevuelta = new FacturaGasDto();
				facturaDevuelta.setIdFactura(factura.getId());
				facturaDevuelta.setImporte(factura.getImporte());
				facturaDevuelta.setConsumo(factura.getConsumoFacturado());
				facturaDevuelta.setFechaEmision("1/4/2016");
				facturaDevuelta.setFechaInicio("1/1/2016");
				facturaDevuelta.setFechaFin("1/3/2016");

				facturasObtenidas.add(facturaDevuelta);

			}
			req.setAttribute("facturasGas", facturasObtenidas);
		}
	}
}
