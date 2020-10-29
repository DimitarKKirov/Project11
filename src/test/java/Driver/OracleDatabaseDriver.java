package Driver;

import POJO.MySQLItems;

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
}
