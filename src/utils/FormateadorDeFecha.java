package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormateadorDeFecha {
	private FormateadorDeFecha() {
	}

	public static String formatear(Date f, String formato) {
		SimpleDateFormat formateador =
			new SimpleDateFormat(formato);
		
		return formateador.format(f);
	}
	public static String formatear(GregorianCalendar gc, String formato) {
		return formatear(gc.getTime(), formato);
	}
	
	public static void main(String[] args) {
		GregorianCalendar gc =
			new GregorianCalendar(2007,
						GregorianCalendar.MAY,
						17);

		System.out.println(
				FormateadorDeFecha.formatear(gc, "dd/MM/yyyy"));

		System.out.println(
				FormateadorDeFecha.formatear(gc, "'Hoy es 'dd' de 'MMMM' de 'yyyy"));
	
	}
}
