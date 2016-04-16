package es.upm.dit.isst.iFactura2016.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class FacturaGas.
 */
@Entity
public class FacturaGas implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	/** The cliente. */
	private Integer cliente;

	/** The empresa. */
	private String empresa;

	/** The importe. */
	private Double importe;

	/** The potencia contratada. */
	private Double potenciaContratada;

	/** The potencia facturada. */
	private Double potenciaFacturada;

	/** The consumo facturado. */
	private Double consumoFacturado;

	/** The equipos medida. */
	private Boolean equiposMedida;

	/** The consumo servicios. */
	private Double consumoServicios;

	/**
	 * Instantiates a new factura gas.
	 */
	public FacturaGas() {
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
	public Integer getCliente() {
		return cliente;
	}

	/**
	 * Sets the cliente.
	 *
	 * @param cliente
	 *            the new cliente
	 */
	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	/**
	 * Gets the empresa.
	 *
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Sets the empresa.
	 *
	 * @param empresa
	 *            the new empresa
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
	 * Gets the equipos medida.
	 *
	 * @return the equipos medida
	 */
	public Boolean getEquiposMedida() {
		return equiposMedida;
	}

	/**
	 * Sets the equipos medida.
	 *
	 * @param equiposMedida
	 *            the new equipos medida
	 */
	public void setEquiposMedida(Boolean equiposMedida) {
		this.equiposMedida = equiposMedida;
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
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((consumoFacturado == null) ? 0 : consumoFacturado.hashCode());
		result = prime * result + ((consumoServicios == null) ? 0 : consumoServicios.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((equiposMedida == null) ? 0 : equiposMedida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FacturaGas other = (FacturaGas) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
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
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (equiposMedida == null) {
			if (other.equiposMedida != null)
				return false;
		} else if (!equiposMedida.equals(other.equiposMedida))
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
		return "FacturaGas [id=" + id + ", cliente=" + cliente + ", empresa=" + empresa + ", importe=" + importe
				+ ", potenciaContratada=" + potenciaContratada + ", potenciaFacturada=" + potenciaFacturada
				+ ", consumoFacturado=" + consumoFacturado + ", equiposMedida=" + equiposMedida + ", consumoServicios="
				+ consumoServicios + "]";
	}

}
