package co.edu.unbosque.model.DTO;

import java.io.Serializable;

public class VentasProductoDTO implements Serializable {
	
	private int codigoVenta;
	private String codigoProducto;
	private String nombreProducto;
	private float valorUnitario;
	private int cantidadProducto;
	private float valorSinIva;
	private float valorConIva;
	
	public VentasProductoDTO() {}
	
	
	public VentasProductoDTO(int codigoVenta, String codigoProducto, String nombreProducto, float valorUnitario,
			int cantidadProducto, float valorSinIva, float valorConIva) {
		this.codigoVenta = codigoVenta;
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.valorUnitario = valorUnitario;
		this.cantidadProducto = cantidadProducto;
		this.valorSinIva = valorSinIva;
		this.valorConIva = valorConIva;
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public float getValorSinIva() {
		return valorSinIva;
	}

	public void setValorSinIva(float valorSinIva) {
		this.valorSinIva = valorSinIva;
	}

	public float getValorConIva() {
		return valorConIva;
	}

	public void setValorConIva(float valorConIva) {
		this.valorConIva = valorConIva;
	}

	@Override
    public String toString() {
        return "VentasProductoDTO{" +
                "codigoVenta='" + codigoVenta + '\'' +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", valorUnitario='" + valorUnitario + '\'' +
                ", cantidadProducto='" + cantidadProducto + '\'' +
                ", valorSinIva='" + valorSinIva + '\'' +
                ", valorConIva=" + valorConIva +
                "}\n";
    }

}
