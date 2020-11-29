package pho.formulaone.web.cucumber;

import io.cucumber.core.internal.gherkin.deps.com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.ClassRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import pho.formulaone.web.FunctionalFormulaOneWebApplication;
import pho.formulaone.web.annotation.BehaviourTest;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = FunctionalFormulaOneWebApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@BehaviourTest
@ContextConfiguration(initializers = {BasicAPITest.Initializer.class})
public class BasicAPITest {

    @ClassRule
    public static JdbcDatabaseContainer postgreSQLContainer = new PostgreSQLContainer("postgres:latest").withInitScript("basics.sql");

    static class Initializer
            implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            postgreSQLContainer.start();
            TestPropertyValues.of(
                    "spring.datasource.url="+postgreSQLContainer.getJdbcUrl()
            ).applyTo(configurableApplicationContext.getEnvironment());
        }
    }

    @Autowired
    protected BasicAPIRequests basicAPIRequests;

    @Autowired
    protected ResponseEntityWrapper responseEntityWrapper;

    @When("I want a list of all seasons")
    public void iWantAListOfAllSeasons() {
        responseEntityWrapper.response = basicAPIRequests.allSeasons();
    }

    @When("I want the total of races")
    public void iWantTheTotalOfRaces() {
        responseEntityWrapper.response = basicAPIRequests.totalRaces();
    }

    @When("I want the total races per season")
    public void iWantTheTotalRacesPerSeason() {
        responseEntityWrapper.response = basicAPIRequests.racesPerSeason();
    }

    @When("I want the total racers per season")
    public void iWantTheTotalRacersPerSeason() {
        responseEntityWrapper.response = basicAPIRequests.racersPerSeson();
    }

    @When("I want the total constructors per season")
    public void iWantTheTotalConstructorsPerSeason() {
        responseEntityWrapper.response = basicAPIRequests.constructorsPerSeson();
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
