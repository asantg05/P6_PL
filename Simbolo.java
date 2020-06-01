
public class Simbolo {

public String nombre;
public String tipo_dato;
public Number valor_numerico;
	
	public Simbolo (String nombre, String tipo_dato, Number valor_numerico) {
		this.nombre = nombre;
		this.tipo_dato = tipo_dato;
		this.valor_numerico = valor_numerico;
	}
	
	public String toString() {
		return ("Nombre: " +this.nombre+ ", Tipo de Dato: " +this.tipo_dato+ ", Valor= " +this.valor_numerico);
	}
	
}
