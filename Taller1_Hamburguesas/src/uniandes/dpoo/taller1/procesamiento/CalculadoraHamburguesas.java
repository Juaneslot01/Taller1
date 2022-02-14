package uniandes.dpoo.taller1.procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;






public class CalculadoraHamburguesas {
	
	private List<Combo> combos;
	private List<ProductoMenu> productos;
	private List<Ingrediente> ingredientes;
	
	public CalculadoraHamburguesas(Map<String,Combo> combos,Map<String, ProductoMenu> productoMenu,Map<String,Ingrediente> ingrediente) {
		
		this.combos = new ArrayList<Combo>(combos.values());
		this.productos = new ArrayList<ProductoMenu>(productoMenu.values());
		this.ingredientes = new ArrayList<Ingrediente>(ingrediente.values());
	}

}
