package ni.edu.uam.Facturacion.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class Facturacion {

	public static void main(String[] args) throws Exception {
		DBServer.start("Facturacion-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("Facturacion"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
