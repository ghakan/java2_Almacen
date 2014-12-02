public class Direccion {

	//añadid las propiedades convenientes
	private String pais;
	private int cpostal;
	private String direccion;

	//métodos getter y setter
	public void setPais(String dato){
	    	this.pais = dato;
    	}
	public void setCpostal(int dato){
	    	this.cpostal = dato;
    	}
	public void setDireccion(String dato){
	    	this.direccion = dato;
    	}
//*************************************
	public String getPais(String dato){
	    	return this.pais = dato;
    	}
	public int getCpostal(int dato){
	    	return this.cpostal = dato;
    	}
	public String getDireccion(String dato){
	    	return this.direccion = dato;
    	}

}
