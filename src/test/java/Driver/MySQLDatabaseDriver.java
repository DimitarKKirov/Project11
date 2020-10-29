package Driver;

import POJO.Items;
import POJO.MySQLItems;
import org.knowm.yank.Yank;

import java.util.List;

public class MySQLDatabaseDriver extends DatabaseDriver {

    @Override
    public List<MySQLItems> getAllDataMySql() {
        return super.getAllDataMySql();
    }

    @Override
    public String getItemByIDMySql(int iD) {
        return super.getItemByIDMySql(iD);
    }

    @Override
    public int getItemsCountMySql() {
        return super.getItemsCountMySql();
    }

    @Override
    public int getItemsDetailsCountMySql() {
        return super.getItemsDetailsCountMySql();
    }

    @Override
    public int getLoadCountMySql() {
        return super.getLoadCountMySql();
    }

    @Override
    public String getItemByNameMySql(String name) {
        return super.getItemByNameMySql(name);
    }




//    @Override
//    public List<MySQLItems> getAllDataMySql(){
//
//        return Yank.queryBeanList(getALL, MySQLItems.class,null);
//
//    }
//    @Override
//    public String getItemByIDMySql(int iD){
//        String sql = getItemByID+iD;
//        return Yank.queryBean(sql, Items.class,null).toString();
//    }
//
//    @Override
//    public int getItemsCountMySql() {
//        return Yank.executeSQLKey(getItemsCount,null);
//    }
//
//    @Override
//    public int getItemsDetailsCountMySql() {
//        return Yank.executeSQLKey(getItemsDetailsCount,null);
//    }
//
//    @Override
//    public int getLoadCountMySql() {
//        return Yank.executeSQLKey(getLoadItemCount,null);
//    }
//
//    @Override
//    public String getItemByNameMySql(String name) {
//        String sql = getItemByNames+name;
//        return Yank.queryBean(sql, Items.class,null).toString();
//    }

}
