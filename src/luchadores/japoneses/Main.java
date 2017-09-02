package luchadores.japoneses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import luchadores.japoneses.Torneo;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Luchador[] luchador = leerArchivoYCargarVector();
		Torneo torneo = new Torneo();
		
		int[] contrincantes=torneo.calculaContrincante(luchador);
		
		generaArchivo(contrincantes);
		
		for(int i=0; i<contrincantes.length; i++)
		{
			System.out.println(contrincantes[i]);
		}
		
		

	}

	private static void generaArchivo(int[] contrincantes)
			throws FileNotFoundException {
		String miPath = "C:\\entrada\\";		
		PrintWriter salida = new PrintWriter(new File(miPath+"sumo.out"));

		for(int i=0; i<contrincantes.length; i++)
		{
			salida.print(contrincantes[i]+"\n");
		}
		salida.close();
	}
	
	//metodo para cargar un vector con el contenido de un archivo
		private static Luchador[] leerArchivoYCargarVector() throws FileNotFoundException {
			//Directorio donde se encuentran los archivos a procesar
			String miPath = "C:\\entrada\\";
			
			//Con scanner leo el contenido del archivo
			Scanner sc = new Scanner(new File(miPath+"sumo.in"));
			sc.useLocale(Locale.ENGLISH);
			
			// creo vector para almacenar la lectura. 
			//toma como tamaño del array el primer valor del archivo input
			//nextInt es el proximo entero.
			Luchador[] vec = new Luchador[sc.nextInt()]; 				
			
			//debo saltar una linea vacia
			sc.nextLine();
			
			//cargo el vector con los elementos de archivo
			for (int i = 0; i < vec.length ; i++) 
			{

				//instancio un luchador para luego cargarle los datos
				Luchador lu = new Luchador();
				//utilizo split para separar los campos peso y altura
				String[] linea = sc.nextLine().split(" ");
				
				//seteo los campos peso y altura parseandolos a double
				lu.setPeso(Double.parseDouble(linea[0]));
				lu.setAltura(Double.parseDouble(linea[1]));
				
				//cargo el vector
				vec[i] = lu;
			}
			
			sc.close();
			return vec;
		}

}
