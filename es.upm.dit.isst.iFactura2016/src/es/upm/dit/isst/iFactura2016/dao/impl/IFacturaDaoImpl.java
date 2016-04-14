package es.upm.dit.isst.iFactura2016.dao.impl;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;

/**
 * The Class IFacturaDaoImpl.
 */
public class IFacturaDaoImpl implements IFacturaDao {

	/** The instance. */
	private static IFacturaDaoImpl instance;

	/**
	 * Instantiates a new i factura dao impl.
	 */
	private IFacturaDaoImpl() {

	}

	/**
	 * Gets the single instance of IFacturaDaoImpl.
	 *
	 * @return single instance of IFacturaDaoImpl
	 */
	public static IFacturaDaoImpl getInstance() {
		if (instance == null) {
			instance = new IFacturaDaoImpl();
		}
		return instance;
	}

}
