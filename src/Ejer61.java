/**
 *	@author jorge
 */
import java.util.*;
public class Ejer61 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor,		//valor que se cambia
			x,			//posiciones
			opcion = -1,//opcion del menu
			max;		//< Tamaño maximo del vector
		Random num_ale = new Random();
		
		/*
		 * Declaracion del tamaño del vector
		 */
		System.out.println("Dime el tamaño del array: ");
		max = teclado.nextInt();
		int[] v = new int[max];

		do{
			opcion = menu();
			switch(opcion)
				{
			/*
			 *  Rellenar vector por teclado: el programa irá pidiendo 1 a 1 los valores a asignar en el vector.
			 */
					case 1:
						
						System.out.println("Introduzca los valores 1 a 1.");
						for (int i = 0; i < v.length; i++)
						{
							System.out.printf("valor %s de %s", i+1, v.length);
							v[i] = teclado.nextInt();
						}
						System.out.println("...Vector finalizado...");
						break;
			/*
			 * El programa rellena automáticamente todas las posiciones del vector con números aleatorios
			 * que van desde el 1 hasta el 100.			
			 */
					case 2:
						
						for (int i= 0; i<v.length; i++ )
						{
							v[i] = (int)(num_ale.nextDouble()*100+1);
						}
						System.out.println("...Vector rellenando automaticamente...");
						break;
			/*
			 *  El programa pide una posición del vector, valida que esté dentro del rango del vector y
			 * 	luego solicita el nuevo valor de la posición introducida.			
			 */
					case 3:
						
						System.out.println("¿Que posicion quieres cambiar?(de 0 a "+ (v.length-1) +": ");
						x = teclado.nextInt();
						if (x < v.length && x >= 0)
						{
							System.out.println("Que valor quieres poner?: ");
							valor = teclado.nextInt();
							v[x] = valor;
						}else
						{
							System.out.println("La posicion no esta en el vector");
						}
						break;
				/*
				 * El programa pide una posición del vector, valida que esté dentro del rango del vector y
				 * luego consulta el nuevo valor de la posición introducida.		
				 */
					case 4:	
						
						System.out.println("Que posicion quieres comprobar?: ");
						x = teclado.nextInt();
						if(x < v.length && x >= 0)
						{
							System.out.println("El elemento en la posicion " + x + "es: ");
							System.out.println(v[x]);
						}else
						{
							System.out.println("La posicion no esta en el vector");
						}
						break;
				/*
				 *  Muestra todo el vector entre corchetes y con comas separando cada valor.
				 */
					case 5:
						
						System.out.print("[");

						for (int i = 0; i < v.length; i++)
						{
							if (i < v.length-1) {
								System.out.print(v[i]);
								System.out.print(",");
							}else 
							{
								System.out.print(v[i]);
							}

						}
						System.out.print("]\n");
						break;
				/*
				 * Ordena ascendentemente (de menos a más) el vector
				 */
				
					case 6:
						
						System.out.println("...Ordenando el Vector...");
						Arrays.sort(v);
						break;
				/*
				 *  Muestra un mensaje de despedida y sale del programa.		
				 */
					case 9:	
						
						System.out.println("Adios! ");
						break;
						
					default:
						System.out.println("La eleccion no es correcta:");
						
				}
		}while(opcion != 9);
		
		
	
	}
	/*
	 * Menu y eleccion del programa principal.
	 * 
	 */
	public static int menu() {
		int eleccion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(
				"1: Rellenar vector por teclado\n" + 
				"2: El programa rellena con números aleatorios desde el 1 hasta el 100.\n" + 
				"3: Modificar una posicion del vector\n" + 
				"4: Consultar Posicion del vector\n" + 
				"5: Muestra todo el vector\n" + 
				"6: Ordena ascendentemente\n" + 
				"9: Salir\r\n");
		eleccion = teclado.nextInt();
		return eleccion;
	}
}
