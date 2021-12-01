package co.edu.unbosque.model.DAO;

import java.util.ArrayList;

import co.edu.unbosque.model.DTO.ProductoDTO;


public class ProductosDAO {
	
	private ArrayList<ProductoDTO> productoDTO;
	
	
	public ProductosDAO() {
		
		productoDTO = new ArrayList<ProductoDTO>();

	}


	public ArrayList<ProductoDTO> getProductosDTO() {
		return productoDTO;
	}


	public void setProductosDTO(ArrayList<ProductoDTO> productosDTO) {
		this.productoDTO = productosDTO;
	}
	
	public void addProductoDTO(ProductoDTO productoDTO) {
		this.productoDTO.add(productoDTO);
	}
	
	public ProductoDTO getProductoPorCodigo( String codigo  ) {
		
		ProductoDTO producto = null;

		for(  ProductoDTO p : productoDTO  ) {
			
			if(p.getCodigoProducto().equals(codigo)) {
				producto = p;
			}
		}
		
		return producto;
		
	}
	
	public ArrayList<ProductoDTO> borrarProductoPorCodigo(  String codigo  ) {
		

		for(  int i = 0 ; i <  this.productoDTO.size(); i++ ) {
			
			if(this.productoDTO.get(i).getCodigoProducto().equals(codigo)) {
				this.productoDTO.remove(i);
			}
		}
		
		return this.getProductosDTO();
		
	}
	
	public ArrayList<ProductoDTO> actualizarProductoPorCodigo(  ProductoDTO producto  ) {
		
		for(  int i = 0 ; i <  this.productoDTO.size(); i++ ) {
			
			if(this.productoDTO.get(i).getCodigoProducto().equals(producto.getCodigoProducto())) {
				this.productoDTO.set(i , producto);
			}
		}
		return this.getProductosDTO();
		
	}
	

}
