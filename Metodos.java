

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
		System.out.println("Datos de los desarrolladores\n");
		System.out.println("");
		Iterator<Desarrollador> lista = generador.iterator();
		String tipo1="";
		int cant1=0;
		String tipo2="";
		int cant2=0;
		String tipo3="";
		int cant3=0;
		String tipo4="";
		int cant4=0;
		String tipo5="";
		int cant5=0;
		String tipo6="";
		int cant6=0;
		String tipo7="";
		int cant7=0;
			
		while (lista.hasNext()) {
			
			switch (lista.next().getTipo()){
			case 1:		
				cant1++;
				tipo1=lista.next().getNombre()+"\n";
				break;
			case 2: 
				cant2++;
				tipo2=lista.next().getNombre()+"\n";
				break;
			case 3: 
				cant3++;
				tipo3=lista.next().getNombre()+"\n";
				break;
			case 4:
				cant4++;
				tipo4=lista.next().getNombre()+"\n";
				break;
			case 5:
				cant5++;
				tipo5=lista.next().getNombre()+"\n";
				break;
			case 6:
				cant6++;
				tipo6=lista.next().getNombre()+"\n";
				break;
			case 7:
				cant7++;
				tipo7=lista.next().getNombre()+"\n";
				break;
			}//switch
		}//while
		System.out.println("Tipo 1: Desarrolladores Java);");
		System.out.println(tipo1);
		System.out.println("Tipo 2: Desarrolladores Web");
		System.out.println(tipo2);
		System.out.println("Tipo 3: Desarrolladores Movil");
		System.out.println(tipo3);
		System.out.println("Tipo 4: Desarrolladores Java y Web");
		System.out.println(tipo4);
		System.out.println("Tipo 5: Desarrolladores Java y Movil");
		System.out.println(tipo5);
		System.out.println("Tipo 6: Desarrolladores Web y Movil");
		System.out.println(tipo6);
		System.out.println("Tipo 7: Desarrolladores Java, Web y Movil");
		System.out.println(tipo7);
		System.out.print("");
		System.out.print("");
		System.out.print("");
		
		int[] vector; 
		vector=new int[7];
		vector[0]=cant1;
		vector[1]=cant2;
		vector[2]=cant3;
		vector[3]=cant4;
		vector[4]=cant5;
		vector[5]=cant6;
		vector[6]=cant7;
		
		int[] vectorcopia=vector; 
		Arrays.sort(vector);
		int mayor=0;
		String nom="";
		int tipomost=0;
		String nombres="";
		
		for (int i=0;i<7;i++){
			if (vectorcopia[i]==vector[6]){
				mayor=i;
			}
		}
		
		switch(mayor){
			case 0:nom="Java";
				   tipomost=1;
					break;
			case 1:nom="Web";
					tipomost=2;
					break;
			case 2:nom="Movil";
					tipomost=3;
					break;
			case 3:nom="Java y Web";
					tipomost=4;
					break;
			case 4:nom="Java y Movil";
					tipomost=5;
					break;
			case 5:nom="Web y Movil";
					tipomost=6;
					break;
			case 6:nom="Java, Web y Celulares";
					tipomost=7;	
					break;
		
		}
		System.out.println("El conjunto que tiene la cantidad mas grande es: "+nom+" con: "+Integer.toString(mayor));
		Iterator<Desarrollador> lista2 = generador.iterator();
		
		while (lista2.hasNext()) {
			if (lista2.next().getTipo()==tipomost){
				nombres=lista.next().getNombre()+"\n";
			}
		}
		System.out.println("Los nombres son: \n"+nombres);
		
		
	}
}
