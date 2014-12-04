public class Contacto {

	//añadid las propiedades convenientes
	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;
	
	//métodos getter y setter
	public void setDNI(String dato){
		this.dni = dato;
	}
	public void setNombre(String dato){
		this.nombre = dato;
	}
	public void setApellido(String dato){
		this.apellido = dato;
	}
	public void setTelefono(int dato){
		this.telefono = dato;
	}
//****************************************
	public String getDNI(){
		return this.dni;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
	public int getTelefono(){
		return this.telefono;
	}
}
