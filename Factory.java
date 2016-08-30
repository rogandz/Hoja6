import java.util.*;

public class Factory {
	
	public Set<Desarrollador> Objeto (){
		Scanner tipo = new Scanner (System.in);
		int opcion = 0;
		Object stackob;
		stackob = new Object ();
		
		System.out.println("Que tipo desea implementar?");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		int entrada = tipo.nextInt();
		
		while (entrada !=0) 
		{
			//Defensiva
		    if (entrada < 1 || entrada > 3) 
		    {
		        System.out.println("Presione: 1, 2 o 3");
		        entrada = tipo.nextInt();
		    }

		    else if(entrada == 1) //HashSet
		    {
		    	System.out.println("---------HASHSET Seleccionado---------");
		    	HashSet<Desarrollador> obHash = new HashSet<Desarrollador>();
		    	stackob = obHash;
		    	entrada=0;   	
		    }//else if HashSet
		    
		    else if(entrada == 2) //TreeSet
		    {
		    	System.out.println("---------TREESET Seleccionado---------");
		    	TreeSet<Desarrollador> obTree = new TreeSet<Desarrollador>();
		    	stackob = obTree;
		    	entrada=0; 
		    }//else if TreeSet
		    
		    else if(entrada == 3) //LinkedHashSet
		    {
		    	System.out.println("---------LINKEDHASHSET Seleccionado---------");
		    	LinkedHashSet<Desarrollador> obLinked = new LinkedHashSet<Desarrollador>();
		    	stackob = obLinked;
		    	entrada=0; 
		    }//Linkedhashset
		}//while 
		return (Set<Desarrollador>)stackob;
}//main
		
}
