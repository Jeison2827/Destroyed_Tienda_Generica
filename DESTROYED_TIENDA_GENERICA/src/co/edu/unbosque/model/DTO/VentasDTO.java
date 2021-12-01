package co.edu.unbosque.model.DTO;

import java.io.Serializable;
import java.util.ArrayList;

public class VentasDTO implements Serializable {
	
	private int codigoVenta;
	
	private int cedulaCliente;
	
	private ArrayList<VentasProductoDTO> productos;
	
	private int totalCantidadProductos;
	
	private float valorTotalSinIva;
	
	private float valorIva;
	
	private float valorTotalConIva;

	
	public VentasDTO() {
	}
	
	public VentasDTO(int codigoVenta, int cedulaCliente, ArrayList<VentasProductoDTO> productos,
			int totalCantidadProductos, float valorTotalSinIva, float valorIva, float valorTotalConIva) {
		this.codigoVenta = codigoVenta;
		this.cedulaCliente = cedulaCliente;
		this.productos = productos;
		this.totalCantidadProductos = totalCantidadProductos;
		this.valorTotalSinIva = valorTotalSinIva;
		this.valorIva = valorIva;
		this.valorTotalConIva = valorTotalConIva;
	}
	

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public ArrayList<VentasProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<VentasProductoDTO> productos) {
		this.productos = productos;
	}

	public int getTotalCantidadProductos() {
		return totalCantidadProductos;
	}

	public void setTotalCantidadProductos(int totalCantidadProductos) {
		this.totalCantidadProductos = totalCantidadProductos;
	}

	public float getValorTotalSinIva() {
		return valorTotalSinIva;
	}

	public void setValorTotalSinIva(float valorTotalSinIva) {
		this.valorTotalSinIva = valorTotalSinIva;
	}

	public float getValorIva() {
		return valorIva;
	}

	public void setValorIva(float valorIva) {
		this.valorIva = valorIva;
	}

	public float getValorTotalConIva() {
		return valorTotalConIva;
	}

	public void setValorTotalConIva(float valorTotalConIva) {
		this.valorTotalConIva = valorTotalConIva;
	}
	
	@Override
    public String toString() {
        return "VentasDTO{" +
                "codigoVenta='" + codigoVenta + '\'' +
                "cedulaCliente='" + cedulaCliente + '\'' +
                ", productos='" + productos + '\'' +
                ", totalCantidadProductos='" + totalCantidadProductos + '\'' +
                ", valorTotalSinIva='" + valorTotalSinIva + '\'' +
                ", valorIva='" + valorIva + '\'' +
                ", valorTotalConIva=" + valorTotalConIva +
                "}\n";
    }
	
	

}


