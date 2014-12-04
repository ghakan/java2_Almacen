public class Distribuidor {
	//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	public void setNombre(String dato){
	    	this.nombre = dato;
    	}
	public void setCIF(String dato){
	    	this.cif = dato;
    	}
	public void setDireccion(Direccion dato){
	    	this.direccion = dato;
    	}
	public void setPersonaContacto(Contacto dato){
	    	this.personaContacto = dato;
    	}
//*************************************
	public String getNombre(){
		return this.nombre;
	}
	public String getCIF(){
		return this.cif;
	}
	public Direccion getDireccion(){
		return this.direccion;
	}
	public Contacto getPersonaContacto(){
		return this.personaContacto;
	}
}
