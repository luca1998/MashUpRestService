package ch.mashup;

import ch.mashup.MashupService.EmailServiceImpl;
import ch.mashup.MashupService.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MashupServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MashupServiceApplication.class, args);
		Request request = new Request();
		request.doRequest();
		request.secondRequest();
		

		EmailServiceImpl emailService = new EmailServiceImpl();
		emailService.sendSimpleMessage("luca.tschanz@tie.ch","test","es lauft");
	}
}
