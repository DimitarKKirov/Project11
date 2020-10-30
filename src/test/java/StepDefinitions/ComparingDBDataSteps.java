package StepDefinitions;

import DAO.Tables;

import Driver.Master;
import Driver.MySQLDatabaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComparingDBDataSteps {

    @Given("user extracts the data from DB Mysql")
    public void user_extracts_the_data_from_db_mysql() {
        Tables Test = new Tables(Master.getMaster().MysqlDriver());



    }

    @Given("the data from Oracle DB")
    public void the_data_from_oracle_db() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user compares the data")
    public void the_user_compares_the_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the data is equal")
    public void the_data_is_equal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
