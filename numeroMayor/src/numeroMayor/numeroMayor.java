package numeroMayor;

import java.util.Scanner;

public class numeroMayor {

	public static void main(String[] args) {
		// las variables que utilizaremos
				int n1,n2,mayor;
				
				Scanner teclado=new Scanner(System.in);
				
				//entrada de datos
				System.out.println("dame un número");
				n1=teclado.nextInt();
				
				System.out.println("dame otro número");
				n2=teclado.nextInt();
				
				//el proceso estructural condicinal
				if(n1>n2){
				mayor=n1;}
				else{mayor=n2;}
				
				//salida de datos
				System.out.println("el valor mayor es:" + mayor);
				
				teclado.close();
	}

}
