package co.edu.unbosque.model.DTO;

import java.io.Serializable;

public class ProveedorDTO  implements Serializable {
	
	private String nit;
	private String nombreProveedor;
	private String direccion;
	private String telefono;
	private String ciudad;
	
	
	public ProveedorDTO() {
	
	}
	
	
	public ProveedorDTO(String nit, String nombreProveedor, String direccion, String telefono, String ciudad) {

		this.nit = nit;
		this.nombreProveedor = nombreProveedor;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}
	
	
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

	@Override
    public String toString() {
        return "ProveedorDTO{" +
                "nit='" + nit + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ciudad=" + ciudad +
                "}\n";
    }
	
	

}
