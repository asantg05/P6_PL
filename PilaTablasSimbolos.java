import java.util.LinkedList;

public class PilaTablasSimbolos extends LinkedList<TablaSimbolos>{

	private LinkedList <TablaSimbolos> pila;
	
	public PilaTablasSimbolos(){
		this.pila = new LinkedList<TablaSimbolos>();
	}
	
	public String toString() {
		return ("Pila: " +pila);
	}
}
