package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;

import java.util.Iterator;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import uniandes.dpoo.taller1.modelo.Bebidas;
import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.modelo.Ingrediente;
import uniandes.dpoo.taller1.modelo.ProductoMenu;
import uniandes.dpoo.taller1.procesamiento.CalculadoraHamburguesas;
import uniandes.dpoo.taller1.procesamiento.LoaderHamburguesas;

public class Consola {
	
	private CalculadoraHamburguesas calculadora;
	
	
	public void ejecutarAplicacion() {
		
		boolean continuar = true;
		while (continuar) {
			try {
				cargarInformacionRestaurante();
				mostrarMenu();
				
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
				if (opcion_seleccionada == 1)
					cargarInformacionRestaurante();	
				else if (opcion_seleccionada == 2) {
					mostrarMenu();
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los numeros de las opciones.");
			}
		}
	}
	


	
	public void mostrarMenu() {
		
		List<ProductoMenu> menu = calculadora.mostrarMenu();
		
		List<Ingrediente> ingrediente = calculadora.mostrarIngredientes();
		
		List<Bebidas> bebidas = calculadora.mostrarBebidas();
		
		List<Combo> combos = calculadora.mostrarCombos();
		
		
		System.out.println("**********************************************");
		
		for (int i =0; i<menu.size();i++) {
			ProductoMenu productoM = menu.get(i);
			String nombre = productoM.getNombre();
			int precio = productoM.getPrecio();
			System.out.println((i+1)+". "+nombre+": "+precio);
		}
		System.out.println("**********************************************");
		
		
		for (int j =0; j<combos.size();j++) {
			Combo combito = combos.get(j);
			String nombre = combito.getNombre();;
			String hamburguesa = combito.darHamburguesa();
			String gaseosa = combito.darBebida();
			String papas = combito.darPapas();
			Double descuento = combito.darDescuento();
			double precio = calculadora.precioDescuento(descuento,hamburguesa,papas,gaseosa);
			System.out.println((j+20)+". "+nombre+": "+precio);
		}
		System.out.println("**********************************************");
		
		for (int k =0; k<ingrediente.size();k++) {
			Ingrediente ingrediente1 = ingrediente.get(k);
			String nombre = ingrediente1.getNombre();
			int precio = ingrediente1.getPrecio();
			System.out.println((k+1)+". "+nombre+": "+precio);
		}
		System.out.println("**********************************************");
		
		
		for (int l =0; l<bebidas.size();l++) {
			Bebidas bebida = bebidas.get(l);
			String nombre = bebida.getNombre();
			int precio = bebida.getPrecio();
			System.out.println((l+1)+". "+nombre+": "+precio);
		}
		System.out.println("**********************************************");
		
			
	}
	
	private void cargarInformacionRestaurante() {
		
		try {
			System.out.println("\n" + "Cargar los archivos" + "\n");
			
			calculadora = LoaderHamburguesas.cargarArchivo();
		}
		catch(IOException e){
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		
	}
	
	private String input(String mensaje) {
		try {
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e) {
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();	
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
		
	}
	

}
