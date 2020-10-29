package Driver;

import POJO.MySQLItems;

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
}
