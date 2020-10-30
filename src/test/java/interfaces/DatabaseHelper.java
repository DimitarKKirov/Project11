package interfaces;

import POJO.MySQLItems;
import POJO.OracleTables;

import java.util.List;

public interface DatabaseHelper {

    List<MySQLItems> getAllData();
    List<OracleTables> getAllDataOracle();
    String getItemByID(int iD);
    int getItemsCount();
    int getItemsDetailsCount();
    int getLoadCount();
    String getItemByName(String name);
//    List<MySQLItems> getAllDataOracle();
//    String getItemByIDOracle(int iD);
//    int getItemsCountOracle();
//    int getItemsDetailsCountOracle();
//    int getLoadCountOracle();
//    String getItemByNameOracle(String name);
}
