import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Lista {
	private Queue<nodo> colaActividades;
    public Lista() {
        colaActividades = new LinkedList<>();
    }
    
	public void mostrarTodasActividades() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de actividades:\n");
        for (nodo actividad : colaActividades) {
            sb.append(actividad).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Todas las actividades", JOptionPane.INFORMATION_MESSAGE);
    }

}