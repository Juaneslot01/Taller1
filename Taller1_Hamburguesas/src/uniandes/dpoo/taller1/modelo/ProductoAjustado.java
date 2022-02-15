package uniandes.dpoo.taller1.modelo;

public class ProductoAjustado implements Producto{
	
	private int precioBase;
	
	private String nombre;
	
	
	public ProductoAjustado(ProductoMenu base) {
		this.nombre = base.getNombre();
		this.precioBase = base.getPrecio();
		
		
	}

	
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return precioBase;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return nombre+ " : "+ precioBase;
	}

}
