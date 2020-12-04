package pho.formulaone.web.cucumber.requests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class APIRequests {

    @LocalServerPort
    private int port;

    private static final String SERVER_URL = "http://localhost";

    @Autowired
    protected TestRestTemplate restTemplate;

    private String basicsAPIEndpoint() {
        String BASICS_API_ENDPOINT = "/api/basics";
        return String.format("%s:%d%s", SERVER_URL, port, BASICS_API_ENDPOINT);
    }

    private String positionsAPIEndpoint() {
        String POSITIONS_API_ENDPOINT = "/api/positions";
        return String.format("%s:%d%s", SERVER_URL, port, POSITIONS_API_ENDPOINT);
    }

    public ResponseEntity<String> allSeasons() {
        String path = String.format("%s%s", basicsAPIEndpoint(), "/seasons");
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> totalRaces() {
        String path = String.format("%s%s", basicsAPIEndpoint(), "/totalraces");
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> racesPerSeason() {
        String path = String.format("%s%s", basicsAPIEndpoint(), "/racesperseason");
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> racersPerSeson() {
        String path = String.format("%s%s", basicsAPIEndpoint(), "/racersperseason");
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> constructorsPerSeson() {
        String path = String.format("%s%s", basicsAPIEndpoint(), "/constructorsperseason");
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> grid(Integer season, Integer round) {
        String path = String.format("%s/season/%d/round/%d/grid", positionsAPIEndpoint(), season, round);
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> podium(Integer season, Integer round) {
        String path = String.format("%s/season/%d/round/%d/podium", positionsAPIEndpoint(), season, round);
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> winner(Integer season, Integer round) {
        String path = String.format("%s/season/%d/round/%d/winner", positionsAPIEndpoint(), season, round);
        return restTemplate.getForEntity(path, String.class);
    }

    public ResponseEntity<String> poleposition(Integer season, Integer round) {
        String path = String.format("%s/season/%d/round/%d/poleposition", positionsAPIEndpoint(), season, round);
        return restTemplate.getForEntity(path, String.class);
    }
}
