package pho.formulaone.web.cucumber;

import io.cucumber.java.DataTableType;
import org.junit.ClassRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import pho.formulaone.web.FunctionalFormulaOneWebApplication;
import pho.formulaone.web.annotation.BehaviourTest;
import pho.formulaone.web.beans.RaceResult;

import java.util.Map;

@SpringBootTest(
        classes = FunctionalFormulaOneWebApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@BehaviourTest
@ContextConfiguration(initializers = {CommonDefinitions.Initializer.class})
public class CommonDefinitions {

    @ClassRule
    public static JdbcDatabaseContainer postgreSQLContainer = new PostgreSQLContainer("postgres:latest").withInitScript("common.sql");

    static class Initializer
            implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            postgreSQLContainer.start();
            TestPropertyValues.of(
                    "spring.datasource.url="+postgreSQLContainer.getJdbcUrl()
            ).applyTo(configurableApplicationContext.getEnvironment());
        }
    }

    @DataTableType
    public RaceResult raceResult(Map<String, String> result) {
        return RaceResult
                .builder()
                .pilot(result.get("pilot"))
                .number(Integer.parseInt(result.get("number")))
                .grid(Integer.parseInt(result.get("grid")))
                .podium(Integer.parseInt(result.get("podium")))
                .season(Integer.parseInt(result.get("season")))
                .round(Integer.parseInt(result.get("round")))
                .race(result.get("race"))
                .circuit(result.get("circuit"))
                .build();
    }
}
