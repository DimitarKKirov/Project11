package interfaces;

import POJO.MySQLItems;

import java.util.List;

public interface DatabaseHelper {

    List<MySQLItems> getAllDataMySql();
    String getItemByID(int iD);
    int getItemsCount();
    int getItemsDetailsCount();
    int getLoadCount();
    String getItemByName(String name);
}
