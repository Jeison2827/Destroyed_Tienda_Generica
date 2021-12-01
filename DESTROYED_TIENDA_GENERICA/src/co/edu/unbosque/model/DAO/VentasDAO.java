package co.edu.unbosque.model.DAO;

import java.util.ArrayList;

import co.edu.unbosque.model.DTO.VentasDTO;
import co.edu.unbosque.model.DTO.VentasProductoDTO;

public class VentasDAO {
	
	private ArrayList<VentasDTO> ventasDTO;
	private ArrayList<VentasProductoDTO> ventasProductoDTO;	
	
	public VentasDAO() {
		
		ventasDTO = new ArrayList<VentasDTO>();
		ventasProductoDTO = new ArrayList<VentasProductoDTO>();

	}

	public ArrayList<VentasDTO> getVentasDTO() {
		return ventasDTO;
	}

	public void setVentasDTO(ArrayList<VentasDTO> ventasDTO) {
		this.ventasDTO = ventasDTO;
	}

	public ArrayList<VentasProductoDTO> getVentasProductoDTO() {
		return ventasProductoDTO;
	}

	public void setVentasProductoDTO(ArrayList<VentasProductoDTO> ventasProductoDTO) {
		this.ventasProductoDTO = ventasProductoDTO;
	}
	

}
