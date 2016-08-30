import java.lang.*;

public class Desarrollador implements Comparable<Desarrollador> {
	
	//ATRIBUTOS 
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
	
	private String nombre;
	private int tipo; 
	
	
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
	
	//Codigo de Hash------------------------------------------------
	public int codHash(){
		return (nombre.hashCode()+(tipo*100)); //Bytes 
	}
	
	//Mostrar datos ingresados--------------------------------------
	public String toString(){
		String formato = new String ("");
		
		//Tipos de desarrolladores
		switch (tipo){
		case 1:
			formato="Nombre: "+nombre+" Desarrollador: Java";
			break;//1
		case 2:
			formato="Nombre: "+nombre+" Desarrollador: Web";
			break;//2
		case 3:
			formato="Nombre: "+nombre+" Desarrollador: Movil";
			break;//3
		case 4:
			formato="Nombre: "+nombre+" Desarrollador: Java y Web";
			break;//4
		case 5:
			formato="Nombre: "+nombre+" Desarrollador: Java y Movil";
			break;//5
		case 6:
			formato="Nombre: "+nombre+" Desarrollador: Web y Movil";
			break;//6
		case 7:
			formato="Nombre: "+nombre+" Desarrollador: Java, Web y Movil";
			break;//7
		}//switch
		return formato;
	}

	@Override
	public int compareTo(Desarrollador o) {
		// TODO Auto-generated method stub
		int a = this.hashCode();
		int b = o.hashCode();
		return Integer.compare(a, b);
	}

}
