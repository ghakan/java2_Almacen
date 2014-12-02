import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Almacen {
	public static void main (String args[]) throws IOException {
		ArrayList<Distribuidor> al_distribuidor = new ArrayList<Distribuidor>();
		ArrayList<Direccion> al_direccion = new ArrayList<Direccion>();
		ArrayList<Contacto> al_contacto = new ArrayList<Contacto>();

		FileReader archivo FileReader("/home/zubiri/ProyectosJava/java2_Almacen/src/distribuidores.txt"));

 		Scanner linea = new Scanner(archivo);
						
			//obtenemos la linea

	 		String concoma = linea.nextLine();
	 		String[] separado = null;

	 		while (linea.hasNextLine())
			{     

				//creamos los objetos
				Distribuidor al_distribuidor=new Distribuidor();
				Direccion odireccion=new Direccion();
				Contacto ocontacto=new Contacto();
	 			
	 			//separamos los datos en el array
	 			separado=concoma.split(",");

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			//DISTRIBUIDOR
	 			odistribuidor.setNombre(separado[0]);
	 			odistribuidor.setCif(separado[1]);
	 			//DIRECCION
	 			odireccion.setCiudad(separado[2]);
	 			odireccion.setCalle(separado[3]);
	 			odireccion.setNumero(Integer.parseInt(separado[4]));
	 			odireccion.setCodPostal(Integer.parseInt(separado[5]));
	 			//Añadimos el objeto direccion al ArrayList
	 			adireccion.add(odireccion);
	 			//CONTACTO
	 			ocontacto.setNombre(separado[6]);
	 			ocontacto.setApellido(separado[7]);
	 			ocontacto.setDni(separado[8]);
	 			ocontacto.setTelefono(Integer.parseInt(separado[9]));
	 			//Añadimos el objeto contacto al ArrayList
	 			acontacto.add(ocontacto);
	 			//completamos los datos del distribuidor con los objetos
				odistribuidor.setDireccion(odireccion);
				odistribuidor.setContacto(ocontacto);
				//añadimos el objeto distribuidor al ArrayList
				adistribuidor.add(odistribuidor);

	 			//leo la proxima linea
				concoma = linea.nextLine();
			}

	}
}