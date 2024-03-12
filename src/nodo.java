
public class nodo implements Comparable <nodo>{
private String Titulo;
private String nota;

public nodo(String titulo, String nota) {
	Titulo = titulo;
	this.nota = nota;
}
private boolean destacada;

public nodo() {
    destacada = false; 
}

public boolean isDestacada() {
    return destacada;
}

public void setDestacada(boolean destacada) {
    this.destacada = destacada;
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

@Override
public int compareTo(nodo o) {
	// TODO Auto-generated method stub
	return 0;
}


}