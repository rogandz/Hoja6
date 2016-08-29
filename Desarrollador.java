import java.lang.*;

public class Desarrollador implements Comparable<Desarrollador> {
	
	//ATRIBUTOS 
	private String nombre;
	private int tipo; 
	
	/*
	 * Tipos de desarrolladores: 
	 * 1 ---- Desarrolladores Java 
	 * 2 ---- Desarrolladores Web
	 * 3 ---- Desarrolladores para Movil 
	 * 4 ---- Desarrolladores Java, Web 
	 * 5 ---- Desarrolladores Java, Movil
	 * 6 ---- Desarrolladores Web, Movil
	 * 7 ---- Desarrolladores Java, Web, Movil
	 */
	
	//Constructor de la clase 
	public Desarrollador(String nombredes, int tipodes){
		nombre=nombredes;
		tipo=tipodes;
	}//desarrollador 
	
	//-------------Set y get de Nombre----------------------------
	public String getNombre(){
		return nombre; 
	}
	
	public void setNombre(String nombredes){
		this.nombre=nombredes; 
	}
	
	//-------------Set y get de Tipo-------------------------------
	public int getTipo(){
		return tipo; 
	}
	
	public void setTipo(int tipodes){
		this.tipo=tipodes; 
	}
	


	@Override
	public int compareTo(Desarrollador o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
