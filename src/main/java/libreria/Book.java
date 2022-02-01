package libreria;

import java.util.List;
import java.util.stream.Collectors;

import consumos.Consumo;

public class Book {

	private String id;
	private String author;
	private String country;
	private String imageLink; 
	private String language; 
	private String title;
	
	static List<Book> listaLibros = Consumo.consumiendoBooks();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", country=" + country + ", imageLink=" + imageLink
				+ ", language=" + language + ", title=" + title + "]";
	}
	

	public static void imprimir() {
		
		System.out.println(listaLibros.get(0));
		System.out.println("-----------------------\n");
	}
	
	public static void imprimirAutor() {
		listaLibros.stream().forEach(libros -> {
			System.out.println((libros).getAuthor() + ": " + (libros).getTitle());
		});
		System.out.println("-----------------------\n");
	}
	
	public static void imprimirAnonimo() {
		System.out.println("Autores anónimos: \n");
		List<Book> filtroAnonimo = listaLibros.stream().filter(libro -> libro.getAuthor().equals("Unknown"))
				.collect(Collectors.toList());
		List<String> anonimo = filtroAnonimo.stream()
				.map(libro -> "Autor: " + libro.getAuthor() + " - Libro: " + libro.getTitle())
				.collect(Collectors.toList());
		anonimo.stream().forEach(libro -> System.out.println(libro));
		System.out.println("-----------------------\n");

	}

}
