package Driver;

import POJO.Items;
import POJO.MySQLItems;
import POJO.OracleTables;
import interfaces.DatabaseHelper;
import org.knowm.yank.Yank;
import sqlRequests.OrcleQueries;
import sqlRequests.SQLQueries;

import java.util.List;

public class DatabaseDriver implements SQLQueries, OrcleQueries, DatabaseHelper {

    @Override
    public List<MySQLItems> getAllDataMySql(){

      return Yank.queryBeanList(getALL, MySQLItems.class,null);

    }
    @Override
    public String getItemByIDMySql(int iD){
        String sql = getItemByID+iD;
       return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCountMySql() {
        return Yank.executeSQLKey(getItemsCount,null);
    }

    @Override
    public int getItemsDetailsCountMySql() {
         return Yank.executeSQLKey(getItemsDetailsCount,null);
    }

    @Override
    public int getLoadCountMySql() {
        return Yank.executeSQLKey(getLoadItemCount,null);
    }

    @Override
    public String getItemByNameMySql(String name) {
        String sql = getItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    //Oracle

    @Override
    public List<MySQLItems> getAllDataOracle() {
        return Yank.queryBeanList(orcleGetALL, MySQLItems.class,null);
    }

    @Override
    public String getItemByIDOracle(int iD) {
        String sql = orcleGetItemByID+iD;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCountOracle() {
        return Yank.executeSQLKey(orcleGetItemsCount,null);
    }

    @Override
    public int getItemsDetailsCountOracle() {
        return Yank.executeSQLKey(orcleGetItemsDetailsCount,null);
    }

    @Override
    public int getLoadCountOracle() {
        return Yank.executeSQLKey(orcleGetLoadItemCount,null);
    }

    @Override
    public String getItemByNameOracle(String name) {
        String sql = orcleGetItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }


}
