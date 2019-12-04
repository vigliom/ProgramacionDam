import java.util.*;

public class Ejer75 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String numeros;
		System.out.println("Introduzca los Numeros:  ");
		numeros = teclado.nextLine();
		for (int i = 0; i < numeros.length(); i++) {
			int n =Integer.parseInt(Character.toString(numeros.charAt(i)));
			
			System.out.print(ConvierteEnPalotes(n));
			if(i != numeros.length()-1) {
				System.out.print("-");
			}
		}

	}

	public static String ConvierteEnPalotes(int no) {

		String palotes;

		switch (no) {
		case 0:
			palotes = "";
			break;
		case 1:
			palotes = "|";
			break;
		case 2:
			palotes = "||";
			break;
		case 3:
			palotes = "|||";
			break;
		case 4:
			palotes = "||||";
			break;
		case 5:
			palotes = "|||||";
			break;
		case 6:
			palotes = "||||||";
			break;
		case 7:
			palotes = "|||||||";
			break;
		case 8:
			palotes = "||||||||";
			break;
		case 9:
			palotes = "|||||||||";
			break;
		default:
			palotes = "no_Valido";
			break;
		}

		return palotes;
	}

}
