/**
 * @author jorge
 */
import java.util.*;
import java.text.*;
public class Ejer56 {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis( fecha.getTime() );
		
		do
		{
			System.out.println("--MENU--");
		}while(menu(cal) != 9);
		
	}


public static int menu(Calendar cal) {
	int res = 1,
		dias;
	Scanner teclado = new Scanner(System.in);
	System.out.println("1.-	Obtener fecha actual.");
	System.out.println("2.-	Obtener hora actual.");
	System.out.println("3.-	Sumar dias.");
	System.out.println("4.-	Restar en dias.");
	System.out.println("5.-	Anterior o Posterior.");
	System.out.println("9.-	Salir.");
	res = teclado.nextInt();
	switch(res) {
		case 1:
			imprimefecha();
			break;
		case 2:
			imprimehora();
			break;
		case 3:
			System.out.println("Cuantos dias quieres sumar?");
			dias = teclado.nextInt();
			sumardias(dias, cal);
			break;
		case 4:
			System.out.println("Cuantos dias quieres restar?");
			dias = teclado.nextInt();
			diferencia(dias, cal);
			break;
		case 5:
			posterior();
			break;
		case 9:
			break;
		default:
			System.out.print("Opcion no valida");
			break;
		
	}
	return res;
	}

public static void imprimefecha()
{
	Date fecha = new Date();
	SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MMMMM/yyyy");
	System.out.println(formatoDelTexto.format(fecha));
	}

public static void imprimehora()
{
	Date fecha = new Date();
	SimpleDateFormat formatoDelTexto = new SimpleDateFormat("hh:mm:ss");
	System.out.println(formatoDelTexto.format(fecha));
	}
public static void sumardias(int dias, Calendar cal)
{
	cal.add(Calendar.DATE, dias);
	Date fechasuma = new Date(cal.getTimeInMillis());
	SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MMMM/yyyy  hh:mm:ss");
	System.out.println("Hoy + " + dias + " dias. Sera: " + formatoDelTexto.format(fechasuma));
	}

public static void diferencia(int dias, Calendar cal)
{
	Scanner teclado = new Scanner(System.in);
	String fechaString;
	Date fecha = new Date();
	
	SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
	System.out.println("Introduzca la fecha e el siguente formato: dd-MM-yyyy");
	fechaString = teclado.nextLine();
	Date fechaUsuario = null;
	try
	{
		//Pasar de texto a fecha
		fechaUsuario = formatoDelTexto.parse( fechaString );
		System.out.println("Fecha usuario:"  + formatoDelTexto.format( fechaUsuario ));
	} catch (ParseException e) {
		e.printStackTrace();
		System.out.println("Fecha INCORRECTA");
	}
	
	
	System.out.println("Introduzca la fecha e el siguente formato: dd-MM-yyyy");
	fechaString = teclado.nextLine();
	Date fechaUsuario1 = null;
	try
	{
		//Pasar de texto a fecha
		fechaUsuario = formatoDelTexto.parse( fechaString );
		System.out.println("Fecha usuario:"  + formatoDelTexto.format( fechaUsuario1 ));
	} catch (ParseException e) {
		e.printStackTrace();
		System.out.println("Fecha INCORRECTA");
	}
		System.out.println("Las fechas son: " + formatoDelTexto.format(fechaUsuario) + " y " + formatoDelTexto.format(fechaUsuario1));
	}

public static void posterior() 
{
	Scanner teclado = new Scanner(System.in);
	String fechaString;
	Date fecha = new Date();
	
	SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
	System.out.println("Introduzca la fecha e el siguente formato: dd-MM-yyyy");
	fechaString = teclado.nextLine();
	Date fechaUsuario = null;
	try
	{
		//Pasar de texto a fecha
		fechaUsuario = formatoDelTexto.parse( fechaString );
		System.out.println("Fecha usuario:"  + formatoDelTexto.format( fechaUsuario ));
	} catch (ParseException e) {
		e.printStackTrace();
		System.out.println("Fecha INCORRECTA");
	}
	
	if(fecha.before(fechaUsuario)) {
		System.out.println("La fecha introducida por el usuario es posterior.");
	}else
		{
			System.out.println("La fecha introducida por el usuario es anterior .");
		}
	
}

}