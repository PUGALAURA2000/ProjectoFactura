package com.usil.springboot.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String tipodocumento;
	
	private String camposerie;
	
	private String tipomoneda;
	
	private String tipooperacion;
	
	private String tipoid;
	
	private String numeroid;
	
	private String interescuota;
	
	private String interesmora;
	
	private String montoseguro;
	
	private String totalfacturado;
	
	private String totalinafecto;
	
	private String totalexonerado;
	
	private String importetotal;
	
	private String documentomodifica;
	
	private String seriemodifica;
	
	private String correlativomodifica;
	
	private String montocredito;
	
	private String numerocontrato;
	
	private String numeropoliza;
	
	private String iniciocobertura;
	
	private String terminocobertura;

	private String tiposeguro;
	
	private String sumaasegurada;
	
	private String descripcion;

	private String observacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	private Date createAt;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "factura_id")
	private List<ItemFactura> items;

	public Factura() {
		this.items = new ArrayList<ItemFactura>();
	}

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	
	public String getCamposerie() {
		return camposerie;
	}

	public void setCamposerie(String camposerie) {
		this.camposerie = camposerie;
	}
	
	public String getTipomoneda() {
		return tipomoneda;
	}

	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}
	
	public String getTipooperacion() {
		return tipooperacion;
	}

	public void setTipooperacion(String tipooperacion) {
		this.tipooperacion = tipooperacion;
	}
	
	public String getTipoid() {
		return tipoid;
	}

	public void setTipoid(String tipoid) {
		this.tipoid= tipoid;
	}
	
	public String getNumeroid() {
		return numeroid;
	}

	public void setNumeroid(String numeroid) {
		this.numeroid = numeroid;
	}
	
	public String getInterescuota() {
		return interescuota;
	}

	public void setInterescuota(String interescuota) {
		this.interescuota = interescuota;
	}
	
	public String getInteresmora() {
		return interesmora;
	}

	public void setInteresmora(String interesmora) {
		this.interesmora = interesmora;
	}
	
	public String getMontoseguro() {
		return montoseguro;
	}

	public void setMontoseguro(String montoseguro) {
		this.montoseguro = montoseguro;
	}
	
	public String getTotalfacturado() {
		return totalfacturado;
	}

	public void setTotalfacturado(String totalfacturado) {
		this.totalfacturado = totalfacturado;
	}
	
	public String getTotalinafecto() {
		return totalinafecto;
	}

	public void setTotalinafecto(String totalinafecto) {
		this.totalinafecto = totalinafecto;
	}
	
	public String getTotalexonerado() {
		return totalexonerado;
	}

	public void setTotalexonerado(String totalexonerado) {
		this.totalexonerado = totalexonerado;
	}
	
	public String getImportetotal() {
		return importetotal;
	}

	public void setImportetotal(String importetotal) {
		this.importetotal = importetotal;
	}
	
	public String getDocumentomodifica() {
		return documentomodifica;
	}

	public void setDocumentomodifica(String documentomodifica) {
		this.documentomodifica = documentomodifica;
	}
	
	public String getSeriemodifica() {
		return seriemodifica;
	}

	public void setSeriemodifica(String seriemodifica) {
		this.seriemodifica = seriemodifica;
	}
	
	public String getCorrelativomodifica() {
		return correlativomodifica;
	}

	public void setCorrelativomodifica(String correlativomodifica) {
		this.correlativomodifica = correlativomodifica;
	}
	
	public String getMontocredito() {
		return montocredito;
	}

	public void setMontocredito(String montocredito) {
		this.montocredito = montocredito;
	}
	
	public String getNumerocontrato() {
		return numerocontrato;
	}

	public void setNumerocontrato(String numerocontrato) {
		this.numerocontrato = numerocontrato;
	}
	
	public String getNumeropoliza() {
		return numeropoliza;
	}

	public void setNumeropoliza(String numeropoliza) {
		this.numeropoliza = numeropoliza;
	}
	
	public String getIniciocobertura() {
		return iniciocobertura;
	}

	public void setIniciocobertura(String iniciocobertura) {
		this.iniciocobertura = iniciocobertura;
	}
	
	public String getTerminocobertura() {
		return terminocobertura;
	}

	public void setTerminocobertura(String terminocobertura) {
		this.terminocobertura = terminocobertura;
	}
	
	public String getTiposeguro() {
		return tiposeguro;
	}

	public void setTiposeguro(String tiposeguro) {
		this.tiposeguro = tiposeguro;
	}
	
	public String getSumaasegurada() {
		return sumaasegurada;
	}

	public void setSumaasegurada(String sumaasegurada) {
		this.sumaasegurada = sumaasegurada;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

	public void addItemFactura(ItemFactura item) {
		this.items.add(item);
	}

	public Double getTotal() {
		Double total = 0.0;

		int size = items.size();

		for (int i = 0; i < size; i++) {
			total += items.get(i).calcularImporte();
		}
		return total;
	}

	private static final long serialVersionUID = 1L;
}