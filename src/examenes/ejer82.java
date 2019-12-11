/******************************************************************\
 * @author Javier Ros Y Jorge Pérez 1 DAM IES Serpis
 * 
 * @description: Sacar divisores
 * 
 * @date: 11-12-2019
 * 
 * @version: 1.0
 \*******************************************************************/
package examenes;

import java.util.Scanner;

public class ejer82 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, div;
		String lista = "";

		System.out.println("Introduzca un número para calcular sus divisores:");
		n = scanner.nextInt();
		div = n;
		System.out.println("Los divisores son: "+sacarDivisor(n, div, lista));

	}
	/**
	 * 
	 * @param n
	 * @param div
	 * @param lista
	 * @return
	 */
	public static String sacarDivisor(int n, int div, String lista) {
		
		if (div == 0) {
			lista += "";
		}else {
			if (n % div == 0) {
				lista += div;
				if (div != 1) {
					lista += ",";
				}
				
			}
			lista = sacarDivisor(n, div-1, lista);
		}
		return lista;
	}
}