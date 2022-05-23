package dio.gft.bootcamp.springbootweb;

@RestController
public class Controle {	
	
	@GetMapping()
	public String mensagem() {
		return "Nosso primeiro projeto Spring Boot Web";
	}

}
