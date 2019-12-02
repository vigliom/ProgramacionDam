/**
 * @author jorge
 *
 */
import java.util.*;
public class Ejer58 {

	public static void main(String[] args) {
		int matriz[][];
		int x,
			y;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el tamaño de la matriz: \n"
				+ "filas: ");
		x = teclado.nextInt();
		System.out.println("columnas: ");
		y = teclado.nextInt();
		
		matriz = new int[x][y];
		
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				System.out.println("Introduzca el valor de (" + i + "," + j + "): ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println("Su matriz es: ");
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				System.out.print(matriz[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}
