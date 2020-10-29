package interfaces;

import POJO.MySQLItems;

import java.util.List;

public interface DatabaseHelper {

    List<MySQLItems> getAllDataMySql();
    String getItemByIDMySql(int iD);
    int getItemsCountMySql();
    int getItemsDetailsCountMySql();
    int getLoadCountMySql();
    String getItemByNameMySql(String name);

    List<MySQLItems> getAllDataOracle();
    String getItemByIDOracle(int iD);
    int getItemsCountOracle();
    int getItemsDetailsCountOracle();
    int getLoadCountOracle();
    String getItemByNameOracle(String name);
}
