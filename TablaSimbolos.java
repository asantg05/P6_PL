import java.util.HashMap;
import java.util.Iterator;

public class TablaSimbolos extends HashMap<String, Simbolo>{
	
	PilaTablasSimbolos pila;
	HashMap <String, Simbolo> tabla_simbolos; // = new HashMap <String, Object> ();
	
	public TablaSimbolos(PilaTablasSimbolos p) {
		this.tabla_simbolos = new HashMap <String, Simbolo> ();
		this.pila = p;
	}
	
	public Simbolo get(String clave) {
		Simbolo simb_encontrado=null;
		
		if(this.containsKey(clave)) {
			simb_encontrado=(Simbolo) super.get(clave);
		}else {
			TablaSimbolos ts=null;
			Iterator<TablaSimbolos> it = pila.iterator();
			while((it.hasNext()) && (simb_encontrado==null)) {
				ts=it.next();
				if(ts.containsKey(clave)) {
					simb_encontrado = ts.get(clave);
				}
			}
		}
		return simb_encontrado;
	}
	
	public String toString() {
		return ("Tabla De Simbolos: " +tabla_simbolos);
	}
	
}
