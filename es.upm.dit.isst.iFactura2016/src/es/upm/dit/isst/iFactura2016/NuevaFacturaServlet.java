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
import es.upm.dit.isst.iFactura2016.dto.FacturaLuzDto;
import es.upm.dit.isst.iFactura2016.dto.FacturaTelefonoDto;
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

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

		// Obtenemos el usuario de la sesion
		String nameUsuario = (String) req.getSession().getAttribute("user");
		UsuariosCliente usuarioSesion = iFacturaDao.getUsuarioByName(nameUsuario);
		if (usuarioSesion == null) {
			usuarioSesion = iFacturaDao.getUsuarioByMail(nameUsuario);
		}
		Long idUsuario = usuarioSesion.getCliente();

		String tipoFactura = req.getParameter("tipo");
		if (tipoFactura.compareToIgnoreCase("gas") == 0) {
			saveFacturaGas(req, iFacturaDao, idUsuario);
		} else if (tipoFactura.compareToIgnoreCase("luz") == 0) {
			saveFacturaLuz(req, iFacturaDao, idUsuario);
		} else if (tipoFactura.compareToIgnoreCase("telefono") == 0) {
			saveFacturaTelefono(req, iFacturaDao, idUsuario);
		} else {
			throw new IOException("ERROR AL CREAR FACTURA");
		}

		obtenerFacturasGas(req, iFacturaDao, idUsuario);

		obtenerFacturasLuz(req, iFacturaDao, idUsuario);

		obtenerFacturasTelefono(req, iFacturaDao, idUsuario);

		RequestDispatcher view = req.getRequestDispatcher("/jsp/home.jsp");

		try {
			view.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Save factura telefono.
	 *
	 * @param req
	 *            the req
	 * @param iFacturaDao
	 *            the i factura dao
	 * @param idUsuario
	 */
	private void saveFacturaTelefono(HttpServletRequest req, IFacturaDao iFacturaDao, Long idUsuario) {
		String nombre = req.getParameter("nombre");
		String compania = req.getParameter("compania");
		Double importe = Double.parseDouble(req.getParameter("importe"));
		Double datosContratados = Double.parseDouble(req.getParameter("datoscontratados"));
		Double datosConsumidos = Double.parseDouble(req.getParameter("datosconsumidos"));
		Boolean lte = Boolean.parseBoolean("lte");
		Double vozContratada = Double.parseDouble(req.getParameter("vozcontratada"));
		Double vozConsumida = Double.parseDouble(req.getParameter("vozconsumida"));
		String franjaHoraria = req.getParameter("franjahoraria");

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = new Date();
		try {
			fecha = formatter.parse(req.getParameter("fecha"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		FacturaTelefono newFacturaTelefono = new FacturaTelefono();
		newFacturaTelefono.setCliente(idUsuario);
		newFacturaTelefono.setNombre(nombre);
		newFacturaTelefono.setEmpresa(compania);
		newFacturaTelefono.setImporte(importe);
		newFacturaTelefono.setDatosContratados(datosContratados);
		newFacturaTelefono.setDatosConsumidos(datosConsumidos);
		newFacturaTelefono.setLte(lte);
		newFacturaTelefono.setVozContratada(vozContratada);
		newFacturaTelefono.setVozConsumida(vozConsumida);
		newFacturaTelefono.setFranjaHoraria(franjaHoraria);
		newFacturaTelefono.setFecha(fecha);

		iFacturaDao.save(newFacturaTelefono);

	}

	/**
	 * Save factura gas.
	 *
	 * @param req
	 *            the req
	 * @param iFacturaDao
	 *            the i factura dao
	 * @param idUsuario
	 */
	private void saveFacturaGas(HttpServletRequest req, IFacturaDao iFacturaDao, Long idUsuario) {
		String empresa = req.getParameter("empresa");
		Double importe = Double.parseDouble(req.getParameter("importe"));
		Double potenciaContratada = Double.parseDouble(req.getParameter("potenciaContratada"));
		Double potenciaFacturada = Double.parseDouble(req.getParameter("potenciaFacturada"));
		Double consumoFacturado = Double.parseDouble(req.getParameter("consumoFacturado"));
		Double consumoServicios = Double.parseDouble(req.getParameter("consumoServicios"));
		Boolean equiposMedida = Boolean.valueOf(req.getParameter("equiposMedida"));

		FacturaGas nuevaFacturaGas = new FacturaGas();
		nuevaFacturaGas.setCliente(idUsuario);
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
	 * @param idUsuario
	 */
	private void saveFacturaLuz(HttpServletRequest req, IFacturaDao iFacturaDao, Long idUsuario) {
		String empresa = req.getParameter("empresa");
		Double importe = Double.parseDouble(req.getParameter("importe"));
		Double potenciaContratada = Double.parseDouble(req.getParameter("potenciaContratada"));
		Double potenciaFacturada = Double.parseDouble(req.getParameter("potenciaFacturada"));
		Double consumoFacturado = Double.parseDouble(req.getParameter("consumoFacturado"));
		Double consumoServicios = Double.parseDouble(req.getParameter("consumoServicios"));
		Boolean equiposMedida = Boolean.valueOf(req.getParameter("equiposMedida"));

		FacturaLuz nuevaFacturaLuz = new FacturaLuz();
		nuevaFacturaLuz.setCliente(idUsuario);
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
