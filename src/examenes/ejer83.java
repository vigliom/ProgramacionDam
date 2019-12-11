/**
 * @author jorge y Javier Ros
 * @description Batalla de insultos de Monkey Island
 * @date 11/12/2019
 */
package examenes;

import java.util.*;

public class ejer83 {

	public static void main(String[] args) {
		int n = 1, cont = 0;
		String frase_maquina, frase_usuario, fm, fu;
		/*
		 * Bucle de comprobaciones
		 */
		while (n <= 5) {
			frase_maquina = elegir_frase_maquina(n);
			System.out.println(frase_maquina);
			fm = frase_maquina.substring(frase_maquina.length() - 2);
			System.out.println("a) Que pena que todas esten inventadas\n"
					+ "b) Y eso sin contar a las otras con las que te has citado\n"
					+ "c) Tu olor y tu cara me recuerdan a un queso sin frescor\n"
					+ "d) Eso es porque me parezco mucho a tu hermana\n"
					+ "e) Con tu aliento, seguro que todos fueron asfixiados\n");
			frase_usuario = elegir_opcion_humano();
			fu = frase_usuario.substring(frase_usuario.length() - 2);
			
			if (fu.equals(fm)) {
				System.out.println("Punto para ti");
				n++;
			} else {
				if (cont < 2) {
					cont++;
					System.out.println("Fallo " + cont + " de 3! Me has hecho pupita! Intalo de nuevo!");
				}else {
					System.out.println("Fallo 3 de 3");
					System.out.println("Has perdido paquete, aprende a rimar");
					break;
				}
			}
			

		}
		if (n == 6) {
			System.out.println("Enhorabuena, has demostrado que sabes insultar, gilipollas (with love <3)");
		}
	}
/**
 * Elige la frase de la maquina, segun el numero de aciertos elige la opcion
 * @param n	Numero de la opcion a elegir.
 * @return	frase elegida
 */
	public static String elegir_frase_maquina(int n) {
		String frase_maquina = "";
		switch (n) {
		case 1:
			frase_maquina = "1-Eres tan repulsivo como una mona marrana";
			break;
		case 2:
			frase_maquina = "2-Mis ataques han dejado islas enteras sin poblados";
			break;
		case 3:
			frase_maquina = "3-Tu cara haría vomitar hasta el cerdo menos aseado";
			break;
		case 4:
			frase_maquina = "4-Mis habilidades con la espada son muy veneradas";
			break;
		case 5:
			frase_maquina = "5-Piedad, te lo ruego, no mas insultos por favor";
			break;
		}

		return frase_maquina;
	}
/**
 * Opcion elegida por el usuario
 * @return
 */
	public static String elegir_opcion_humano() {
		Scanner scanner = new Scanner(System.in);
		String frase_usuario = "";
		char opcion;
		opcion = scanner.next().charAt(0);
		switch (opcion) {
		case 'a':
			frase_usuario = "Que pena que todas esten inventadas";
			break;
		case 'b':
			frase_usuario = "Y eso sin contar a las otras con las que te has citado";
			break;
		case 'c':
			frase_usuario = "Tu olor y tu cara me recuerdan a un queso sin frescor";
			break;
		case 'd':
			frase_usuario = "Eso es porque me parezco mucho a tu hermana";
			break;
		case 'e':
			frase_usuario = "Con tu aliento, seguro que todos fueron asfixiados";
			break;
		default:
			break;
		}
		return frase_usuario;
	}
}
