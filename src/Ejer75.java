import java.util.*;

public class Ejer75 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String numeros;
		System.out.println("Introduzca la linea de numeros a cambiar: ");
		numeros = teclado.nextLine();
		for (int i = 0; i < numeros.length(); i++) {
			int n =Integer.parseInt(Character.toString(numeros.charAt(i)));
				System.out.println(ConvierteEnPalabras(n));
		}

	}

	public static String ConvierteEnPalabras(int no) {

		String numero;

		switch (no) {
		case 0:
			numero = "cero";
			break;
		case 1:
			numero = "uno";
			break;
		case 2:
			numero = "dos";
			break;
		case 3:
			numero = "tres";
			break;
		case 4:
			numero = "cuatro";
			break;
		case 5:
			numero = "cinco";
			break;
		case 6:
			numero = "seis";
			break;
		case 7:
			numero = "siete";
			break;
		case 8:
			numero = "ocho";
			break;
		case 9:
			numero = "nueve";
			break;
		default:
			numero = "no_Valido";
			break;
		}

		return numero;
	}

}
