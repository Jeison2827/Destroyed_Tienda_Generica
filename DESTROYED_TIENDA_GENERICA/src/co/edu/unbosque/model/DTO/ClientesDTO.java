package co.edu.unbosque.model.DTO;

import java.io.Serializable;

public class ClientesDTO implements Serializable {
	
	private int cedula;
	private String nombre;
	private String direccion;
	private int telefono;
	private String correo;
	
	public ClientesDTO() {
		
	}

	public ClientesDTO(int cedula, String nombre, String direccion, int telefono, String correo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
    @Override
    public String toString() {
        return "ClientesDTO{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo=" + correo +
                "}\n";
    }

}
