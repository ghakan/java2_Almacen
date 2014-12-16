public class Manzana {
	//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	private int codigobarras;

	//métodos getter y setter
	public void setTipoManzana(String dato){
	    	this.tipoManzana = dato;
    	}
	public void setProcedencia(String dato){
	    	this.procedencia = dato;
    	}
	public void setColor(String dato){
	    	this.color = dato;
    	}
	public void setEurosKilo(Double dato){
	    	this.eurosKilo = dato;
    	}
	public void setDistribuidor(Distribuidor dato){
	    	this.distribuidor = dato;
    	}
    public void setCodigobarras(int dato){
		this.codigobarras = dato;
	}
//*************************************
	public String getTipoManzana() {
		return this.tipoManzana;
    	}
	public String getProcedencia() {
		return this.procedencia;
    	}
	public String getColor() {
		return this.color;
    	}
	public Double getEurosKilo() {
		return this.eurosKilo;
    	}
	public Distribuidor getDistribuidor() {
		return this.distribuidor;
    	}
    public int getCodigobarras() {
		return this.codigobarras;
    }
}
