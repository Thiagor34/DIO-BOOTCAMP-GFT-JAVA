package dio.gft.bootcamp.projetoonefeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Projetoonefeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetoonefeign2Application.class, args);
	}

}
