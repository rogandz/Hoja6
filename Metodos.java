

import java.util.*;

public class Metodos {
	
	//Atributos
	public Factory factoria; 
	public Set<Desarrollador> generador; 
	
	
	//Constructor
	public Metodos() {
		// TODO Auto-generated constructor stub
		factoria = new Factory();
		generador=factoria.Objeto();		
	}
	
	//----------------Set y get la Factoria ---------------------
	public void setFactoria(Factory factoriaa){
		this.factoria=factoriaa;
	}
	
	public Factory getFactoria(){
		return factoria;
	}

	//----------------Set y get la generador---------------------
	
	public void setGenerador(Set<Desarrollador> generadorr){
		this.generador=generadorr;
	}
	
	public Set<Desarrollador> getGenerador(){
		return generador;
	}
	
	//METODOS A IMPLEMENTAR--------------------------------------------------------------------------------
	
	public void agregar(){
		String nombre = "";
		int tipo=0; 
		System.out.println("Ingrese el nombre del desarrollador: ");
		Scanner teclado = new Scanner (System.in);
		nombre=teclado.nextLine();
		System.out.println("Ingrese el tipo del desarrollador: ");
		tipo=teclado.nextInt();
		
		Desarrollador desarrollador = new Desarrollador(nombre,tipo);
		generador.add(desarrollador);
		String formato = desarrollador.toString();
		System.out.println(formato);
	}
	
	
}
