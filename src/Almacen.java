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
			for(int x=0; x<al_distribuidor.size(); x++){

	      		System.out.print("\n*************************************\n");
				//escribimos los datos del distribuidor de la posicion x
				System.out.println("Nombre: " + al_distribuidor.get(x).getNombre());
				System.out.println("C.I.F.: " + al_distribuidor.get(x).getCIF());
				System.out.println("Direccion: ");
					System.out.println("	" + al_distribuidor.get(x).getDireccion().getPais());
					System.out.println("	" + al_distribuidor.get(x).getDireccion().getDireccion());
					System.out.println("	" + al_distribuidor.get(x).getDireccion().getCpostal());
				System.out.println("Persona de contacto: ");
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getDNI());
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getNombre());
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getApellido());
					System.out.println("	" + al_distribuidor.get(x).getPersonaContacto().getTelefono());
			System.out.println("--------------------------------");   
			
			}

			//************************ MANZANA ****************************
		/*	ArrayList<Manzana> al_manzana = new ArrayList<Manzana>();
			Scanner sc = new Scanner(System.in);

		for(int k=0; k<2; k++){
			Manzana o_manzana = new Manzana();
			System.out.println("\n ****************** Manzana Nº"+(k+1)+" **************** ");
				System.out.println("\n\tTipo manzana:");
					o_manzana.setTipoManzana(sc.next());
				System.out.println("\n\tProcedencia:");
					o_manzana.setProcedencia(sc.next());
				System.out.println("\n\tColor:");
					o_manzana.setColor(sc.next());
				System.out.println("\n\tEuros el kilo:");
					o_manzana.setEurosKilo(sc.nextDouble());
			System.out.println("\n\t¿Distribuidor?");
				String distri = sc.next();

				for(int z=0; z<al_distribuidor.size(); z++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(z).getNombre())){
						o_manzana.setDistribuidor(al_distribuidor.get(z));
					}
				}
				al_manzana.add(o_manzana);
		} */

		//************************ LECHUGA ****************************
			ArrayList<Lechuga> al_lechuga = new ArrayList<Lechuga>();
			Scanner sc = new Scanner(System.in);

			Lechuga o_lechuga = new Lechuga();
			System.out.println("\n ****************** Lechuga Nº1 **************** ");
				System.out.println("\n\tTipo lechuga:");
					o_lechuga.setTipoLechuga(sc.next());
				System.out.println("\n\tProcedencia:");
					o_lechuga.setProcedencia(sc.next());
				System.out.println("\n\tColor:");
					o_lechuga.setColor(sc.next());
				System.out.println("\n\tEuros la unidad:");
					o_lechuga.setEurosUnidad(sc.nextDouble());
			System.out.println("\n\t¿Distribuidor?");
				String distri = sc.next();

				for(int h=0; h<al_distribuidor.size(); h++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(h).getNombre())){
						o_lechuga.setDistribuidor(al_distribuidor.get(h));
					}
				}
				al_lechuga.add(o_lechuga);

		/*for(int j=0; j<al_manzana.size(); j++){
			System.out.println(al_manzana.get(j).getTipoManzana());
			System.out.println(al_manzana.get(j).getProcedencia());
			System.out.println(al_manzana.get(j).getColor());
			System.out.println(al_manzana.get(j).getEurosKilo());
			System.out.println(al_manzana.get(j).getDistribuidor().getNombre());
		}*/
		/*for(int y=0; y<al_lechuga.size(); y++){
			System.out.println(al_lechuga.get(y).getTipoLechuga());
			System.out.println(al_lechuga.get(y).getProcedencia());
			System.out.println(al_lechuga.get(y).getColor());
			System.out.println(al_lechuga.get(y).getEurosUnidad());
			System.out.println(al_lechuga.get(y).getDistribuidor().getNombre());
		}*/
		//************************ LECHUGA ****************************
		ArrayList<Leche> al_leche = new ArrayList<Leche>();
			Scanner sc = new Scanner(System.in);

		for(int u=0; u<2; u++){
			Leche o_leche = new Leche();
			System.out.println("\n ****************** Leche Nº"+(u+1)+" **************** ");
				System.out.println("\n\tTipo de Leche:");
					o_leche.setTipo(sc.next());
				System.out.println("\n\tProcedencia:");
					o_leche.setProcedencia(sc.next());
				System.out.println("\n\tEuros el litro:");
					o_leche.setEurosLitro(sc.nextDouble());
			System.out.println("\n\t¿Distribuidor?");
				String distri = sc.next();

				for(int w=0; w<al_distribuidor.size(); w++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(w).getNombre())){
						o_leche.setDistribuidor(al_distribuidor.get(w));
					}
				}
				al_leche.add(o_leche);
		}
	}
}