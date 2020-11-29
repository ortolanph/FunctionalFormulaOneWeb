package pho.formulaone.web.cucumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class BasicAPIRequests {

    @LocalServerPort
    private int port;

    @Autowired
    protected TestRestTemplate restTemplate;

    private String basicsAPIEndpoint() {
        String SERVER_URL = "http://localhost";
        String BASICS_API_ENDPOINT = "/api/basics";
        return SERVER_URL + ":" + port + BASICS_API_ENDPOINT;
    }

    public ResponseEntity<String> allSeasons() {
        String path = "/seasons";
        return restTemplate.getForEntity(basicsAPIEndpoint() + path, String.class);
    }

    public ResponseEntity<String> totalRaces() {
        String path = "/totalraces";
        return restTemplate.getForEntity(basicsAPIEndpoint() + path, String.class);
    }

    public ResponseEntity<String> racesPerSeason() {
        String path = "/racesperseason";
        return restTemplate.getForEntity(basicsAPIEndpoint() + path, String.class);
    }

    public ResponseEntity<String> racersPerSeson() {
        String path = "/racersperseason";
        return restTemplate.getForEntity(basicsAPIEndpoint() + path, String.class);
    }

    public ResponseEntity<String> constructorsPerSeson() {
        String path = "/constructorsperseason";
        return restTemplate.getForEntity(basicsAPIEndpoint() + path, String.class);
    }
}
