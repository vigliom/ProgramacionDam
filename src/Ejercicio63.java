import java.util.*;
public class Ejercicio63 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int tam_vec;
		System.out.println("Introduzca el tamanyo final de vector a rellenar: ");
		tam_vec = teclado.nextInt();
		int v[]= new int[tam_vec],
			j[];
		
		for (int i = 0; i<v.length; i++)
		{
			v[i] = (int)(aleatorio.nextDouble()*100+1);
		}
		j = Arrays.copyOfRange(v,0,v.length);
		Arrays.sort(j);
		if (Arrays.equals(v,j))
		{
			System.out.println("La cadena esta ordenada. ");
			
		}else 
		{
			System.out.println("La cadena no esta ordenada. ");

		}
		System.out.print("[");

		for (int i = 0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		System.out.print("]");
		
	}

}
