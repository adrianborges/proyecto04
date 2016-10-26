package puntuacionfacultad;

import java.util.Scanner;

public class puntuacionfacultad {

	public static void main(String[] args) {
		// las variables que necesitamos
		
				int puntuacion; 
				
				Scanner teclado=new Scanner(System.in);
				
				//la entrada de datos 
				System.out.println("Dime tu puntuación");
				puntuacion=teclado.nextInt();
				
				// la estructura condicional, proceso y salida
				if(puntuacion>=70 && puntuacion<=100) {
					if(puntuacion==100)
					{System.out.println("La facultad a la que puede acceder es: SISTEMAS"); }
					else if (puntuacion>=90 && puntuacion<=80)
					{System.out.println("La facultad a la que puede acceder es: ELECTRONICA");}
					else if (puntuacion>=80 && puntuacion<=90)
					{System.out.println("La facultad a la que puede acceder es: INDUSTRIAL");}
					else if (puntuacion>=70 && puntuacion<=80)
					{System.out.println("La facultad a la que puede acceder es: ADMINISTRACION");}
				}
				
					else if (puntuacion>100)
					{System.out.println("No puedes puntuar mas");}
				
					else { System.out.println("Lo siento, no puedes acceder a ninguna facultad");}
				
				teclado.close();

	}

}
