import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Lista {
	private Queue<nodo> colaActividades;
    private Queue<nodo> colaActividadesCompletadas;
    public Lista() {
        colaActividades = new LinkedList<>();
        colaActividadesCompletadas = new LinkedList<>();
    }
    
	public void mostrarTodasActividades() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de actividades:\n");
        for (nodo actividad : colaActividades) {
            sb.append(actividad).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Todas las actividades", JOptionPane.INFORMATION_MESSAGE);
    }
	public void completarSiguienteActividad() {
	    if (!colaActividades.isEmpty()) {
	        String nombreActividad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la actividad que desea completar:", "Completar actividad", JOptionPane.QUESTION_MESSAGE);
 
	        nodo actividad = buscarActividadPorNombre(nombreActividad);
	        if (actividad != null) {
	            actividad.iscompletado();
	            colaActividades.remove(actividad);
	            colaActividadesCompletadas.offer(actividad);
	            JOptionPane.showMessageDialog(null, "La actividad se ha completado exitosamente.", "Actividad completada", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ninguna actividad con ese nombre.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "No hay actividades para completar", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	public nodo buscarActividadPorNombre(String nombre) {
	    for (nodo actividad : colaActividades) {
	        if (actividad.getTitulo().equalsIgnoreCase(nombre)) {
	            return actividad;
	        }
	    }
	    return null; 
	}
	
	public void mostrarTodasActividadesCompletadas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actividades completadas:\n");
        for (nodo actividad : colaActividadesCompletadas) {
            sb.append(actividad).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Todas las actividades completadas", JOptionPane.INFORMATION_MESSAGE);
    }

}