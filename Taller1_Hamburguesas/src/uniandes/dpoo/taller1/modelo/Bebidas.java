package uniandes.dpoo.taller1.modelo;

public class Bebidas implements Producto{
	private String nombre;
	
	private int precioBase;
	
	
	public Bebidas(String pNombre, int pPrecio) {
		nombre = pNombre;
		precioBase = pPrecio;
		
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
		return nombre +" : "+precioBase;
	}
	

}
