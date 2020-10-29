package Driver;

import POJO.Items;
import POJO.MySQLItems;
import org.knowm.yank.Yank;

import java.util.List;

public class OracleDatabaseDriver extends DatabaseDriver {

    @Override
    public List<MySQLItems> getAllDataOracle() {
        return super.getAllDataMySql();
    }

    @Override
    public String getItemByIDOracle(int iD) {
        return super.getItemByIDOracle(iD);
    }

    @Override
    public int getItemsCountOracle() {
        return super.getItemsCountOracle();
    }

    @Override
    public int getItemsDetailsCountOracle() {
        return super.getItemsDetailsCountOracle();
    }

    @Override
    public int getLoadCountOracle() {
        return super.getLoadCountOracle();
    }

    @Override
    public String getItemByNameOracle(String name) {
        return super.getItemByNameOracle(name);
    }




//    @Override
//    public List<MySQLItems> getAllDataOracle() {
//        return Yank.queryBeanList(orcleGetALL, MySQLItems.class,null);
//    }
//
//    @Override
//    public String getItemByIDOracle(int iD) {
//        String sql = orcleGetItemByID+iD;
//        return Yank.queryBean(sql, Items.class,null).toString();
//    }
//
//    @Override
//    public int getItemsCountOracle() {
//        return Yank.executeSQLKey(orcleGetItemsCount,null);
//    }
//
//    @Override
//    public int getItemsDetailsCountOracle() {
//        return Yank.executeSQLKey(orcleGetItemsDetailsCount,null);
//    }
//
//    @Override
//    public int getLoadCountOracle() {
//        return Yank.executeSQLKey(orcleGetLoadItemCount,null);
//    }
//
//    @Override
//    public String getItemByNameOracle(String name) {
//        String sql = orcleGetItemByNames+name;
//        return Yank.queryBean(sql, Items.class,null).toString();
//    }
}
