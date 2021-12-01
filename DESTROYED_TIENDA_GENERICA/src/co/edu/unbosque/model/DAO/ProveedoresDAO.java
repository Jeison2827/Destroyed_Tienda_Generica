package co.edu.unbosque.model.DAO;

import java.util.ArrayList;

import co.edu.unbosque.model.DTO.ProveedorDTO;

public class ProveedoresDAO {
	
	private ArrayList<ProveedorDTO> proveedorDTO;
	
	
	public ProveedoresDAO() {
		
		proveedorDTO = new ArrayList<ProveedorDTO>();

	}


	public ArrayList<ProveedorDTO> getProveedoresDTO() {
		return proveedorDTO;
	}


	public void setProveedoresDTO(ArrayList<ProveedorDTO> clientesDTO) {
		this.proveedorDTO = clientesDTO;
	}
	
	public void addProveedorDTO(ProveedorDTO clientesDTO) {
		this.proveedorDTO.add(clientesDTO);
	}
	
	public ProveedorDTO getProveedorPorNit( String Nit  ) {
		
		ProveedorDTO proveedor = null;

		for(  ProveedorDTO c : proveedorDTO  ) {
			
			if(c.getNit().equals(Nit)) {
				proveedor = c;
			}
		}
		
		return proveedor;
		
	}
	
	public ArrayList<ProveedorDTO> borrarProveedorPorNit(  String nit  ) {
		

		for(  int i = 0 ; i <  this.proveedorDTO.size(); i++ ) {
			
			if(this.proveedorDTO.get(i).getNit().equals(nit)) {
				this.proveedorDTO.remove(i);
			}
		}
		
		return this.getProveedoresDTO();
		
	}
	
	public ArrayList<ProveedorDTO> actualizarProveedorPorNit(  ProveedorDTO proveedor  ) {
		
		for(  int i = 0 ; i <  this.proveedorDTO.size(); i++ ) {
			
			if(this.proveedorDTO.get(i).getNit().equals(proveedor.getNit())) {
				this.proveedorDTO.set(i , proveedor);
			}
		}
		return this.getProveedoresDTO();
		
	}

}
