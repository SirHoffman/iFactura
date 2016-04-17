package es.upm.dit.isst.iFactura2016.dto;

/**
 * The Class FacturaTelefonoDto.
 */
public class FacturaTelefonoDto {

	/** The id. */
	private Long id;

	/** The cliente. */
	private Long cliente;

	/** The nombre. */
	private String nombre;

	/** The compania. */
	private String compania;

	/** The importe. */
	private Double importe;

	/** The datos contratados. */
	private Double datosContratados;

	/** The datos consumidos. */
	private Double datosConsumidos;

	/** The lte. */
	private Boolean lte;

	/** The voz contratada. */
	private Double vozContratada;

	/** The voz consumida. */
	private Double vozConsumida;

	/** The franja horaria. */
	private String franjaHoraria;

	/** The fecha. */
	private String fecha;

	/**
	 * Instantiates a new factura telefono dto.
	 */
	public FacturaTelefonoDto() {
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
	 * Gets the cliente.
	 *
	 * @return the cliente
	 */
	public Long getCliente() {
		return cliente;
	}

	/**
	 * Sets the cliente.
	 *
	 * @param cliente
	 *            the new cliente
	 */
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre
	 *            the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the compania.
	 *
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * Sets the compania.
	 *
	 * @param compania
	 *            the new compania
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * Gets the importe.
	 *
	 * @return the importe
	 */
	public Double getImporte() {
		return importe;
	}

	/**
	 * Sets the importe.
	 *
	 * @param importe
	 *            the new importe
	 */
	public void setImporte(Double importe) {
		this.importe = importe;
	}

	/**
	 * Gets the datos contratados.
	 *
	 * @return the datos contratados
	 */
	public Double getDatosContratados() {
		return datosContratados;
	}

	/**
	 * Sets the datos contratados.
	 *
	 * @param datosContratados
	 *            the new datos contratados
	 */
	public void setDatosContratados(Double datosContratados) {
		this.datosContratados = datosContratados;
	}

	/**
	 * Gets the datos consumidos.
	 *
	 * @return the datos consumidos
	 */
	public Double getDatosConsumidos() {
		return datosConsumidos;
	}

	/**
	 * Sets the datos consumidos.
	 *
	 * @param datosConsumidos
	 *            the new datos consumidos
	 */
	public void setDatosConsumidos(Double datosConsumidos) {
		this.datosConsumidos = datosConsumidos;
	}

	/**
	 * Gets the lte.
	 *
	 * @return the lte
	 */
	public Boolean getLte() {
		return lte;
	}

	/**
	 * Sets the lte.
	 *
	 * @param lte
	 *            the new lte
	 */
	public void setLte(Boolean lte) {
		this.lte = lte;
	}

	/**
	 * Gets the voz contratada.
	 *
	 * @return the voz contratada
	 */
	public Double getVozContratada() {
		return vozContratada;
	}

	/**
	 * Sets the voz contratada.
	 *
	 * @param vozContratada
	 *            the new voz contratada
	 */
	public void setVozContratada(Double vozContratada) {
		this.vozContratada = vozContratada;
	}

	/**
	 * Gets the voz consumida.
	 *
	 * @return the voz consumida
	 */
	public Double getVozConsumida() {
		return vozConsumida;
	}

	/**
	 * Sets the voz consumida.
	 *
	 * @param vozConsumida
	 *            the new voz consumida
	 */
	public void setVozConsumida(Double vozConsumida) {
		this.vozConsumida = vozConsumida;
	}

	/**
	 * Gets the franja horaria.
	 *
	 * @return the franja horaria
	 */
	public String getFranjaHoraria() {
		return franjaHoraria;
	}

	/**
	 * Sets the franja horaria.
	 *
	 * @param franjaHoraria
	 *            the new franja horaria
	 */
	public void setFranjaHoraria(String franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha
	 *            the new fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((compania == null) ? 0 : compania.hashCode());
		result = prime * result + ((datosConsumidos == null) ? 0 : datosConsumidos.hashCode());
		result = prime * result + ((datosContratados == null) ? 0 : datosContratados.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((franjaHoraria == null) ? 0 : franjaHoraria.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((importe == null) ? 0 : importe.hashCode());
		result = prime * result + ((lte == null) ? 0 : lte.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((vozConsumida == null) ? 0 : vozConsumida.hashCode());
		result = prime * result + ((vozContratada == null) ? 0 : vozContratada.hashCode());
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
		FacturaTelefonoDto other = (FacturaTelefonoDto) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (compania == null) {
			if (other.compania != null)
				return false;
		} else if (!compania.equals(other.compania))
			return false;
		if (datosConsumidos == null) {
			if (other.datosConsumidos != null)
				return false;
		} else if (!datosConsumidos.equals(other.datosConsumidos))
			return false;
		if (datosContratados == null) {
			if (other.datosContratados != null)
				return false;
		} else if (!datosContratados.equals(other.datosContratados))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (franjaHoraria == null) {
			if (other.franjaHoraria != null)
				return false;
		} else if (!franjaHoraria.equals(other.franjaHoraria))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (importe == null) {
			if (other.importe != null)
				return false;
		} else if (!importe.equals(other.importe))
			return false;
		if (lte == null) {
			if (other.lte != null)
				return false;
		} else if (!lte.equals(other.lte))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (vozConsumida == null) {
			if (other.vozConsumida != null)
				return false;
		} else if (!vozConsumida.equals(other.vozConsumida))
			return false;
		if (vozContratada == null) {
			if (other.vozContratada != null)
				return false;
		} else if (!vozContratada.equals(other.vozContratada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FacturaTelefonoDto [id=" + id + ", cliente=" + cliente + ", nombre=" + nombre + ", compania=" + compania
				+ ", importe=" + importe + ", datosContratados=" + datosContratados + ", datosConsumidos="
				+ datosConsumidos + ", lte=" + lte + ", vozContratada=" + vozContratada + ", vozConsumida="
				+ vozConsumida + ", franjaHoraria=" + franjaHoraria + ", fecha=" + fecha + "]";
	}

}
