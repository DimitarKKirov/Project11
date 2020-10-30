package StepDefinitions;

import DAO.Tables;

import Driver.Master;
import Driver.MySQLDatabaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComparingDBDataSteps {
    private int countSQL;
    private int countORCL;
    private boolean ask;

    @Given("user extracts the data from DB Mysql")
    public void user_extracts_the_data_from_db_mysql() {
        Tables Test = new Tables(Master.getMaster().MysqlDriver());
        Test.sqlConnection();
        int a = Test.getCount();
        int b = Test.getItemDetailsCount();
        int c = Test.getLoadItemCount();
        countSQL = a+b+c;
        Test.closeConnectionMy();
        System.out.println(countSQL);



    }

    @Given("the data from Oracle DB")
    public void the_data_from_oracle_db() {
        Tables TestORCL = new Tables(Master.getMaster().OracleDriver());
        TestORCL.oracleConnection();
        int ab = TestORCL.getCountOracle();
        int bc = TestORCL.getItemDetailsCountOracle();
        int cd = TestORCL.getItemDetailsCountOracle();
        countORCL = ab+bc+cd;
        TestORCL.closeConnectionOracle();
        System.out.println(countORCL);

    }

    @When("the user compares the data")
    public void the_user_compares_the_data() {
        if (countSQL==countORCL){
            ask=true;
        }else {
            ask=false;
        }

    }

    @Then("the data is equal")
    public void the_data_is_equal() {
        Assert.assertTrue(ask);
    }

}
