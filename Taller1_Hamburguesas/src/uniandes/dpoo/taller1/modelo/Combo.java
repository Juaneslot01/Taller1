package uniandes.dpoo.taller1.modelo;

import java.util.List;

import uniandes.dpoo.taller1.procesamiento.CalculadoraHamburguesas;

public class Combo implements Producto{
	
	private CalculadoraHamburguesas calculadora;
	
	private String nombre;
	
	private String descuento;
	
	private String hamburguesa;
	private String papas;
	private String gaseosa;
	
	
	public Combo(String elNombre,String elDescuento, String laHamburguesa, String lasPapas, String laGaseosa ) {
		
		this.nombre = elNombre;
		this.descuento = elDescuento;
		this.hamburguesa = laHamburguesa;
		this.papas = lasPapas;
		this.gaseosa = laGaseosa;		
	}
	
	
	public Double darDescuento() {
		
		String[] x = descuento.split("%");
		Double y = Double.parseDouble(x[0]);
		Double z = y/100;
		return z;
	}
	public String darHamburguesa() {
		return hamburguesa;
	}
	public String darPapas() {
		return papas;
	}
	public String darBebida() {
		return gaseosa;
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
