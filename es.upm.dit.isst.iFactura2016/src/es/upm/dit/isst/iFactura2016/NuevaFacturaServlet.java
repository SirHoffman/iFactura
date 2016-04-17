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
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;

/**
 * The Class NuevaFacturaServlet.
 */
@SuppressWarnings("serial")
public class NuevaFacturaServlet extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		IFacturaDao iFacturaDao = IFacturaDaoImpl.getInstance();

		String tipoFactura = req.getParameter("tipo");
		if (tipoFactura.compareToIgnoreCase("gas") == 0) {
			saveFacturaGas(req, iFacturaDao);
		} else if (tipoFactura.compareToIgnoreCase("luz") == 0) {
			saveFacturaLuz(req, iFacturaDao);
		} else if (tipoFactura.compareToIgnoreCase("telefono") == 0) {

		} else {
			throw new IOException("ERROR AL CREAR FACTURA");
		}

		obtenerFacturasGas(req, iFacturaDao);

		obtenerFacturasLuz(req, iFacturaDao);

		obtenerFacturasTelefono(req, iFacturaDao);

		RequestDispatcher view = req.getRequestDispatcher("/facturas");

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Save factura gas.
	 *
	 * @param req
	 *            the req
	 * @param iFacturaDao
	 *            the i factura dao
	 */
	private void saveFacturaGas(HttpServletRequest req, IFacturaDao iFacturaDao) {
		String empresa = req.getParameter("empresa");
		Double importe = Double.parseDouble(req.getParameter("importe"));
		Double potenciaContratada = Double.parseDouble(req.getParameter("potenciaContratada"));
		Double potenciaFacturada = Double.parseDouble(req.getParameter("potenciaFacturada"));
		Double consumoFacturado = Double.parseDouble(req.getParameter("consumoFacturado"));
		Double consumoServicios = Double.parseDouble(req.getParameter("consumoServicios"));
		Boolean equiposMedida = Boolean.valueOf(req.getParameter("equiposMedida"));

		FacturaGas nuevaFacturaGas = new FacturaGas();
		nuevaFacturaGas.setCliente(1);
		nuevaFacturaGas.setConsumoFacturado(consumoFacturado);
		nuevaFacturaGas.setConsumoServicios(consumoServicios);
		nuevaFacturaGas.setEmpresa(empresa);
		nuevaFacturaGas.setEquiposMedida(equiposMedida);
		nuevaFacturaGas.setImporte(importe);
		nuevaFacturaGas.setPotenciaContratada(potenciaContratada);
		nuevaFacturaGas.setPotenciaFacturada(potenciaFacturada);

		iFacturaDao.save(nuevaFacturaGas);
	}

	/**
	 * Save factura luz.
	 *
	 * @param req
	 *            the req
	 * @param iFacturaDao
	 *            the i factura dao
	 */
	private void saveFacturaLuz(HttpServletRequest req, IFacturaDao iFacturaDao) {
		String empresa = req.getParameter("empresa");
		Double importe = Double.parseDouble(req.getParameter("importe"));
		Double potenciaContratada = Double.parseDouble(req.getParameter("potenciaContratada"));
		Double potenciaFacturada = Double.parseDouble(req.getParameter("potenciaFacturada"));
		Double consumoFacturado = Double.parseDouble(req.getParameter("consumoFacturado"));
		Double consumoServicios = Double.parseDouble(req.getParameter("consumoServicios"));
		Boolean equiposMedida = Boolean.valueOf(req.getParameter("equiposMedida"));

		FacturaLuz nuevaFacturaLuz = new FacturaLuz();
		nuevaFacturaLuz.setCliente(1);
		nuevaFacturaLuz.setConsumoFacturado(consumoFacturado);
		nuevaFacturaLuz.setConsumoServicios(consumoServicios);
		nuevaFacturaLuz.setEmpresa(empresa);
		nuevaFacturaLuz.setEquiposMedida(equiposMedida);
		nuevaFacturaLuz.setImporte(importe);
		nuevaFacturaLuz.setPotenciaContratada(potenciaContratada);
		nuevaFacturaLuz.setPotenciaFacturada(potenciaFacturada);

		iFacturaDao.save(nuevaFacturaLuz);
	}

	/**
	 * Obtener facturas telefono.
	 *
	 * @param req
	 *            the req
	 * @param ifacturaDao
	 *            the ifactura dao
	 */
	private void obtenerFacturasTelefono(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaTelefono> facturasTelefono = ifacturaDao.getFacturasTelefonoByUser(1);
		if (facturasTelefono != null && !facturasTelefono.isEmpty()) {
			req.setAttribute("existenFacturasTelefono", true);
			req.setAttribute("facturasTelefono", facturasTelefono);
		}
	}

	/**
	 * Obtener facturas luz.
	 *
	 * @param req
	 *            the req
	 * @param ifacturaDao
	 *            the ifactura dao
	 */
	private void obtenerFacturasLuz(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaLuz> facturasLuz = ifacturaDao.getFacturasLuzByUser(1);
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
	 */
	private void obtenerFacturasGas(HttpServletRequest req, IFacturaDao ifacturaDao) {
		List<FacturaGas> facturasGas = ifacturaDao.getFacturasGasByUser(1);

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
