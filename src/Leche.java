public class Leche {

	//propiedades
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;

	//métodos getter y setter
	public void setTipo(String dato){
		this.tipo = dato;	
	}
	public void setProcedencia(String dato){
		this.procedencia = dato;	
	}
	public void setEurosLitro(Double dato){
		this.eurosLitro = dato;	
	}
	public void setDistribuidor(Distribuidor dato){
		this.distribuidor = dato;	
	}
//**************************************
	public String getTipo() {
		return this.tipo;
    	}
	public String getProcedencia() {
		return this.procedencia;
    	}
	public Double getEurosLitro() {
		return this.eurosLitro;
    	}
	public Distribuidor getDistribuidor() {
		return this.distribuidor;
    	}



}
