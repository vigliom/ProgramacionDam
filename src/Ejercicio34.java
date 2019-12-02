/**
 * @author Jorge Perez Ludeña
 */
import java.util.*;

public class Ejercicio34 {

	public static void main(String[] args) {
		int cargo,
			est,
			dias;
		double sueldo = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1- \tProgramador Junior");
		System.out.println("2- \tProgramador Senior");
		System.out.println("3- \tJefe de Proyecto");
		do{
			cargo = teclado.nextInt();
		}while(cargo != 1 && cargo != 2 && cargo != 3);
		System.out.println("¿Cuantos dias has estado de viaje visitando clientes?");
		dias = teclado.nextInt();
		System.out.println("¿Estado civil?");
		System.out.println("1- \tSoltero");
		System.out.println("2- \tCasado");
		est = teclado.nextInt();
		System.out.println("******************************************");
		switch(cargo)
		{
			case 1:
				sueldo = 950;
				System.out.println("*Sueldo Base \t\t\t "+ sueldo +" \t *");
				break;
			case 2:
				sueldo = 1200;
				System.out.println("*Sueldo Base \t\t\t" + sueldo + "\t *");
				break;
			case 3:
				sueldo = 1600;
				System.out.println("*Sueldo Base \t\t\t" + sueldo + "\t *");
				break;
		}
		
		System.out.println("*Dietas de "+dias +" dias \t\t"+ (sueldo + dias * 50) + "\t *");
	}

}
