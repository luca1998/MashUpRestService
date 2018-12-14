package ch.mashup.MashupService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class Request {

    @GetMapping("/requestOne")
    public String doRequest() {
        final String uri = "https://geek-jokes.sameerkumar.website/api";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
        return result;
    }

    public void secondRequest() {
        final String uri = "https://api.chucknorris.io/jokes/random";
        RestTemplate restTemplate = new RestTemplate();
            ChuckNorrisJoke result = restTemplate.getForObject(uri, ChuckNorrisJoke.class);
            System.out.println(result.getValue());
    }


}
