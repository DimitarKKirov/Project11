package DAO;

import Driver.OracleDatabaseDriver;
import POJO.Items;
import POJO.ItemsDetails;
import POJO.ItemsLoadingDetails;
import POJO.OracleTables;

import java.util.List;

public class TablesOracle {

    private OracleDatabaseDriver Driver;
    public TablesOracle(OracleDatabaseDriver Driver) {
        this.Driver = Driver;
    }

    public void oracleConnection() {
        Driver.createOracleConnection();
    }

    public List<OracleTables> getAllDataOracle() {
        return Driver.getAllDataOracle();
    }

    public int getCountOracle() {
        return Driver.getItemsCount();
    }

    public Items getItemByIdOracle(int iD) {
        return Driver.getItemByID(iD);
    }
    public ItemsDetails getItemDetailsOracleByID(int ID){
        return Driver.getItemDetailsByID(ID);
    }
    public ItemsLoadingDetails getItemLoadingDetailsOracleByID(int ID){
        return Driver.getItemLoadingDetailsByID(ID);
    }

    public String getItemByNameOracle(String name) {
        return Driver.getItemByName(name);
    }

    public int getItemDetailsCountOracle() {
        return Driver.getItemsDetailsCount();
    }

    public int getLoadItemCountOracle() {
        return Driver.getLoadCount();
    }

    public void closeConnectionOracle() {
        Driver.closeConnection();
    }

}
