
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		int selec,cont=0;
		
		//Creacion del objeto metodos
		Metodos met = new Metodos();
		
		
		System.out.println("MENU-----------------");
		System.out.println("Ingrese el numero de la opcion que desea realizar");
		System.out.println("1. Agregar desarrollador");
		System.out.println("2. Datos de los desarrolladores ");
		System.out.println("3. Salir del programa");
		Scanner elegido = new Scanner(System.in);
		System.out.println();
		System.out.println("Presione: 1, 2, 3");
		int entrada = elegido.nextInt();
		
		//Progra defensiva
				while (entrada != 4) 
				{
					
				    if (entrada < 1 || entrada > 3) 
				    {
				        System.out.println("Presione: 1, 2 o 3");
				        entrada = elegido.nextInt();
				    }

				    else if(entrada == 1) //Agregar desarrollador 
				    {
				    	met.agregar();
				    }//else if agregar desarrollador
				    
				    else if(entrada == 2) //Datos
				    {
				    	met.mostrar();
				    }//else if estadisticas
				    
				    else if(entrada == 3) //Salir
				    {
				    	System.exit(0);
				    }//else if Salir
				}//while 
	}//main

}
