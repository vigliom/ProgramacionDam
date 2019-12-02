/**
 * @author jorge
 * fecha 23/10/2019
 * Descripcion Programa del juego Piedra papel o tijeras
 */
import java.util.*;

public class Ejer39 {

	public static void main(String[] args) {
		/*
		 * Declaracion de variables
		 */
		Scanner teclado = new Scanner(System.in);//Declaracion del teclado
		Random numAleatorio = new Random();		//Declaracion de el random
		String entrada ="salir";				//Declaracionpara salir
		int opcion = 4;							//Variable de la eleccion del usuario
		int	ia = numAleatorio.nextInt(3)+1;		//Variable del numero aleatorio.
		
		/*
		 * Programa
		 */
		System.out.println("Hola, vamos a jugar a piedra papel o tijeras!!");
		System.out.println("Para jugar vas a tener que escribir Piedra, Papel o Tijeras para jugar.");
		System.out.println("Puedes jugar todas las veces que quieras hasta que pongas Salir.");
		do {
			opcion = 4;			
			ia = numAleatorio.nextInt(3)+1;	//Reinicio de variable de la ia
			System.out.println("Escoja una opcion(Piedra, papel, tijera o salir): ");
			entrada = teclado.nextLine();
			switch (entrada.toLowerCase())
			{
			case "piedra":
				opcion = 1;
				break;
			case "papel":
				opcion = 2;
				break;
			case "tijera":
				opcion = 3;
				break;
			case "salir":
				opcion = 0;
				break;
			default:
				System.out.println("Opcion no valida.");
			}
			//System.out.println("--------" + ia +  "---------");
			switch(ia)
			{
			case 1:
				if (opcion == ia)
					System.out.println("Ambos habeis elegido Piedra. EMPATE");
				if (opcion == 2)
					System.out.println("La maquina ha elegido Piedra. Papel gana a la piedra. ENHORABUENA, \t\nhas ganado");
				if (opcion == 3)
					System.out.println("La maquina ha elegido Piedra. Piedra gana a tijeras. \t\nHas perdido");
					break;
			case 2:
				if (opcion == ia)
					System.out.println("Ambos habeis elegido Papel. EMPATE");
				if (opcion == 1)
					System.out.println("La maquina ha elegido Papel. Papel gana a la piedra.\t\nHas perdido");
				if (opcion == 3)
					System.out.println("La maquina ha elegido Papel. Tijeras gana al papel. ENHORABUENA, \t\nhas ganado");
				break;
			case 3:
			if (opcion == ia)
				System.out.println("Ambos habeis elegido Tijera. EMPATE");
			if (opcion == 1)
				System.out.println("La maquina ha elegido Tijera. Piedra gana a las Tijeras.ENHORABUENA, \t\nhas ganado");
			if (opcion == 2)
				System.out.println("La maquina ha elegido Tijera. Tijeras gana a papel, \t\nHas perdido ");
			break;
			}
			
			
		}while (opcion != 0);
		System.out.println("\t\tGracias por Jugar!!");
		
	}

}
