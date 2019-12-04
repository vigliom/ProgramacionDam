/**
 * @author jorge
 * @description Ejercicio1 del examen de 4/12
 * @date	4/12/2019
 */
package examenes;
import java.util.*;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String palaorig, palacopia = "";
		int error = 1;
		char letra;

		// JUGADOR 1 INTRODUCE LA PALABRA
		System.out.println("Bienvenido Jugador 1, Introduzca la palabra o frase a Adivinar. Mucha suerte!!: ");
		palaorig = teclado.nextLine().toLowerCase();
		System.out.println("Vale, Su palabra es: " + palaorig + ". Esta toda en minusculas para una mejor comprobacion.");

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // Lineas para que el jugador 2 no vea la palabra
		
		
		// JUGADOR 2 JUEGA
		System.out.println("Bienvenido Jugador 2. Para jugar puedes introducir una letra o la palabra, \n si la palabra no es correcta cojera la 1ª letra de esta para comprobar.");
		for (int i = 0; i < palaorig.length(); i++) {
			if (palaorig.charAt(i) == ' ') {
				palacopia += ' ';
			}
			else {
			palacopia += '*';
			}
		}
		
		// BUCLE DE ERRORES HASTA FINALIZAR
		do {
			String entrada;
			System.out.println(palacopia);
			System.out.println("Introduzca una letra: ");
			entrada = teclado.nextLine();
			letra = entrada.charAt(0);
			boolean estaen = false;
			
			for (int i = 0; i < palaorig.length(); i++) {
				if (palaorig.charAt(i) == letra) {
					palacopia = palacopia.substring(0, i) + letra + palacopia.substring(i+1);
					estaen=true;
				}
			}
			
		//CONDICIONES Y CONTADOR DE ERRORES
			if(estaen == false) {
				switch (error) {
				case 1:
					System.out.println("Error " + error + " de 8: Te pinto la horca");
					break;
				case 2:
					System.out.println("Error " + error + " de 8: Te pinto la cabeza");
					break;
				case 3:
					System.out.println("Error " + error + " de 8: Te pinto el cuerpo");
					break;
				case 4:
					System.out.println("Error " + error + " de 8: Te pinto el brazo iz");
					break;
				case 5:
					System.out.println("Error " + error + " de 8: Te pinto el brazo der");
					break;
				case 6:
					System.out.println("Error " + error + " de 8: Te pinto la pierna der");
					break;
				case 7:
					System.out.println("Error " + error + " de 8: Te pinto la pierna iz");
					break;
				case 8:
					System.out.println("Error " + error + " de 8: AHORCADO!");
					System.out.println("La palabra era: " + palaorig);
					break;
				}
					error++;
			}
			//MENSAJE DE ERROR CON LA OPCION DE SI METES LA PALABRA ENTERA PUEDAS GANAR
			if (palaorig.equals(entrada)||palaorig.equals(palacopia)) {
				System.out.println("Palabra: " + palaorig);
				System.out.println("ENHORABUENA! LO HAS CONSEGUIDO.");
				break;
			}
			
			
		} while (error <= 8);
	
	}

}
