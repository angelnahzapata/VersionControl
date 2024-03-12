import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Lista {
//<<<<<<< HEAD
    private Queue<nodo> colaActividades;
    
    private nodo actividadActual;
    public Lista() {
        colaActividades = new LinkedList<>();
        setActividadActual(null);
    }
    

    public void destacar() {
        if (!colaActividades.isEmpty()) {
            String nombreActividad = JOptionPane.showInputDialog(null, "Ingrese el nombre de la actividad que desea destacar:", "Destacar actividad", JOptionPane.QUESTION_MESSAGE);
            nodo actividad = buscarActividadPorNombre(nombreActividad);

            if (actividad != null) {
                actividad.setDestacada(true);
                JOptionPane.showMessageDialog(null, "La actividad se ha destacado como importante.", "Actividad destacada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna actividad con ese nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay actividades para destacar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private nodo buscarActividadPorNombre(String nombreActividad) {
		// TODO Auto-generated method stub
		return null;
	}


    public void mostrarDestacados() {
        boolean hayDestacados = false;
        StringBuilder sb = new StringBuilder();
        sb.append("Actividades destacadas:\n");
        
        for (nodo actividad : colaActividades) {
            if (actividad.isDestacada()) {
                sb.append(actividad);
                if (actividad.getNota() != null && !actividad.getNota().isEmpty()) {
                    sb.append(" - Notas: ").append(actividad.getNota());
                }
                sb.append("\n");
                hayDestacados = true;
            }
        }
        
        if (hayDestacados) {
            JOptionPane.showMessageDialog(null, sb.toString(), "Actividades destacadas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay actividades destacadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//=======
	

//	private Queue<nodo> colaActividades;
	//private nodo actividadActual;
	
	/*public Lista() {
        colaActividades = new LinkedList<>();
        actividadActual=null;
        
	}*/
	
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


	public nodo getActividadActual() {
		return actividadActual;
	}


	public void setActividadActual(nodo actividadActual) {
		this.actividadActual = actividadActual;
	}

	/*private nodo buscarActividadPorNombre(String nombreActividad) {
		
		return null;
	}*/
//>>>>>>> refs/remotes/origin/Rama_Gerardo

}


