package sumanumeros;

import java.util.Scanner;

public class sumanumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,suma; // variables
		Scanner teclado=new Scanner(System.in);


		// entrada de datos
		System.out.println("dime el primer número");
		n1=teclado.nextInt();

		System.out.println("dime otro número");
		n2=teclado.nextInt();

		//proceso 
		suma=n1+n2;

		//salida

		System.out.println("el resultado de la suma es:" + suma);
		teclado.close();
			}

		}


