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

public class LoaderHamburguesas {
	
	public static CalculadoraHamburguesas cargarArchivo() throws FileNotFoundException, IOException{
		
		Map<String, Combo> combos = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\git\\Taller1\\Taller1_Hamburguesas\\data\\combos.txt"));
		
		String linea = br.readLine();
		while (linea != null) {
			
			String[] partes = linea.split(";");
			String nombreCombo = partes[0];
			String descuento = partes[1];
			String hamburguesa = partes[2];
			String papas = partes[3];
			String gaseosa = partes[4];
			
			Combo elCombo = combos.get(nombreCombo);
			if (elCombo == null) {
				elCombo = new Combo(nombreCombo,descuento,hamburguesa,papas,gaseosa);
				combos.put(nombreCombo, elCombo);
			}
			linea = br.readLine();
		}
		br.close();	
		
		Map<String,ProductoMenu> arMenu = new HashMap<>();
		
		BufferedReader cr = new BufferedReader(new FileReader("C:\\Users\\User\\git\\Taller1\\Taller1_Hamburguesas\\data\\menu.txt"));
		String linea2 = cr.readLine();
		while (linea2 != null) {
			String[] partes = linea2.split(";");
			String nombrePM = partes[0];
			String SPrecio = partes[1];
			int precio = Integer.parseInt(SPrecio);
			ProductoMenu ElProductoMenu= arMenu.get(nombrePM);
			if(ElProductoMenu == null) {
				ElProductoMenu = new ProductoMenu(nombrePM,precio);
				arMenu.put(nombrePM, ElProductoMenu);	
			}
			linea2 = cr.readLine();
		}
		cr.close();
		
		Map<String, Ingrediente> ingredientes = new HashMap<>();
		
		BufferedReader dr = new BufferedReader(new FileReader("C:\\Users\\User\\git\\Taller1\\Taller1_Hamburguesas\\data\\ingredientes.txt"));
		String linea3 = dr.readLine();
		while (linea3 != null) {
			String[] partes = linea3.split(";");
			String nombreI = partes[0];
			String SPrecio = partes[1];
			int precio = Integer.parseInt(SPrecio);
			Ingrediente ElIngrediente = ingredientes.get(nombreI);
			if(ElIngrediente == null) {
				ElIngrediente = new Ingrediente(nombreI,precio);
				ingredientes.put(nombreI, ElIngrediente);	
			}
			linea3 = dr.readLine();
		}
		dr.close();
		
		CalculadoraHamburguesas calculadora = new CalculadoraHamburguesas(combos,arMenu,ingredientes);
		return calculadora;
		
	}
	

}
