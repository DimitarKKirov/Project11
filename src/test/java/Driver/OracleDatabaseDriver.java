package Driver;

import POJO.MySQLItems;

import java.util.List;

public class OracleDatabaseDriver extends DatabaseDriver {

    @Override
    public List<MySQLItems> getAllDataMySql() {
        return super.getAllDataMySql();
    }

    @Override
    public String getItemByID(int iD) {
        return super.getItemByID(iD);
    }

    @Override
    public int getItemsCount() {
        return super.getItemsCount();
    }

    @Override
    public int getItemsDetailsCount() {
        return super.getItemsDetailsCount();
    }

    @Override
    public int getLoadCount() {
        return super.getLoadCount();
    }

    @Override
    public String getItemByName(String name) {
        return super.getItemByName(name);
    }
}
