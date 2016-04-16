package es.upm.dit.isst.iFactura2016.dao;

import java.util.List;

import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;

/**
 * The Interface IFacturaDao.
 */
public interface IFacturaDao {

	/**
	 * Gets the facturas gas by user.
	 *
	 * @param idUser
	 *            the id user
	 * @return the facturas gas by user
	 */
	public List<FacturaGas> getFacturasGasByUser(Integer idUser);

	/**
	 * Gets the facturas luz by user.
	 *
	 * @param idUser
	 *            the id user
	 * @return the facturas luz by user
	 */
	public List<FacturaLuz> getFacturasLuzByUser(Integer idUser);

	/**
	 * Gets the facturas telefono by user.
	 *
	 * @param idUser
	 *            the id user
	 * @return the facturas telefono by user
	 */
	public List<FacturaTelefono> getFacturasTelefonoByUser(Integer idUser);

}
