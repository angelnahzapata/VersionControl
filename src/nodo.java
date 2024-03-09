
public class nodo implements Comparable <nodo>{
private String Titulo;
private String nota;
private boolean completado;

public nodo(String titulo, String nota, boolean completado) {
	Titulo = titulo;
	this.nota = nota;
	this.completado = completado;
}

public String getTitulo() {
	return Titulo;
}

public void setTitulo(String titulo) {
	Titulo = titulo;
}

public String getNota() {
	return nota;
}

public void setNota(String nota) {
	this.nota = nota;
}

public boolean iscompletado() {
	return completado;
}

public void setcompletado(boolean completado) {
	this.completado = completado;
}

@Override
public String toString() {
    return Titulo + (completado ? " (Completada)" : "");
}


@Override
public int compareTo(nodo o) {
	// TODO Auto-generated method stub
	return 0;
}




}
