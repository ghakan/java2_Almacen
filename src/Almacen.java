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

		FileReader archivo = new FileReader("/home/zubiri/ProyectosJava/java2_Almacen/src/distribuidores.txt");

 		Scanner linea = new Scanner(archivo);
						
			//obtenemos la linea
	 		String[] separado = null;

	 		while (linea.hasNextLine())
			{     

				//creamos los objetos
				Distribuidor o_distribuidor = new Distribuidor();
				Direccion o_direccion = new Direccion();
				Contacto o_contacto = new Contacto();
	 			
	 			//separamos los datos en el array
	 			separado=linea.nextLine().split(", ");
	 			//System.out.print("\n"+separado[0]);

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			//DISTRIBUIDOR
	 			o_distribuidor.setNombre(separado[0]);

	 			o_distribuidor.setCIF(separado[1]);
	 			//DIRECCION
	 			o_direccion.setPais(separado[2]);
	 			o_direccion.setCpostal(Integer.parseInt(separado[3]));
	 			o_direccion.setDireccion(separado[4]);
	 			//CONTACTO
	 			o_contacto.setDNI(separado[5]);
	 			o_contacto.setNombre(separado[6]);
	 			o_contacto.setApellido(separado[7]);
	 			o_contacto.setTelefono(Integer.parseInt(separado[8]));

	 			//completamos los datos del distribuidor con los objetos
				o_distribuidor.setDireccion(o_direccion);
				o_distribuidor.setPersonaContacto(o_contacto);

				//añadimos el objeto distribuidor al ArrayList
				al_distribuidor.add(o_distribuidor);
			}

				//System.out.print(al_distribuidor.get(0).getNombre());
			//recorremos el arraylist
			for(int x=0; x<al_distribuidor.size(); x++)
			{
	      		System.out.print("\n*************************************\n");
				//escribimos los datos del distribuidor de la posicion x
				System.out.println("Nombre: " + al_distribuidor.get(x).getNombre());
				System.out.println("C.I.F.: " + al_distribuidor.get(x).getCIF());
				System.out.println("Direccion: ");
					//System.out.println("	" + al_distribuidor.get(x).getDireccion().getPais());
					//System.out.println("	" + al_distribuidor.get(x).getDireccion().getDireccion());
				System.out.println("Persona de contacto: ");
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getDNI());
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getNombre());
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getApellido());
			System.out.println("--------------------------------");   
			
			}

	}
}