

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
	
	public void mostrar(){
		String datos= "Datos de los desarrolladores:\n\n";
		System.out.println(datos);
		String datos1="Java web y movil:-------------\n";
		String datos2="Java sin web------------------\n";
		String datos3="Web y movil-------------------\n";
		String datos4="Web o movil pero no java------\n";
		String datos5="Java web y celulares:---------\n";
		

		Iterator<Desarrollador> iteradorprimera= generador.iterator();
		int cantprimera=0;
		int cantsegunda=0;
		int canttercera=0;
		int cantcuarta=0;
		int cantquinta=0;
		for (int i=0; i<generador.size(); i++)
		{
			Desarrollador siguiente= iteradorprimera.next();
			if(siguiente.getTipo()==7)
			{
				datos1=datos1+siguiente.toString()+"\n";
				cantprimera++;
			}
			else if (siguiente.getTipo()==1||siguiente.getTipo()==5){
				datos2=datos2+siguiente.toString()+"\n";
				cantsegunda++;
			}
			else if (siguiente.getTipo()==6){
				datos3=datos3+siguiente.toString()+"\n";
				canttercera++;
			}
			else if (siguiente.getTipo()==2||siguiente.getTipo()==3||siguiente.getTipo()==6){
				datos4=datos4+siguiente.toString()+"\n";
				cantcuarta++;
			}
		}
		if (cantprimera==0){
			datos1=datos1+"Nadie\n";
		}
		if (cantsegunda==0){
			datos2=datos2+"Nadie\n";
		}
		if (canttercera==0){
			datos3=datos3+"Nadie\n";
		}
		if (cantcuarta==0){
			datos4=datos4+"Nadie\n";
		}
		
		System.out.println(datos1+datos2+datos3+datos4+datos5);
	}
}
