

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
	

}
