package cucumber_example1;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = {"classpath:features/vowels-count.feature"},//features is telling you where is the feature file

        glue = {"cucumber_example"})
//is telling us what's the name of the package where the step definitions is located




public class TestRunner {


}
