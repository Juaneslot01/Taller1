package uniandes.dpoo.taller1.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller1.modelo.Bebidas;
import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;






public class CalculadoraHamburguesas {
	
	private List<Combo> combos;
	private List<ProductoMenu> productos;
	private List<Ingrediente> ingredientes;
	private List<Bebidas> bebidas;
	
	public CalculadoraHamburguesas(Map<String,Combo> combos,Map<String, ProductoMenu> productoMenu,Map<String,Ingrediente> ingrediente,Map<String,Bebidas> bebidas) {
		
		this.combos = new ArrayList<Combo>(combos.values());
		this.productos = new ArrayList<ProductoMenu>(productoMenu.values());
		this.ingredientes = new ArrayList<Ingrediente>(ingrediente.values());
		this.bebidas = new ArrayList<Bebidas>(bebidas.values());
	}
	
	
	public List<ProductoMenu> mostrarMenu(){
		return productos;
	}
	public List<Combo> mostrarCombos(){
		return combos;
	}
	public List<Ingrediente> mostrarIngredientes(){
		return ingredientes;
	}
	public List<Bebidas> mostrarBebidas(){
		return bebidas;
	}
	
	
	public double precioDescuento(double descuento1,String hamburguesa, String papas, String gaseosa) {

		double resultado = 0.0;
		
		
		for (int i =0; i<productos.size();i++) {
			ProductoMenu productoM = productos.get(i);
			
			String nombreP = productoM.getNombre();
			int precio = productoM.getPrecio();
			double precioP = Double.valueOf(precio);
			
			if (i==6 && nombreP == "especial") {
				resultado = precioP;
			}
		}
		return resultado;
	}
	


}
