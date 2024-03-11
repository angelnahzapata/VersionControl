import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

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
	    if (!colaActividades.isEmpty()) {
	        
	        String nombreActividad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la actividad que desea eliminar:", "Eliminar actividad", JOptionPane.QUESTION_MESSAGE);

	        
	        nodo actividad = buscarActividadPorNombre(nombreActividad);

	        if (actividad != null) {
	            
	            colaActividades.remove(actividad);
	            JOptionPane.showMessageDialog(null, "La actividad se ha eliminado exitosamente.", "Actividad eliminada", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ninguna actividad con ese nombre.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "No hay actividades para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	private nodo buscarActividadPorNombre(String nombreActividad) {
		
		return null;
	}

}


