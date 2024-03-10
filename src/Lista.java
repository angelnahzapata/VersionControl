import java.util.LinkedList;
import java.util.Queue;

public class Lista {
	

	private Queue<nodo> colaActividades;
	private nodo actividadActual;
	
	public Lista() {
        colaActividades = new LinkedList<>();
        actividadActual=null;
        
	}
	
	public void agregarActividad(nodo actividad) {
        colaActividades.offer(actividad);
   
	}
	public void eliminar() {
		colaActividades.remove(actividadActual);
		actividadActual=null;
		
	}
}
	


