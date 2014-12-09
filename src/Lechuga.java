public class Lechuga {

	//propiedades
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;

	//métodos getter y setter
	public void setTipoLechuga(String dato){
	    	this.tipoLechuga = dato;
    	}
	public void setProcedencia(String dato){
	    	this.procedencia = dato;
    	}
	public void setColor(String dato){
	    	this.color = dato;
    	}
	public void setEurosUnidad(Double dato){
	    	this.eurosUnidad = dato;
    	}
	public void setDistribuidor(Distribuidor dato){
	    	this.distribuidor = dato;
    	}
//*************************************
	public String getTipoLechuga() {
		return this.tipoLechuga;
    	}
	public String getProcedencia() {
		return this.procedencia;
    	}
	public String getColor() {
		return this.color;
    	}
	public Double getEurosUnidad() {
		return this.eurosUnidad;
    	}
	public Distribuidor getDistribuidor() {
		return this.distribuidor;
    	}

}
