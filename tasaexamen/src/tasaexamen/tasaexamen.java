package tasaexamen;

import java.util.Scanner;

public class tasaexamen {

	public static void main(String[] args) {
		
		String colegio="particular && nacional";
		String nivel="a,b,c";
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Colegio NACIONAL o PARTICULAR?");
		colegio= teclado.nextLine();
		
		System.out.println("Nivel A,B o C");
		nivel=teclado.nextLine();
	
		
		if (colegio.equals("particular") && nivel.equals("a"))
		{System.out.println("Tasa de examen 400");}
		else if (colegio.equals("particular") && nivel.equals("b"))
		{System.out.println("Tasa de examen 300");}
		else if (colegio.equals("particular") && nivel.equals("c"))
		{System.out.println("Tasa de examen 200");
		}

		if (colegio.equals("nacional") && nivel.equals("a"))
		{System.out.println("Tasa de examen 300");}
		else if (colegio.equals("nacional") && nivel.equals("b"))
		{System.out.println("Tasa de examen 200");}
		else if (colegio.equals("nacional") && nivel.equals("c"))
		{System.out.println("Tasa de examen 100");
		}
		
		
teclado.close();
	}
	
}
	
