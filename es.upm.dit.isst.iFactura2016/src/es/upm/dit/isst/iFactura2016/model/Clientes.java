package es.upm.dit.isst.iFactura2016.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class Clientes.
 */
@Entity
public class Clientes implements Serializable {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	private Long id;

	/** The recibo ofertas. */
	private Boolean reciboOfertas;

	/**
	 * Instantiates a new clientes.
	 */
	public Clientes() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the recibo ofertas.
	 *
	 * @return the recibo ofertas
	 */
	public Boolean getReciboOfertas() {
		return reciboOfertas;
	}

	/**
	 * Sets the recibo ofertas.
	 *
	 * @param reciboOfertas
	 *            the new recibo ofertas
	 */
	public void setReciboOfertas(Boolean reciboOfertas) {
		this.reciboOfertas = reciboOfertas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reciboOfertas == null) ? 0 : reciboOfertas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reciboOfertas == null) {
			if (other.reciboOfertas != null)
				return false;
		} else if (!reciboOfertas.equals(other.reciboOfertas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", reciboOfertas=" + reciboOfertas + "]";
	}

}
