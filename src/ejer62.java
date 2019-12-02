/**
 * @author Jorge Perez
 * @date	60/11/2019
 * @description	Comprobador de correos electrónicos
 * 
 */
import java.util.*;

public class ejer62 {

	public static void main(String[] args) {
		/*
		 * Declaracion de variables
		 */
		Scanner teclado = new Scanner(System.in);
		String correo;
		System.out.println("Introduzca su correo electronico(Debe ser un correo valido)");
		correo = teclado.nextLine();
		/*
		 * Declaracion de los errores con if encadenados por prioridad.
		 */
		
		if(correo.indexOf("@") != -1)
		{	
			String[] separada = correo.split("@");
			if(correo.charAt(0)!= '@')
			{
				if(separada[0].length()>=4)
				{
					
					if (separada[1].indexOf(".") != -1)
					{
						String[] seg_part = separada[1].split("\\.");
						if (seg_part[0].length() > 3) 
						{
							if(seg_part[1].contentEquals("com") ||seg_part[1].contentEquals("com")||seg_part[1].contentEquals("com")||seg_part[1].contentEquals("com"))
							{
								/*
								 * Si se cumple las condiciones mostrara este mensaje por pantalla
								 */
								System.out.println("El correo electronico es correcto: " + correo);
							}else 
							{
								System.out.println("Debe estar en los siguentes dominios: .com .es .org .gov");

							}
						}else 
						{
							System.out.println("La segunda parte(entre el @ y el . debe ser como minimo de 3 carácteres");
						}
					}else
					{
						System.out.println("Tiene que haber un . despues del @");

					}
				}else
				{
					System.out.println("la parte del principio(antes del @) debe ser más grande que 4");
				}
			}
			else
			{
				System.out.println("No puede comenzar con @");
			}
		}else
		{
			System.out.println("Falta un @ para ser valido");
			
			
		}
		System.out.println("Adios, gracias por usar este sistema.");
	}

}
