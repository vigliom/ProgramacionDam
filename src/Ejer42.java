/*
 * @author: Jorge Pérez
 * Fecha:	23/10/2019
 * Descripcion: Calcula el salario
 */
import java.util.*;
public class Ejer42 {

	public static void main(String[] args) {
		double 	horas,			//Numero total de horas
				precio,			//Precio de las horas
				salario;		//Salario total
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quiere calcular el salario. Para ello va a tener que introducir el total de horas");
		System.out.println("y el precio que cobre por las horas.");
		System.out.print("Horas: ");
		horas = teclado.nextDouble();
		System.out.print("Precio de las horas: ");
		precio = teclado.nextDouble();
		if (horas > 40)
		{
			salario = 40 * precio;
			horas -= 40;
			salario += horas * (precio * 1.5);
		}else
			{
				salario = precio * horas;
			}
		System.out.println("El salario total es: " + salario + "euros");
		
				

	}

}
