package es.upm.dit.isst.iFactura2016.dto;

/**
 * The Class FacturaGasDto.
 */
public class FacturaLuzDto {

	/** The id factura. */
	private Long idFactura;

	/** The cantidad. */
	private String empresa;

	/** The importe. */
	private Double importe;

	/** The potencia contratada. */
	private Double potenciaContratada;

	/** The potencia facturada. */
	private Double potenciaFacturada;

	/** The consumo facturado. */
	private Double consumoFacturado;

	/** The consumo servicios. */
	private Double consumoServicios;

	/**
	 * Instantiates a new factura gas dto.
	 */
	public FacturaLuzDto() {
	}

	/**
	 * Gets the id factura.
	 *
	 * @return the id factura
	 */
	public Long getIdFactura() {
		return idFactura;
	}

	/**
	 * Sets the id factura.
	 *
	 * @param idFactura
	 *            the new id factura
	 */
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad
	 *            the new cantidad
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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
	 * Gets the potencia contratada.
	 *
	 * @return the potencia contratada
	 */
	public Double getPotenciaContratada() {
		return potenciaContratada;
	}

	/**
	 * Sets the potencia contratada.
	 *
	 * @param potenciaContratada
	 *            the new potencia contratada
	 */
	public void setPotenciaContratada(Double potenciaContratada) {
		this.potenciaContratada = potenciaContratada;
	}

	/**
	 * Gets the potencia facturada.
	 *
	 * @return the potencia facturada
	 */
	public Double getPotenciaFacturada() {
		return potenciaFacturada;
	}

	/**
	 * Sets the potencia facturada.
	 *
	 * @param potenciaFacturada
	 *            the new potencia facturada
	 */
	public void setPotenciaFacturada(Double potenciaFacturada) {
		this.potenciaFacturada = potenciaFacturada;
	}

	/**
	 * Gets the consumo facturado.
	 *
	 * @return the consumo facturado
	 */
	public Double getConsumoFacturado() {
		return consumoFacturado;
	}

	/**
	 * Sets the consumo facturado.
	 *
	 * @param consumoFacturado
	 *            the new consumo facturado
	 */
	public void setConsumoFacturado(Double consumoFacturado) {
		this.consumoFacturado = consumoFacturado;
	}

	/**
	 * Gets the consumo servicios.
	 *
	 * @return the consumo servicios
	 */
	public Double getConsumoServicios() {
		return consumoServicios;
	}

	/**
	 * Sets the consumo servicios.
	 *
	 * @param consumoServicios
	 *            the new consumo servicios
	 */
	public void setConsumoServicios(Double consumoServicios) {
		this.consumoServicios = consumoServicios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumoFacturado == null) ? 0 : consumoFacturado.hashCode());
		result = prime * result + ((consumoServicios == null) ? 0 : consumoServicios.hashCode());
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		result = prime * result + ((importe == null) ? 0 : importe.hashCode());
		result = prime * result + ((potenciaContratada == null) ? 0 : potenciaContratada.hashCode());
		result = prime * result + ((potenciaFacturada == null) ? 0 : potenciaFacturada.hashCode());
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
		FacturaLuzDto other = (FacturaLuzDto) obj;
		if (consumoFacturado == null) {
			if (other.consumoFacturado != null)
				return false;
		} else if (!consumoFacturado.equals(other.consumoFacturado))
			return false;
		if (consumoServicios == null) {
			if (other.consumoServicios != null)
				return false;
		} else if (!consumoServicios.equals(other.consumoServicios))
			return false;
		if (idFactura == null) {
			if (other.idFactura != null)
				return false;
		} else if (!idFactura.equals(other.idFactura))
			return false;
		if (importe == null) {
			if (other.importe != null)
				return false;
		} else if (!importe.equals(other.importe))
			return false;
		if (potenciaContratada == null) {
			if (other.potenciaContratada != null)
				return false;
		} else if (!potenciaContratada.equals(other.potenciaContratada))
			return false;
		if (potenciaFacturada == null) {
			if (other.potenciaFacturada != null)
				return false;
		} else if (!potenciaFacturada.equals(other.potenciaFacturada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FacturaGasDto [idFactura=" + idFactura + ", importe=" + importe + ", potenciaContratada="
				+ potenciaContratada + ", potenciaFacturada=" + potenciaFacturada + ", consumoFacturado="
				+ consumoFacturado + ", consumoServicios=" + consumoServicios + "]";
	}

}
