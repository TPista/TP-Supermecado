public class Libro {
	String titulo;
	String autor;
	int cantidadPaginas;
	int ISBN;
	int a�o;
	String editorial;
	String genero;
	
	public Libro(String titulo,String autor,int cantidadPaginas,int isbn,int a�o,String editorial,String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadPaginas = cantidadPaginas;
		this.ISBN = isbn;
		this.a�o = a�o;
		this.editorial = editorial;
		this.genero = genero;
	}
	
}