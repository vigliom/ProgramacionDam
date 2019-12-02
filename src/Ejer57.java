/**
 * @author jorge
 */
import java.util.*;
public class Ejer57 {

	public static void main(String[] args) {
	int res;
		do{
			res = menu();
		}while(res != 9);
		System.out.println("Hasta Otra!");
	}
public static int menu() {
	int res,
		x,
		y;
	String palabra,
		   palabra1;
	Scanner teclado = new Scanner(System.in);
	System.out.printf("1.- Longitud de una cadena\r\n" + 
			"2.- Comparación de dos cadenas\r\n" + 
			"3.- Concatenación de dos cadenas\r\n" + 
			"4.- Obtener subcadenas\r\n" + 
			"5.- Invertir cadenas\r\n" + 
			"6.- Es palíndromo\r\n" + 
			"9.- Salir\r\n");
	res = teclado.nextInt();
	teclado.nextLine();
	switch(res){
	case 1:
		System.out.println("Introduce una cadena: ");
		palabra = teclado.nextLine();
		System.out.println("La cadena tiene: " + palabra.length() + " caracteres");
		break;
	case 2:
		System.out.println("Introduce la primera cadena: ");
		palabra = teclado.nextLine();
		System.out.println("Introduce la segunda cadena: ");
		palabra1 = teclado.nextLine();
		if (palabra.compareTo(palabra1)>0)
		{
			System.out.println(palabra + "," + palabra1);
		}else if (palabra.compareTo(palabra1)<0)
		{

			System.out.println(palabra1 + "," + palabra);
		}else if(palabra.compareTo(palabra1)==0)
		{
			System.out.println(palabra1 + "=" + palabra);
		}
		break;
	case 3:
		System.out.println("Introduce la primera cadena: ");
		palabra = teclado.nextLine();
		System.out.println("Introduce la segunda cadena: ");
		palabra1 = teclado.nextLine();
		palabra = palabra + palabra1;
		System.out.println("concatenado: " + palabra);
		break;
	case 4:
		System.out.println("Introduce una cadena: ");
		palabra = teclado.nextLine();
		System.out.println("Introduce el inicio del segmento: ");
		x = teclado.nextInt();
		System.out.println("Introduce el final del segmento: ");
		y = teclado.nextInt();
		palabra1 = palabra.substring(x, y);
		System.out.println("el segmento de " + palabra + " seleccionado es: " + palabra1);
		break;
	case 5:
		palabra1 = "";
		System.out.println("Introduce una cadena: ");
		palabra = teclado.nextLine();
		for (int i = palabra.length(); i > 0; i--)
		{
			palabra1 += palabra.substring(i-1,i);
		}
		System.out.println(palabra + " , " + palabra1);
			
		break;
	case 6:
		palabra1 = "";
		System.out.println("Introduce una cadena: ");
		palabra = teclado.nextLine();
		for (int i = palabra.length(); i > 0; i--)
		{
			palabra1 += palabra.substring(i-1,i);
		}
		if (palabra1.equals(palabra))
		{
			System.out.println("Es Palindroma");
		}else
		{

			System.out.println("No es Palindroma");
		}
		break;
	case 9:
		
		break;
	}
	return res;
}
}
