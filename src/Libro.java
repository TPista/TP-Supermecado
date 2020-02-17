public class Libro {
	String titulo;
	String autor;
	int cantidadPaginas;
	int ISBN;
	int año;
	String editorial;
	String genero;
	
	public Libro(String titulo,String autor,int cantidadPaginas,int isbn,int año,String editorial,String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadPaginas = cantidadPaginas;
		this.ISBN = isbn;
		this.año = año;
		this.editorial = editorial;
		this.genero = genero;
	}
	
}