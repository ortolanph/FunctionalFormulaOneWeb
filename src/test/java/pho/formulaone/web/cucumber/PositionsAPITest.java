package pho.formulaone.web.cucumber;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import pho.formulaone.web.beans.RaceResult;
import pho.formulaone.web.cucumber.requests.APIRequests;

import javax.sql.DataSource;
import javax.swing.text.StyledEditorKit;
import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionsAPITest {

    @Autowired
    protected APIRequests apiRequests;

    @Autowired
    protected ResponseEntityWrapper responseEntityWrapper;

    @Autowired
    private DataSource datasource;

    @Given("The positions API sample data")
    public void thePositionsAPISampleData() throws SQLException {
        Resource resource = new FileUrlResource(getClass().getResource("/positions.sql"));
        ScriptUtils.executeSqlScript(datasource.getConnection(), resource);
    }

    @When("I want the starting grid of the season {int} round {int}")
    public void iWantTheStartingGridOfTheSeasonRound(Integer season, Integer round) {
        responseEntityWrapper.response = apiRequests.grid(season, round);
    }

    @When("I want the podium grid of the season {int} round {int}")
    public void iWantThePodiumGridOfTheSeasonRound(Integer season, Integer round) {
        responseEntityWrapper.response = apiRequests.podium(season, round);
    }

    @When("I want the winner of the season {int} round {int}")
    public void iWantTheWinnerOfTheSeasonRound(Integer season, Integer round) {
        responseEntityWrapper.response = apiRequests.winner(season, round);
    }

    @When("I want the pole position of the season {int} round {int}")
    public void iWantThePolePositionOfTheSeasonRound(Integer season, Integer round) {
        responseEntityWrapper.response = apiRequests.poleposition(season, round);
    }

    @When("I want to check if the season {int} round {int} had an end to end victory")
    public void iWantToCheckIfTheSeasonRoundHadAnEndToEndVictory(Integer season, Integer round) {
        responseEntityWrapper.response = apiRequests.endToEndChecker(season, round);
    }

    @When("I want to get all the end to end victories of season {int}")
    public void iWantToGetAllTheEndToEndVictoriesOfSeason(Integer season) {
        responseEntityWrapper.response = apiRequests.endToEndSeason(season);
    }

    /*
    @When("I want to get all the end to end victories of all time")
    public void iWantToGetAllTheEndToEndVictoriesOfAllTime() {
    }
    */

    @Then("I expect to see the following pilot table")
    public void iExpectToSeeTheFollowingPilotTable(List<RaceResult> expected) {
        Gson gson = new Gson();
        String result = responseEntityWrapper.response.getBody();
        List<RaceResult> actual = gson.fromJson(result, new TypeToken<List<RaceResult>>(){}.getType());

        assertEquals(expected, actual,"GRID OR PODIUM");
    }

    @Then("I expect that the pilot is {string} and the race is {string}")
    public void iExpectThatThePilotIsAndTheRaceIs(String pilot, String race) {
        Gson gson = new Gson();
        String result = responseEntityWrapper.response.getBody();
        RaceResult actual = gson.fromJson(result, RaceResult.class);

        assertEquals(pilot, actual.getPilot(),"WINNER OR POLE: name");
        assertEquals(race, actual.getRace(),"WINNER OR POLE: race");
    }

    @Then("I expect that this race had an end to end victory")
    public void iExpectThatThisRaceHadAnEndToEndVictory() {
        String result = responseEntityWrapper.response.getBody();
        boolean endToEnd = Boolean.getBoolean(result);
        assertTrue("End to End checker: End to End", endToEnd);
    }

    @Then("I expect that this race did not have an end to end victory")
    public void iExpectThatThisRaceDidNotHaveAnEndToEndVictory() {
        String result = responseEntityWrapper.response.getBody();
        boolean notEndToEnd = Boolean.getBoolean(result);
        assertFalse("End to End checker: Not End to End", notEndToEnd);
    }

}
