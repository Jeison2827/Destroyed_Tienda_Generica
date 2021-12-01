package co.edu.unbosque.model.DTO;

import java.io.Serializable;

public class ProductoDTO implements Serializable {
	
	
	private String codigoProducto;
	private String nombreProducto;
	private String nitProveedor;
	private float precioCompra;
	private float precioVenta;
	
	
	public ProductoDTO() {}
	
	public ProductoDTO(String codigoProducto, String nombreProducto, String nitProveedor, float precioCompra,
			float precioVenta) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedor = nitProveedor;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
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
	public String getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(String nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	 @Override
	    public String toString() {
	        return "ProductoDTO{" +
	                "codigoProducto='" + codigoProducto + '\'' +
	                ", nombreProducto='" + nombreProducto + '\'' +
	                ", nitProveedor='" + nitProveedor + '\'' +
	                ", precioCompra='" + precioCompra + '\'' +
	                ", precioVenta=" + precioVenta +
	                "}\n";
	    }
	
	

}
