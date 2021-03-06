package DAO;

import Driver.MySQLDatabaseDriver;
import Driver.OracleDatabaseDriver;
import POJO.*;

import java.security.PublicKey;
import java.util.List;

public class TablesMysql {
    private MySQLDatabaseDriver Driver;

    public void sqlConnection() {
        Driver.createMySQLConnection();
    }

    public TablesMysql(MySQLDatabaseDriver Driver) {
        this.Driver = Driver;
    }

    public List<MySQLItems> getAllData() {
        return Driver.getAllData();
    }

    public int getCount() {
        return Driver.getItemsCount();
    }

    public Items getItemById(int iD) {
        return Driver.getItemByID(iD);
    }

    public ItemsDetails getItemDetailsByID(int ID) {
        return Driver.getItemDetailsByID(ID);
    }

    public ItemsLoadingDetails getItemLoadingDetailsByID(int ID) {
        return Driver.getItemLoadingDetailsByID(ID);
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
}
