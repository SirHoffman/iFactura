package es.upm.dit.isst.iFactura2016.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.emf.EMFService;
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;

/**
 * The Class IFacturaDaoImpl.
 */
@SuppressWarnings("unchecked")
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

	@Override
	public List<FacturaGas> getFacturasGasByUser(Integer idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select gas from FacturaGas gas where cliente = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaGas> facturasGas = q.getResultList();
		em.close();
		return facturasGas;
	}

	@Override
	public List<FacturaLuz> getFacturasLuzByUser(Integer idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select luz from FacturaLuz luz where cliente = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaLuz> facturasLuz = q.getResultList();
		em.close();
		return facturasLuz;
	}

	@Override
	public List<FacturaTelefono> getFacturasTelefonoByUser(Integer idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select telf from FacturaTelefono telf where nombre = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaTelefono> facturasTelefono = q.getResultList();
		em.close();
		return facturasTelefono;
	}

}
