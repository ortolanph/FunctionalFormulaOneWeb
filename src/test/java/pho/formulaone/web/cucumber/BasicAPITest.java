package pho.formulaone.web.cucumber;

import io.cucumber.core.internal.gherkin.deps.com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import pho.formulaone.web.cucumber.requests.APIRequests;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicAPITest {

    @Autowired
    protected APIRequests apiRequests;

    @Autowired
    protected ResponseEntityWrapper responseEntityWrapper;

    @Autowired
    private DataSource datasource;

    @Given("The basics API sample data")
    public void theBasicsAPISampleData() throws SQLException {
        Resource resource = new FileUrlResource(getClass().getResource("/basics.sql"));
        ScriptUtils.executeSqlScript(datasource.getConnection(), resource);
    }

    @When("I want a list of all seasons")
    public void iWantAListOfAllSeasons() {
        responseEntityWrapper.response = apiRequests.allSeasons();
    }

    @When("I want the total of races")
    public void iWantTheTotalOfRaces() {
        responseEntityWrapper.response = apiRequests.totalRaces();
    }

    @When("I want the total races per season")
    public void iWantTheTotalRacesPerSeason() {
        responseEntityWrapper.response = apiRequests.racesPerSeason();
    }

    @When("I want the total racers per season")
    public void iWantTheTotalRacersPerSeason() {
        responseEntityWrapper.response = apiRequests.racersPerSeson();
    }

    @When("I want the total constructors per season")
    public void iWantTheTotalConstructorsPerSeason() {
        responseEntityWrapper.response = apiRequests.constructorsPerSeson();
    }

    @Then("I expect to see the following list")
    public void iExpectToSeeTheFollowingList(List<Double> expected) {
        Gson gson = new Gson();
        String result = responseEntityWrapper.response.getBody();
        List<Double> actual = gson.fromJson(result, List.class);

        assertEquals(expected, actual,"ALL SEASONS");
    }

    @Then("I expect that the total is {int}")
    public void iExpectThatTheTotalIs(int expected) {
        Integer actual = Integer.valueOf(Objects.requireNonNull(responseEntityWrapper.response.getBody()));

        assertEquals(expected, actual, "TOTAL OF RACES");
    }

    @Then("I expect to see the following table")
    public void iExpectToSeeTheFollowingTable(Map<String, Double> expected) {
        Gson gson = new Gson();
        String result = responseEntityWrapper.response.getBody();
        Map<String, Long> actual = gson.fromJson(result, Map.class);

        assertEquals(expected, actual);
    }
}
