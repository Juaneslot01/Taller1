package uniandes.dpoo.taller1.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import uniandes.dpoo.taller1.modelo.Combo;
import uniandes.dpoo.taller1.procesamiento.CalculadoraHamburguesas;
import uniandes.dpoo.taller1.procesamiento.LoaderHamburguesas;

public class Consola {
	
	private CalculadoraHamburguesas calculadora;
	
	
	public void ejecutarAplicacion() {
		
		boolean continuar = true;
		while (continuar) {
			try {
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
				if (opcion_seleccionada == 1)
					ejecutarCargarArchivos();
			}
			catch (NumberFormatException e) {
				System.out.println("Debe seleccionar uno de los numeros de las opciones.");
			}
		}
	}
	


	public void mostrarMenu() {
		
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar los archivos");


	}
	
	private void ejecutarCargarArchivos() {
		
		try {
			System.out.println("\n" + "Cargar los archivos" + "\n");
			
			calculadora = LoaderHamburguesas.cargarArchivo();
			System.out.println(calculadora);
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
