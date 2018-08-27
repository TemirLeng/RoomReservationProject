package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class SPA1768_steps {
    @Given("user signs in")
    public void user_signs_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should be able to see links:")
    public void user_should_be_able_to_see_links(List<String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }
}
