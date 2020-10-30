package Driver;

import POJO.Items;
import POJO.MySQLItems;
import POJO.OracleTables;
import org.knowm.yank.Yank;
import sqlRequests.OrcleQueries;

import java.util.List;

public class OracleDatabaseDriver extends DatabaseDriver implements OrcleQueries {


    @Override
    public List<OracleTables> getAllDataOracle() {
        return Yank.queryBeanList(orcleGetALL, OracleTables.class,null);
    }

    @Override
    public String getItemByID(int iD) {
        String sql = orcleGetItemByID+iD;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCount() {
        return Yank.executeSQLKey(orcleGetItemsCount,null);
    }

    @Override
    public int getItemsDetailsCount() {
        return Yank.executeSQLKey(orcleGetItemsDetailsCount,null);
    }

    @Override
    public int getLoadCount() {
        return Yank.executeSQLKey(orcleGetLoadItemCount,null);
    }

    @Override
    public void createOracleConnection() {
        super.createOracleConnection();
    }

    @Override
    public void closeConnection() {
        super.closeConnection();
    }

    @Override
    public String getItemByName(String name) {
        String sql = orcleGetItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }
}
