package ar.edu.utn.ap40;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		
		System.out.println("¿Quiere comenzar?:");
		String comenzar=leer.next();
		
		ArrayList<String>mensajes=new ArrayList<String>();
		
		
		while(comenzar!=null) {
			System.out.println("Indique su nombre:");
			String nombre=leer.next();
			
			
			
			switch(comenzar){
			case "si":
				
				
				System.out.println("Presione a si desea escribir un mensaje o b si desea leerlos");
				String eleccion=leer.next();
				
				
				switch(eleccion) {
				case "a":
					System.out.println("Escriba el mensaje a continuacion:");
					String mensaje=leer.next();
					
					mensajes.add(mensaje);
					
					System.out.println("Desea continuar?");
					String con=leer.next();
					switch(con) {
					case "no":
						comenzar=null;
					}
					
				case "b":
					System.out.println("Eligio leer los mensajes:");
					for(int i=0;i<mensajes.hashCode();i++) {
						System.out.println(mensajes.get(i));
						
					}
					
					comenzar=null;
					
					
				
				}
			case "no":
				comenzar=null;
				
			}
		}
		
		

	}	
	

}
