
public class Simbolo {

public String nombre;
public String tipo;
public Number valor;
	
	public Simbolo (String nombre, String tipo, Number valor) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String toString() {
		return ("["+this.nombre+ ";" +this.tipo+ ";" +this.valor+"]");
	}
	
}
