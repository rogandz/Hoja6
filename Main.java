
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private static Scanner elegido;
		private static Scanner elegidou;
		private static Scanner elegidou2;
		private static Scanner elegidou3;
		private static Scanner elegidou4;
		
		
		int selec,cont=0;
	
		
		
		System.out.println("MENU-----------------");
		System.out.println("Ingrese el numero de la opcion que desea realizar");
		System.out.println("1. Agregar desarrollador");
		System.out.println("2. Estadisticas de los desarrolladores ");
		System.out.println("3. Salir del programa");
		elegido = new Scanner(System.in);
		System.out.println();
		System.out.println("Presione: 1, 2, 3");
		int entrada = elegido.nextInt();
		
		//Progra defensiva
				while (entrada != 4) 
				{
					
				    if (entrada < 1 || entrada > 3) 
				    {
				        System.out.println("Presione: 1, 2, 3");
				        entrada = elegido.nextInt();
				    }

				    else if(entrada == 1) //Agregar desarrollador 
				    {
				    	
				    	
				    	
				    }//else if 
				}//while 
	}//main

}
