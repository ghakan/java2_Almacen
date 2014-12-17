import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;


public class Almacen {
	public static void main (String args[]) throws IOException {

		int seleccion = 0;
		String distri = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("*********** PULSA NUMERO *********");
		System.out.println("1- Mostrar distribuidores");
		System.out.println("2- Introducir productos");
		System.out.println("3- Mostrar clientes");
		System.out.println("4- Cesta");
		System.out.println("5- Salir");
		System.out.println("*********** ************ *********");
		seleccion = sc.nextInt();
		ArrayList<Distribuidor> al_distribuidor = new ArrayList<Distribuidor>();

		FileReader archivo = new FileReader("/home/zubiri/ProyectosJava/java2_Almacen/src/distribuidores.txt");
		FileReader archivo2 = new FileReader("/home/zubiri/ProyectosJava/java2_Almacen/src/clientes.txt");
		FileReader archivo3 = new FileReader("/home/zubiri/ProyectosJava/java2_Almacen/src/productos.txt");

 		Scanner linea = new Scanner(archivo);
 		Scanner linea2 = new Scanner(archivo2);
 		Scanner linea3 = new Scanner(archivo3);
						
			//obtenemos la linea
	 		String[] separado = null;
	 		String[] separado2 = null;
	 		String[] separado3 = null;	

	 		ArrayList<Cliente> al_cliente = new ArrayList<Cliente>();
	 		ArrayList<Manzana> al_manzana = new ArrayList<Manzana>();
	 		ArrayList<Lechuga> al_lechuga = new ArrayList<Lechuga>();
	 		ArrayList<Leche> al_leche = new ArrayList<Leche>();

	 		//creamos los objetos
	 		Distribuidor o_distribuidor = new Distribuidor();
			Direccion o_direccion = new Direccion();
			Contacto o_contacto = new Contacto();
	 		Manzana o_manzana = new Manzana();
			Leche o_leche = new Leche();
			Lechuga o_lechuga = new Lechuga();
			Cesta o_cesta = new Cesta();

	 		while (linea2.hasNextLine()){     
	 			//creamos los objetos
				Cliente o_cliente = new Cliente();
				Direccion o_direccion2 = new Direccion();
	 			
	 			//separamos los datos en el array
	 			separado2=linea2.nextLine().split(", ");
	 			//System.out.print("\n"+separado[0]);

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			//CLIENTE
	 			o_cliente.setNombre(separado2[0]);
	 			o_cliente.setApellidos(separado2[1]);
	 			o_cliente.setDNI(separado2[2]);
	 			//DIRECCION
	 			o_direccion2.setDireccion(separado2[3]);
	 			//CLIENTE
	 			o_cliente.setNum_socio(Double.parseDouble(separado2[4]));
	 			o_cliente.setDto(Double.parseDouble(separado2[5]));

	 			o_cliente.setDireccion(o_direccion2);
				//añadimos el objeto distribuidor al ArrayList
				al_cliente.add(o_cliente);
			}

			while (linea3.hasNextLine()){ 

	 			//separamos los datos en el array
	 			separado3=linea3.nextLine().split(", ");
	 			//System.out.print("\n"+separado[0]);

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			//Manzana
	 			o_manzana.setTipoManzana(separado3[0]);
	 			o_manzana.setProcedencia(separado3[1]);
	 			o_manzana.setColor(separado3[2]);
	 			o_manzana.setEurosKilo(Double.parseDouble(separado3[3]));
	 			o_distribuidor.setNombre(separado3[4]);
	 			o_manzana.setDistribuidor(o_distribuidor);
	 			o_manzana.setCodigobarras(Integer.parseInt(separado3[5]));

	 			//o_manzana.setCodigobarras(o_manzana);
				//añadimos el objeto distribuidor al ArrayList
				al_manzana.add(o_manzana);
			}

	 		while (linea.hasNextLine()){

	 			
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
			archivo.close();
				//System.out.print(al_distribuidor.get(0).getNombre());
			switch (seleccion){
				case 1: 
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
				break;
			case 2:
			//************************ INICIO MANZANA ****************************
			for(int k=0; k<2; k++){
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
				distri = sc.next();

				for(int z=0; z<al_distribuidor.size(); z++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(z).getNombre())){
						o_manzana.setDistribuidor(al_distribuidor.get(z));
					}
				}
				al_manzana.add(o_manzana);
		}

		//************************ INICIO LECHUGA ****************************
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
				distri = sc.next();

				for(int h=0; h<al_distribuidor.size(); h++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(h).getNombre())){
						o_lechuga.setDistribuidor(al_distribuidor.get(h));
					}
				}
				al_lechuga.add(o_lechuga);

			//************************ FIN LECHUGA ****************************

			for(int u=0; u<2; u++){
				System.out.println("\n ****************** Leche Nº"+(u+1)+" **************** ");
				System.out.println("\n\tTipo de Leche:");
					o_leche.setTipo(sc.next());
				System.out.println("\n\tProcedencia:");
					o_leche.setProcedencia(sc.next());
				System.out.println("\n\tEuros el litro:");
					o_leche.setEurosLitro(sc.nextDouble());
				System.out.println("\n\t¿Distribuidor?");
				distri = sc.next();

				for(int w=0; w<al_distribuidor.size(); w++){
					if (distri.equalsIgnoreCase(al_distribuidor.get(w).getNombre())){
						o_leche.setDistribuidor(al_distribuidor.get(w));
					}
				}
				al_leche.add(o_leche);
		}
		// *********************** MOSTRAMOS DATOS PRODUCTOS ************
		for(int j=0; j<al_manzana.size(); j++){
			System.out.println("Tipo manzana: " + al_manzana.get(j).getTipoManzana());
			System.out.println("Procedencia: " + al_manzana.get(j).getProcedencia());
			System.out.println("Color: " + al_manzana.get(j).getColor());
			System.out.println("Euros/Kilo: " + al_manzana.get(j).getEurosKilo());

			System.out.println("DISTRIBUIDOR: " + al_manzana.get(j).getDistribuidor().getNombre());
			System.out.println("CIF:" + al_manzana.get(j).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + al_manzana.get(j).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + al_manzana.get(j).getDistribuidor().getPersonaContacto().getNombre() + " " + al_manzana.get(j).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + al_manzana.get(j).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		for(int y=0; y<al_lechuga.size(); y++){
			System.out.println("*********************************************************");
			System.out.println("Tipo lechuga: " + al_lechuga.get(y).getTipoLechuga());
			System.out.println("Procedencia: " + al_lechuga.get(y).getProcedencia());
			System.out.println("Color: " + al_lechuga.get(y).getColor());
			System.out.println("Euro/Unidad: " + al_lechuga.get(y).getEurosUnidad());

			System.out.println("DISTRIBUIDOR: " + al_lechuga.get(y).getDistribuidor().getNombre());
			System.out.println("CIF:" + al_lechuga.get(y).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + al_lechuga.get(y).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + al_lechuga.get(y).getDistribuidor().getPersonaContacto().getNombre() + " " + al_lechuga.get(y).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + al_lechuga.get(y).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}

		for(int i=0; i<al_leche.size(); i++){
			System.out.println("*********************************************************");
			System.out.println("Tipo leche: " + al_leche.get(i).getTipo());
			System.out.println("Procedencia: " + al_leche.get(i).getProcedencia());
			System.out.println("Euro/Litro: " + al_leche.get(i).getEurosLitro());

			System.out.println("DISTRIBUIDOR: " + al_leche.get(i).getDistribuidor().getNombre());
			System.out.println("CIF:" + al_leche.get(i).getDistribuidor().getCIF());
			System.out.println("DIRECCION:" + al_leche.get(i).getDistribuidor().getDireccion().getDireccion());
			System.out.println("CONTACTO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getNombre()+ " " + al_leche.get(i).getDistribuidor().getPersonaContacto().getApellido());
			System.out.println("TELEFONO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getTelefono());
			System.out.println("*********************************************************");
		}
		break;
		case 3:
	//******************************** INICIO CLIENTES **********************************************

			for(int e=0; e<al_distribuidor.size(); e++){

	      		System.out.print("\n*************************************\n");
				//escribimos los datos del distribuidor de la posicion e
				System.out.println("Nombre cliente: " + al_cliente.get(e).getNombre());
				System.out.println("Apellidos: " + al_cliente.get(e).getApellidos());
				System.out.println("Direccion: " + al_cliente.get(e).getDireccion().getDireccion());
					System.out.println("Numero socio: " + al_cliente.get(e).getNum_socio());
					System.out.println("Descuento " + al_cliente.get(e).getDto());
				System.out.println("--------------------------------");
			}
		break;
		case 4:
		 //cesta
			//int numSocio = null;
      		System.out.print("\n----------- CESTA ---------------\n");
			//pedimos el numero de socio
			System.out.println("\n\tIntroduce tu numero de socio:");
				int numSocio = sc.nextInt();
			System.out.println("--------------------------------");
			Double descuentoCesta = 0.0;
			for(int p=0; p<al_cliente.size(); p++){
				Double resultadoSocio = al_cliente.get(p).getNum_socio();
				if (numSocio == resultadoSocio){
					System.out.print("\n*************************************\n");
					//escribimos el numero de socio del cliente de la posicion p
					System.out.println("Nombre cliente: " + al_cliente.get(p).getNombre());
					System.out.println("Apellidos: " + al_cliente.get(p).getApellidos());
					System.out.println("Direccion: " + al_cliente.get(p).getDireccion().getDireccion());
					System.out.println("Numero socio: " + al_cliente.get(p).getNum_socio());
					System.out.println("Descuento: " + al_cliente.get(p).getDto()+"%");
					System.out.println("--------------------------------");
					descuentoCesta = al_cliente.get(p).getDto();
				}
				else {
				//no has introducido un nuemro de socio correcto
				}
			}
			System.out.println("\n\tIntroduce el codigo de barras del producto:");
				//o_cesta = o_manzana.setManzana.setCodigobarras(sc.next());
				int codigoB = sc.nextInt();
					//System.out.println(codigoB);
			for(int f=1; f<al_manzana.size(); f++){
				int cantidadProducto = al_manzana.get(f).getCodigobarras();
					System.out.println(cantidadProducto);
				//if (codigoB == cantidadProducto){
					System.out.println("Tipo manzana: " + al_manzana.get(f).getTipoManzana());
					System.out.println("Procedencia: " + al_manzana.get(f).getProcedencia());
					System.out.println("Color: " + al_manzana.get(f).getColor());
					System.out.println("Euros/Kilo: " + al_manzana.get(f).getEurosKilo()+"€");
						Double eurokilo = al_manzana.get(f).getEurosKilo();
					System.out.println("DISTRIBUIDOR: " + al_manzana.get(f).getDistribuidor().getNombre());

						o_cesta.setDescuento(descuentoCesta, eurokilo);
						Double total = o_cesta.getDescuento();
						System.out.println("Precio con descuento: " + total + "€");
					System.out.println("*********************************************************");
				/*else {
				//no has introducido el codigo de barras correcto
				}*/
			}
		break;
		case 5:
			System.out.println("\tVuelve cuando quieras. ");
		break;
		default:
			System.out.println("\tVuelvelo a intentar introduciendo un numero del menú ");
		}
	}
}