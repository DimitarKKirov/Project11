package Driver;

import POJO.Items;
import POJO.MySQLItems;
import POJO.OracleTables;
import org.knowm.yank.Yank;
import sqlRequests.SQLQueries;

import java.util.List;

public class MySQLDatabaseDriver extends DatabaseDriver implements SQLQueries {



    @Override
    public List<MySQLItems> getAllData(){

        return Yank.queryBeanList(getALL, MySQLItems.class,null);

    }

    @Override
    public List<OracleTables> getAllDataOracle() {
        return null;
    }

    @Override
    public String getItemByID(int iD){
        String sql = getItemByID+iD;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCount() {
        return Yank.executeSQLKey(getItemsCount,null);
    }

    @Override
    public int getItemsDetailsCount() {
        return Yank.executeSQLKey(getItemsDetailsCount,null);
    }

    @Override
    public int getLoadCount() {
        return Yank.executeSQLKey(getLoadItemCount,null);
    }

    @Override
    public String getItemByName(String name) {
        String sql = getItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public void createMySQLConnection() {
        super.createMySQLConnection();
    }

    @Override
    public void closeConnection() {
        super.closeConnection();
    }
}
