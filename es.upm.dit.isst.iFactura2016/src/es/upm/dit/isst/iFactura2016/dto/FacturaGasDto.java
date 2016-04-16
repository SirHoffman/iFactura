package es.upm.dit.isst.iFactura2016.dto;

/**
 * The Class FacturaGasDto.
 */
public class FacturaGasDto {

	/** The id factura. */
	private Long idFactura;

	/** The importe. */
	private Double importe;

	/** The consumo. */
	private Double consumo;

	/** The fecha inicio. */
	private String fechaInicio;

	/** The fecha fin. */
	private String fechaFin;

	/** The fecha emision. */
	private String fechaEmision;

	/**
	 * Instantiates a new factura gas dto.
	 */
	public FacturaGasDto() {
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
	 * Gets the consumo.
	 *
	 * @return the consumo
	 */
	public Double getConsumo() {
		return consumo;
	}

	/**
	 * Sets the consumo.
	 *
	 * @param consumo
	 *            the new consumo
	 */
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	/**
	 * Gets the fecha inicio.
	 *
	 * @return the fecha inicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * Sets the fecha inicio.
	 *
	 * @param fechaInicio
	 *            the new fecha inicio
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * Gets the fecha fin.
	 *
	 * @return the fecha fin
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * Sets the fecha fin.
	 *
	 * @param fechaFin
	 *            the new fecha fin
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * Gets the fecha emision.
	 *
	 * @return the fecha emision
	 */
	public String getFechaEmision() {
		return fechaEmision;
	}

	/**
	 * Sets the fecha emision.
	 *
	 * @param fechaEmision
	 *            the new fecha emision
	 */
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumo == null) ? 0 : consumo.hashCode());
		result = prime * result + ((fechaEmision == null) ? 0 : fechaEmision.hashCode());
		result = prime * result + ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		result = prime * result + ((importe == null) ? 0 : importe.hashCode());
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
		FacturaGasDto other = (FacturaGasDto) obj;
		if (consumo == null) {
			if (other.consumo != null)
				return false;
		} else if (!consumo.equals(other.consumo))
			return false;
		if (fechaEmision == null) {
			if (other.fechaEmision != null)
				return false;
		} else if (!fechaEmision.equals(other.fechaEmision))
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
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
		return true;
	}

	@Override
	public String toString() {
		return "FacturaGasDto [idFactura=" + idFactura + ", importe=" + importe + ", consumo=" + consumo
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaEmision=" + fechaEmision + "]";
	}

}
