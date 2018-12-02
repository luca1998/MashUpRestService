package Request;

import objects.Witz;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Request {

    private Witz witz;
    public void doRequest(){

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("https://api.chucknorris.io/jokes/random");
        witz = webTarget.request(MediaType.APPLICATION_JSON).get(Witz.class);
        System.out.println(witz.getValue());
    }
}
