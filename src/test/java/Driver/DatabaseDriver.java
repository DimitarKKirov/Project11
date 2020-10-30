package Driver;

import POJO.Items;
import POJO.MySQLItems;
import POJO.OracleTables;
import interfaces.DatabaseHelper;
import org.knowm.yank.PropertiesUtils;
import org.knowm.yank.Yank;
import sqlRequests.OrcleQueries;
import sqlRequests.SQLQueries;

import java.util.List;
import java.util.Properties;

public  abstract class DatabaseDriver implements DatabaseHelper {

    private Properties MySQLConnection = PropertiesUtils.getPropertiesFromPath("./src/main/java/DataBase/Driver/Connections.properties");
    private Properties oracleConnection = PropertiesUtils.getPropertiesFromPath("./src/main/java/DataBase/Driver/OraclConnection.properties");



    @Override
    public List<MySQLItems> getAllData(){
        return null;
    }

    @Override
    public String getItemByID(int iD) {
        return null;
    }

    @Override
    public int getItemsCount() {
        return 0;
    }

    @Override
    public int getItemsDetailsCount() {
        return 0;
    }

    @Override
    public int getLoadCount() {
        return 0;
    }

    @Override
    public String getItemByName(String name) {
        return null;
    }
    public void createMySQLConnection() {
        Yank.setupDefaultConnectionPool(MySQLConnection);

    }
    public void createOracleConnection() {
        Yank.setupDefaultConnectionPool(oracleConnection);

    }
    public void closeConnection(){
        Yank.releaseAllConnectionPools();
    }
}
