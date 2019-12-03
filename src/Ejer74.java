import java.util.*;

public class Ejer74 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto;
		
		System.out.println("Introduzca un mensaje: ");
		texto = teclado.nextLine();
		
		ImprimeCajaTexto(texto);

	}
	public static void ImprimeCajaTexto(String s)
	{
		for(int i = 0; i < s.length()+4; i++) {
			System.out.print("*");
		}System.out.println();
		
		System.out.print("*");
		for(int i = 0; i < s.length()+2; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		
		System.out.println("* " + s + " *");
		
		System.out.print("*");
		for(int i = 0; i < s.length()+2; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();

		for(int i = 0; i < s.length()+4; i++) {
			System.out.print("*");
		}
		
	}

}
