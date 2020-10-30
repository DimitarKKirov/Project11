package StepDefinitions;

import DAO.TablesMysql;
import DAO.TablesOracle;
import Driver.Master;
import POJO.Items;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Random;

public class ComparingDataRowsSteps {

    ArrayList<Items> myDB = new ArrayList<>();
    boolean asd;
    ArrayList<Items> oracleDBO = new ArrayList<>();

    @Given("user extracts data from {int} of MySql Database")
    public void extractingDataFromMySQLDB(int idMysql) {
        Random random = new Random();
        TablesMysql mySQLDB = new TablesMysql(Master.getMaster().MysqlDriver());
        mySQLDB.sqlConnection();
            myDB.add(mySQLDB.getItemById(idMysql));

        System.out.println(myDB.size());
        mySQLDB.closeConnectionMy();
    }

    @Given("{int} from Oracle Database")
    public void extractingDataFromOracleDB(int idOracle) {
        Random random = new Random();
        TablesOracle oracleDB = new TablesOracle(Master.getMaster().OracleDriver());
        oracleDB.oracleConnection();
            oracleDBO.add(oracleDB.getItemByIdOracle(idOracle));
        System.out.println(oracleDBO.size());
        oracleDB.closeConnectionOracle();
    }


    @Then("the user compares the rows data and its the same")
    public void comparingListsWithData() {
        int i = 0;
            Assert.assertEquals(oracleDBO.get(i).getItemName(), myDB.get(i).getItemName());
            Assert.assertEquals(oracleDBO.get(i).getItemSerialNumber(),myDB.get(i).getItemSerialNumber());

        asd= true;


    }


}
