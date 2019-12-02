import java.util.*;

public class Ejer40 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Declaracion del teclado
		int x;				
		
		System.out.println("Introduzca el numero a comprobar");
		x = teclado.nextInt();
		for (int i = 1; i <= x; i++)
		{
			for (int j = i; j <= x; j++)
			{
				System.out.println("Par " + i + "," + j + ": " + i + "+" + j + "+" + 2 + "*" + i + "*" + j + " vale " + (i+j+2*i*j));
			}
		}
		
	}

}
