package es.upm.dit.isst.iFactura2016.dao;

import java.util.List;

import es.upm.dit.isst.iFactura2016.model.Clientes;
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

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

	/**
	 * Save.
	 *
	 * @param nuevaFacturaGas
	 *            the nueva factura gas
	 * @return the factura gas
	 */
	public FacturaGas save(FacturaGas nuevaFacturaGas);

	/**
	 * Save.
	 *
	 * @param nuevaFacturaTelefono
	 *            the nueva factura telefono
	 * @return the factura telefono
	 */
	public FacturaTelefono save(FacturaTelefono nuevaFacturaTelefono);

	/**
	 * Save.
	 *
	 * @param nuevaFacturaLuz
	 *            the nueva factura luz
	 * @return the factura luz
	 */
	public FacturaLuz save(FacturaLuz nuevaFacturaLuz);

	/**
	 * Save.
	 *
	 * @param newCliente
	 *            the new cliente
	 * @return 
	 */
	public Clientes save(Clientes newCliente);

	/**
	 * Save.
	 *
	 * @param newUsuarioCliente
	 *            the new usuario cliente
	 * @return 
	 */
	public UsuariosCliente save(UsuariosCliente newUsuarioCliente);

}
