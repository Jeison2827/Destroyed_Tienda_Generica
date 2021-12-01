package co.edu.unbosque.model.DAO;

import java.util.ArrayList;

import co.edu.unbosque.model.DTO.ClientesDTO;

public class ClientesDAO {

	private ArrayList<ClientesDTO> clientesDTO;
	
	
	public ClientesDAO() {
		
		clientesDTO = new ArrayList<ClientesDTO>();

	}


	public ArrayList<ClientesDTO> getClientesDTO() {
		return clientesDTO;
	}


	public void setClientesDTO(ArrayList<ClientesDTO> clientesDTO) {
		this.clientesDTO = clientesDTO;
	}
	
	public void addClientesDTO(ClientesDTO clientesDTO) {
		this.clientesDTO.add(clientesDTO);
	}
	
	public ClientesDTO getClientePorCedula( int Cedula  ) {
		
		ClientesDTO cliente = null;

		for(  ClientesDTO c : clientesDTO  ) {
			
			if(c.getCedula() == Cedula) {
				cliente = c;
			}
		}
		
		return cliente;
		
	}
	
	public ArrayList<ClientesDTO> borrarClientePorCedula(  int cedula  ) {
		

		for(  int i = 0 ; i <  this.clientesDTO.size(); i++ ) {
			
			if(this.clientesDTO.get(i).getCedula() == cedula) {
				this.clientesDTO.remove(i);
			}
		}
		
		return this.getClientesDTO();
		
	}
	
	public ArrayList<ClientesDTO> actualizarClientePorCedula(  ClientesDTO cliente  ) {
		

		for(  int i = 0 ; i <  this.clientesDTO.size(); i++ ) {
			
			if(this.clientesDTO.get(i).getCedula() == cliente.getCedula()) {
				this.clientesDTO.set(i , cliente);
			}
		}
		
		return this.getClientesDTO();
		
	}



}
