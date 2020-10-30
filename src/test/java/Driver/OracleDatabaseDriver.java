package Driver;

import POJO.*;
import org.knowm.yank.Yank;
import sqlRequests.OrcleQueries;

import java.util.List;

public class OracleDatabaseDriver extends DatabaseDriver implements OrcleQueries {


    @Override
    public List<OracleTables> getAllDataOracle() {
        return Yank.queryBeanList(orcleGetALL, OracleTables.class, null);
    }

    @Override
    public Items getItemByID(int iD) {
        String sql = orcleGetItemByID + iD;
        return Yank.queryBean(sql, Items.class, null);

    }

    @Override
    public ItemsDetails getItemDetailsByID(int ID) {
        String sql = orcleGetItemsDetailsByID + ID;
        return Yank.queryBean(sql, ItemsDetails.class, null);
    }

    @Override
    public ItemsLoadingDetails getItemLoadingDetailsByID(int ID) {
        String sql = orcleGetLoadItemByID + ID;
        return Yank.queryBean(sql, ItemsLoadingDetails.class, null);
    }

    @Override
    public int getItemsCount() {
        return Yank.queryScalar(orcleGetItemsCount, Integer.class, null);
    }

    @Override
    public int getItemsDetailsCount() {
        return Yank.queryScalar(orcleGetItemsDetailsCount, Integer.class, null);
    }

    @Override
    public int getLoadCount() {
        return Yank.queryScalar(orcleGetLoadItemCount, Integer.class, null);
    }

    @Override
    public void createOracleConnection() {
        super.createOracleConnection();
    }

    @Override
    public void closeConnection() {
        super.closeConnection();
    }

    @Override
    public String getItemByName(String name) {
        String sql = orcleGetItemByNames + name;
        return Yank.queryBean(sql, Items.class, null).toString();
    }
}
