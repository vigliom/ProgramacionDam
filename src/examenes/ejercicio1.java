/**
 * @author jorge
 * @description Ejercicio1 del examen de 4/12
 * @date	4/12/2019
 */
package examenes;
import java.util.*;

public class ejercicio1 {
/******************************************************
 * Funcion main(), Tiene la estructura del programa
 * 
 * @param args
 *//**************************************************/
	public static void main(String[] args) {
		
		//VARIABLES
		Scanner teclado = new Scanner(System.in);
		String numeros;
		char num;
		
		//PEDIMOS POR PANTALLA LOS NUMEROS
		System.out.println("Nos gusta hacer palotes, introduzca numero de los palotes que quieres... ");
		System.out.println("Introduzca los Numeros:  ");
		numeros = teclado.nextLine();
		
		//REALIZAMOS EL RECORRIDO Y MOSTRAMOS POR PANTALLA A LA VEZ QUE LLAMAMOS A LA FUNCION
		for (int i = 0; i < numeros.length(); i++) {
			num = numeros.charAt(i);
			if (IsDigit(num) == false) {					//IsDigit(num) ---> Funcion que comprueba que no sea un numero no valido
				System.out.print(ConvierteEnPalotes(-1));
				if (i != numeros.length() - 1) {
					System.out.print("-");
				}
			} else {									
				int n = Integer.parseInt(Character.toString(num));
				System.out.print(ConvierteEnPalotes(n));
				if (i != numeros.length() - 1) {
					System.out.print("-");
				}
			}
		}

	}
	
	/******************************************************
	 * Funcion isDigit(), Comprueba si el numero es un digito
	 * 
	 * @param n	Numero a comprobar
	 * @return	esDigito		
	 *//**************************************************/
	public static boolean IsDigit(char n) {
		boolean esDigito=false;		//Booleano para comprobar
		if(n == '0' ||n == '1' ||n == '2' ||n == '3' ||n == '4' ||n == '5' ||n == '6' ||n == '7' ||n == '8' ||n == '9') {
			esDigito=true;
		}
		return esDigito;
	}
	
	/**
	 * Funcion que convierte los numeros en palos y los devuelve por pantalla
	 * @param no
	 * @return palotes
	 */
	public static String ConvierteEnPalotes(int no) {

		String palotes;	//String de los palos

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
			palotes = "NoValido";
			break;
		}

		return palotes;
	}

}
