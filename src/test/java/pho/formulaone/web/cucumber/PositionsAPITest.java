package pho.formulaone.web.cucumber;

import io.cucumber.core.internal.gherkin.deps.com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.cucumber.requests.APIRequests;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionsAPITest {

    @Autowired
    protected APIRequests apiRequests;

    @Autowired
    protected ResponseEntityWrapper responseEntityWrapper;

    @Given("The positions API sample data")
    public void thePositionsAPISampleData() {}

    @When("I want the starting grid of the season {int} round {int}")
    public void iWantTheStartingGridOfTheSeasonRound(int season, int round) {
        responseEntityWrapper.response = apiRequests.grid(season, round);
    }

/*    @When("I want the podium grid of the season {int} round {int}")
    public void iWantThePodiumGridOfTheSeasonRound(int season, int round) {
    }

    @When("I want the winner of the season {int} round {int}")
    public void iWantTheWinnerOfTheSeasonRound(int season, int round) {
    }

    @When("I want the pole position of the season {int} round {int}")
    public void iWantThePolePositionOfTheSeasonRound(int season, int round) {
    }

    @When("I want to check if the season {int} round {int} had an end to end victory")
    public void iWantToCheckIfTheSeasonRoundHadAnEndToEndVictory(int season, int round) {
    }

    @When("I want to get all the end to end victories of season {int}")
    public void iWantToGetAllTheEndToEndVictoriesOfSeason(int season) {
    }

    @When("I want to get all the end to end victories of all time")
    public void iWantToGetAllTheEndToEndVictoriesOfAllTime() {
    }*/

    @Then("I expect to see the following pilot table")
    public void iExpectToSeeTheFollowingPilotTable(List<RaceResult> expected) {
        Gson gson = new Gson();
        String result = responseEntityWrapper.response.getBody();
        List<RaceResult> actual = gson.fromJson(result, List.class);

        assertEquals(expected, actual,"GRID");
    }

/*    @Then("I expect that this race had an end to end victory")
    public void iExpectThatThisRaceHadAnEndToEndVictory() {
    }

    @Then("I expect that this race did not have an end to end victory")
    public void iExpectThatThisRaceDidNotHaveAnEndToEndVictory() {
    }*/
}
