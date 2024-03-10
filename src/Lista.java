import java.util.LinkedList;
import java.util.Queue;

public class Lista {

	private Queue<nodo> colaActividades;
	
	public Lista() {
        colaActividades = new LinkedList<>();
	}
	
	public void agregarActividad(nodo actividad) {
        colaActividades.offer(actividad);
    
	
	
}
}