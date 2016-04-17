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
	 * @param idUsuario
	 *            the id user
	 * @return the facturas gas by user
	 */
	public List<FacturaGas> getFacturasGasByUser(Long idUsuario);

	/**
	 * Gets the facturas luz by user.
	 *
	 * @param idUsuario
	 *            the id user
	 * @return the facturas luz by user
	 */
	public List<FacturaLuz> getFacturasLuzByUser(Long idUsuario);

	/**
	 * Gets the facturas telefono by user.
	 *
	 * @param idUsuario
	 *            the id user
	 * @return the facturas telefono by user
	 */
	public List<FacturaTelefono> getFacturasTelefonoByUser(Long idUsuario);

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

	/**
	 * Update.
	 *
	 * @param updateUsuarioCliente
	 *            the update usuario cliente
	 * @return
	 */
	public UsuariosCliente update(UsuariosCliente updateUsuarioCliente);

	/**
	 * Gets the usuario by name.
	 *
	 * @param nameUsuario
	 *            the name usuario
	 * @return the usuario by name
	 */
	public UsuariosCliente getUsuarioByName(String nameUsuario);

	/**
	 * Gets the usuario by mail.
	 *
	 * @param mailUsuario
	 *            the mail usuario
	 * @return the usuario by mail
	 */
	public UsuariosCliente getUsuarioByMail(String mailUsuario);

}
