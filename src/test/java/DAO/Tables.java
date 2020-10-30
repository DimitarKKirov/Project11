package DAO;

import Driver.MySQLDatabaseDriver;
import Driver.OracleDatabaseDriver;
import POJO.MySQLItems;
import POJO.OracleTables;

import java.util.List;

public class Tables {
    private MySQLDatabaseDriver Driver;
    private OracleDatabaseDriver Driver2;

    public void sqlConnection() {
        Driver.createMySQLConnection();
    }

    public Tables(MySQLDatabaseDriver Driver) {
        this.Driver = Driver;
    }

    public Tables(OracleDatabaseDriver Driver) {
        this.Driver2 = Driver;
    }

    public List<MySQLItems> getAllData() {
        return Driver.getAllData();

    }

    public int getCount() {
        return Driver.getItemsCount();
    }

    public String getItemById(int ID) {
        return Driver.getItemByID(ID);
    }

    public String getItemByName(String name) {
        return Driver.getItemByName(name);
    }

    public int getItemDetailsCount() {
        return Driver.getItemsDetailsCount();
    }

    public int getLoadItemCount() {
        return Driver.getLoadCount();
    }

    public void closeConnectionMy() {
        Driver.closeConnection();
    }

    //------------------------------------Oracle-----------------------------------------------------//

    public void oracleConnection() {
        Driver2.createOracleConnection();
    }

    public List<OracleTables> getAllDataOracle() {
        return Driver2.getAllDataOracle();

    }

    public int getCountOracle() {
        return Driver2.getItemsCount();
    }

    public String getItemByIdOracle(int ID) {
        return Driver2.getItemByID(ID);
    }

    public String getItemByNameOracle(String name) {
        return Driver2.getItemByName(name);
    }

    public int getItemDetailsCountOracle() {
        return Driver2.getItemsDetailsCount();
    }

    public int getLoadItemCountOracle() {
        return Driver2.getLoadCount();
    }

    public void closeConnectionOracle() {
        Driver2.closeConnection();
    }

}
