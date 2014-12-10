public class Cliente {
//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private Double num_socio;
	private Double dto;

	//métodos getter y setter
	public void setNombre(String dato){
		this.nombre = dato;	
	}
	public void setApellidos(String dato){
		this.apellidos = dato;	
	}
	public void setDNI(String dato){
		this.DNI = dato;	
	}
	public void setDireccion(Direccion dato){
		this.direccion = dato;	
	}
	public void setNum_socio(Double dato){
		this.num_socio = dato;	
	}
	public void setDto(Double dato){
		this.dto = dato;	
	}
//**************************************
	public String getNombre() {
		return this.nombre;
    }
	public String getApellidos() {
		return this.apellidos;
    }
	public String getDNI() {
		return this.DNI;
    }
    public Direccion getDireccion() {
		return this.direccion;
    }
    public Double getNum_socio() {
		return this.num_socio;
    }
    public Double getDto() {
		return this.dto;
    }
}
