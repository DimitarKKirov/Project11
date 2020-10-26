package Driver;

import POJO.Items;
import POJO.MySQLItems;
import interfaces.DatabaseHelper;
import org.knowm.yank.Yank;
import sqlRequests.SQLQueries;

import java.util.List;

public class Driver implements SQLQueries, DatabaseHelper {

    @Override
    public List<MySQLItems> getAllDataMySql(){

      return Yank.queryBeanList(getALL, MySQLItems.class,null);

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

}
