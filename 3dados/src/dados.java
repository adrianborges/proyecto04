import java.util.Random;
import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		// creamos las variables para los dados
		
		int d,d1,d2;
	String enter;	
     
//ENTRADA DE DATOS
			Scanner teclado=new Scanner (System.in);
			
			{System.out.println("pulsa ENTER para lanzar dados");}
			enter=teclado.nextLine();
				
Random rnd= new Random();

d= (rnd.nextInt(6)+1);
d1= (rnd.nextInt(6)+1);
d2= (rnd.nextInt(6)+1);

      System.out.println(d);
      System.out.println(d1);
      System.out.println(d2);

		
		// estructura condicional usando if,else...

if(d!=6 && d1!=6 && d2==6)
{System.out.println("PREMIO: has ganado el BRONCE");}
if(d!=6 && d1==6 && d2!=6)
{System.out.println("PREMIO: has ganado el BRONCE");}
if(d==6 && d1!=6 && d2!=6)
{System.out.println("PREMIO: has ganado el BRONCE");}
      
      if(d!=6 && d1==6 && d2==6)
      {System.out.println("PREMIO: has ganado el PLATA");}
      if(d==6 && d1!=6 && d2==6)
      {System.out.println("PREMIO: has ganado el PLATA");}
      if(d==6 && d1==6 && d2!=6)
      {System.out.println("PREMIO: has ganado el PLATA");}

      if (d!=6 && d1!=6 && d2!=6)
      {System.out.println("Lo siento, HAS PERDIDO");}
      
      else if(d==6 && d1==6 && d2==6)
      {System.out.println("PREMIO: has ganado el ORO");}

      teclado.close();
	}
	}

