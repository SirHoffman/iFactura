package es.upm.dit.isst.iFactura2016.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import es.upm.dit.isst.iFactura2016.dao.IFacturaDao;
import es.upm.dit.isst.iFactura2016.emf.EMFService;
import es.upm.dit.isst.iFactura2016.model.Clientes;
import es.upm.dit.isst.iFactura2016.model.FacturaGas;
import es.upm.dit.isst.iFactura2016.model.FacturaLuz;
import es.upm.dit.isst.iFactura2016.model.FacturaTelefono;
import es.upm.dit.isst.iFactura2016.model.UsuariosCliente;

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
	public List<FacturaGas> getFacturasGasByUser(Long idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select gas from FacturaGas gas where cliente = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaGas> facturasGas = q.getResultList();
		em.close();
		return facturasGas;
	}

	@Override
	public List<FacturaLuz> getFacturasLuzByUser(Long idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select luz from FacturaLuz luz where cliente = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaLuz> facturasLuz = q.getResultList();
		em.close();
		return facturasLuz;
	}

	@Override
	public List<FacturaTelefono> getFacturasTelefonoByUser(Long idUser) {

		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select telf from FacturaTelefono telf where nombre = :cliente ");
		q.setParameter("cliente", idUser);

		List<FacturaTelefono> facturasTelefono = q.getResultList();
		em.close();
		return facturasTelefono;
	}

	@Override
	public FacturaGas save(FacturaGas nuevaFacturaGas) {
		EntityManager em = EMFService.get().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(nuevaFacturaGas);
		transaction.commit();
		em.close();

		return nuevaFacturaGas;

	}

	@Override
	public FacturaTelefono save(FacturaTelefono nuevaFacturaTelefono) {
		EntityManager em = EMFService.get().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(nuevaFacturaTelefono);
		transaction.commit();
		em.close();

		return nuevaFacturaTelefono;
	}

	@Override
	public FacturaLuz save(FacturaLuz nuevaFacturaLuz) {
		EntityManager em = EMFService.get().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(nuevaFacturaLuz);
		transaction.commit();
		em.close();

		return nuevaFacturaLuz;
	}

	@Override
	public Clientes save(Clientes newCliente) {
		EntityManager em = EMFService.get().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(newCliente);
		transaction.commit();
		em.close();

		return newCliente;

	}

	@Override
	public UsuariosCliente save(UsuariosCliente newUsuarioCliente) {
		EntityManager em = EMFService.get().createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(newUsuarioCliente);
		transaction.commit();
		em.close();

		return newUsuarioCliente;

	}

	@Override
	public UsuariosCliente update(UsuariosCliente updateUsuarioCliente) {
		EntityManager em = EMFService.get().createEntityManager();
		UsuariosCliente updatedUsuarioCliente = em.merge(updateUsuarioCliente);
		em.close();
		return updatedUsuarioCliente;
	}

	@Override
	public UsuariosCliente getUsuarioByName(String nameUsuario) {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select user from UsuariosCliente user where nombre = :nameUsuario");
		q.setParameter("nameUsuario", nameUsuario);

		UsuariosCliente usuarioCliente = null;
		List<UsuariosCliente> usuariosCliente = q.getResultList();
		if (usuariosCliente.size() > 0) {
			usuarioCliente = usuariosCliente.get(0);
		}
		em.close();
		return usuarioCliente;
	}

	@Override
	public UsuariosCliente getUsuarioByMail(String mailUsuario) {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select user from UsuariosCliente user where email = :mailUsuario");
		q.setParameter("mailUsuario", mailUsuario);

		UsuariosCliente usuarioCliente = null;
		List<UsuariosCliente> usuariosCliente = q.getResultList();
		if (usuariosCliente.size() > 0) {
			usuarioCliente = usuariosCliente.get(0);
		}
		em.close();
		return usuarioCliente;
	}

}
