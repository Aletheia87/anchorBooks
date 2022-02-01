package libreria;

import java.util.List;
import java.util.stream.Collectors;

import consumos.Consumo;

public class BookDetail {

	private String id;
	private String author;
	private String country; 
	private String imageLink;
	private String language; 
	private String link; 
	private String pages; 
	private String title;
	private String year;
	private String price; 
	private String lastPrice;
	private String delivery;
	
	static List<BookDetail> listaDetalle = Consumo.consumiendoBookDetail();
	
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	
	@Override
	public String toString() {
		return "BookDetail [id=" + id + ", author=" + author + ", country=" + country + ", imageLink=" + imageLink
				+ ", language=" + language + ", link=" + link + ", pages=" + pages + ", title=" + title + ", year="
				+ year + ", price=" + price + ", lastPrice=" + lastPrice + ", delivery=" + delivery + "]";
	}
	
	public static void imprimir() {
		System.out.println(listaDetalle.get(0));
		System.out.println("-----------------------\n");
	}
	
	public static void imprimirPosicion() {
		List<BookDetail> posiciones = listaDetalle.stream()
				.filter(posicion -> posicion.getId().equals("3") || posicion.getId().equals("8"))
				.collect(Collectors.toList());
		List<String> ubicacion = posiciones.stream().map(libro -> "Libro número " + libro.getId() + ": "
				+ libro.getAuthor() + ", " + libro.getTitle() + ", " + libro.getCountry()).collect(Collectors.toList());
		ubicacion.stream().forEach(libro -> System.out.println(libro));
		System.out.println("-----------------------\n");
	}
	
	public static void imprimirDelivery() {
		System.out.println("Libros con delivery disponibles: \n");
		List<BookDetail> filtroDelivery = listaDetalle.stream().filter(libro -> libro.getDelivery().equals("true"))
				.collect(Collectors.toList());
		List<String> delivery = filtroDelivery.stream().map(libro -> "Libro: " + libro.getTitle())
				.collect(Collectors.toList());
		delivery.stream().forEach(libro -> System.out.println(libro));
		System.out.println("-----------------------\n");
	}

}
