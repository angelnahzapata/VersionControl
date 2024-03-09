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
        nodo actividad = colaActividades.poll();
        actividad.iscompletado();
        colaActividadesCompletadas.offer(actividad);
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