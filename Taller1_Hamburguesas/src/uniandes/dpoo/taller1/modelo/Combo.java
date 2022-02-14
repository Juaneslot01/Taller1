package uniandes.dpoo.taller1.modelo;

public class Combo {
	
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
	
	public String darNombre() {
		return nombre;
	}
	
	public String darDescuento() {
		return descuento;
	}
	public String darHamburguesa() {
		return hamburguesa;
	}
	public String darPapas() {
		return papas;
	}
	public String darGaseosa() {
		return gaseosa;
	}
	
	

}
