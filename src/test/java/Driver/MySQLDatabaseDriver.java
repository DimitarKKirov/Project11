package Driver;

import POJO.*;
import com.sun.xml.internal.bind.v2.model.core.ID;
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
    public Items getItemByID(int iD){
        String sql = getItemByID+iD;
        return Yank.queryBean(sql, Items.class,null);
    }

    @Override
    public ItemsDetails getItemDetailsByID(int ID) {
        String sql = getItemsDetailsByID+ID;
        return Yank.queryBean(sql, ItemsDetails.class,null);
    }

    @Override
    public ItemsLoadingDetails getItemLoadingDetailsByID(int ID) {
        String sql = getLoadItemByID+ID;
        return Yank.queryBean(sql, ItemsLoadingDetails.class,null);

    }

    @Override
    public int getItemsCount() {
        return Yank.queryScalar(getItemsCount,Integer.class,null);
    }

    @Override
    public int getItemsDetailsCount() {
        return Yank.queryScalar(getItemsDetailsCount,Integer.class,null);
    }

    @Override
    public int getLoadCount() {
        return Yank.queryScalar(getLoadItemCount,Integer.class,null);
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
