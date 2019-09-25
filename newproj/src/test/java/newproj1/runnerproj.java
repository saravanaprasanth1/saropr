package newproj1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
		          "json:src/test/java/newproj/pp.json"})
public class runnerproj {

}
