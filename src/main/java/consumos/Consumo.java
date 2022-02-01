package consumos;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import libreria.Book;
import libreria.BookDetail;

public class Consumo {
	
	public static List<Book> consumiendoBooks() {
		Client client = ClientBuilder.newClient();
		WebTarget wt = client.target("https://my-json-server.typicode.com/").path("Himuravidal").path("anchorBooks").path("books");
		Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
		Response respuestaLibros = invocationBuilder.get();
		List<Book> listaLibros = respuestaLibros.readEntity(new GenericType<List<Book>>() {});
		
		return listaLibros;
	}
	
	public static List<BookDetail> consumiendoBookDetail() {
		Client client = ClientBuilder.newClient();
		WebTarget wt = client.target("https://my-json-server.typicode.com/").path("Himuravidal").path("anchorBooks").path("bookDetail");
		Invocation.Builder invocationBuilder = wt.request(MediaType.APPLICATION_JSON);
		Response respuestaDetalle = invocationBuilder.get();
		List<BookDetail> listaDetalle = respuestaDetalle.readEntity(new GenericType<List<BookDetail>>() {});
		
		return listaDetalle;
	}

}
