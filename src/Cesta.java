import java.util.ArrayList;

public class Cesta {
//propiedades
//Cliente
	private Cliente cliente;
//ArrayList de cada producto
	private ArrayList<Manzana> manzana;
	private ArrayList<Lechuga> lechuga;
	private ArrayList<Leche> leche;
//métodos getter y setter
	public void setCliente(Cliente dato){
		this.cliente = dato;	
	}
	public void setManzana(ArrayList<Manzana> dato){
		this.manzana = dato;	
	}
	public void setLechuga(ArrayList<Lechuga> dato){
		this.lechuga = dato;	
	}
	public void setLeche(ArrayList<Leche> dato){
		this.leche = dato;	
	}
//**************************************
	public Cliente getCliente (){
		return this.cliente;
	}
	public ArrayList<Manzana> getManzana() {
		return this.manzana;
    }
   	public ArrayList<Lechuga> getLechuga() {
		return this.lechuga;
    }
    public ArrayList<Leche> getLeche() {
		return this.leche;
    }

//método calcular importe compra

}