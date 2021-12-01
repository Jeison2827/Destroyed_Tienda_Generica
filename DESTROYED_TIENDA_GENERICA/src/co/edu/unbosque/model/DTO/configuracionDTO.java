package co.edu.unbosque.model.DTO;

import java.io.Serializable;

public class configuracionDTO implements Serializable {
	
	private String nombreTienda = "";
	private	String tipoComercio = "";
	private	String nitTienda = "";
	private String	ciudadTienda = "";
	private	int iva = 0;
	private	int tasaInteres = 0;
	private	String nombreBanco = "";
	private	String ctaCorriente = "";
	private	String gerenteTienda = "";
	
	public configuracionDTO() {}

	public configuracionDTO(String nombreTienda, String tipoComercio, String nitTienda, String ciudadTienda, int iva,
			int tasaInteres, String nombreBanco, String ctaCorriente, String gerenteTienda) {
		this.nombreTienda = nombreTienda;
		this.tipoComercio = tipoComercio;
		this.nitTienda = nitTienda;
		this.ciudadTienda = ciudadTienda;
		this.iva = iva;
		this.tasaInteres = tasaInteres;
		this.nombreBanco = nombreBanco;
		this.ctaCorriente = ctaCorriente;
		this.gerenteTienda = gerenteTienda;
	}
	
	
    @Override
    public String toString() {
        return new StringBuffer(" nombreTienda: ").append(this.nombreTienda)
                .append(" tipoComercio : ").append(this.tipoComercio).append(" nitTienda : ").append(this.nitTienda)
                .append(" ciudadTienda : ").append(this.ciudadTienda).append(" iva : ").append(this.iva)
                .append(" tasaInteres : ").append(this.tasaInteres).append(" nombreBanco : ").append(this.nombreBanco)
                .append(" ctaCorriente : ").append(this.ctaCorriente).append(" gerenteTienda : ").append(this.gerenteTienda)
                .toString();
    }
	
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public String getTipoComercio() {
		return tipoComercio;
	}
	public void setTipoComercio(String tipoComercio) {
		this.tipoComercio = tipoComercio;
	}
	public String getNitTienda() {
		return nitTienda;
	}
	public void setNitTienda(String nitTienda) {
		this.nitTienda = nitTienda;
	}
	public String getCiudadTienda() {
		return ciudadTienda;
	}
	public void setCiudadTienda(String ciudadTienda) {
		this.ciudadTienda = ciudadTienda;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(int tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public String getCtaCorriente() {
		return ctaCorriente;
	}
	public void setCtaCorriente(String ctaCorriente) {
		this.ctaCorriente = ctaCorriente;
	}
	public String getGerenteTienda() {
		return gerenteTienda;
	}
	public void setGerenteTienda(String gerenteTienda) {
		this.gerenteTienda = gerenteTienda;
	}
	
}
