package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @autor: Boris.Perez
 **/

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/createItemsBasic.feature",
                "src/test/resources/createItemsToken.feature",
                "src/test/resources/createProjectToken.feature",
                "src/test/resources/createUser.feature",
                "src/test/resources/createProjectBasic.feature"}
)
public class Runner {

}
