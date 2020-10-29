package Driver;

import POJO.Items;
import POJO.MySQLItems;
import POJO.OracleTables;
import interfaces.DatabaseHelper;
import org.knowm.yank.Yank;
import sqlRequests.OrcleQueries;
import sqlRequests.SQLQueries;

import java.util.List;

public class DatabaseDriver implements SQLQueries, OrcleQueries, DatabaseHelper {

    /*
    Излишен клас, Янк работи като му се подава класа който репрезентира редът от таблицата и sql запитването
    тоест в основният драйвер клас (демек този) трябва да се имплементнат и методите и за двете Бази,
    от там следва, че класовете които наследяват този клас използват методите чрес Super, от там следва, че или трябва да
    имаме 2 ДАО класа за всяка база като съответният ДАО клас използва съответният наследник на DatabaseDriver класа или
    да имаме два класа Driver за съотвентата база които имплементират интерфейсите DataBaseHelper и съответният
    интерфейс със запитванията към съотеветната база.Проблемът идва от там, че в 1 DAO клас който има методите за
    манипулациа и комуникация на базата (а тези методи изпозлват методите от съответния подаден SQL или Oracle Driver) не може
    да съествуват методите за двата вида драйвери едновременно.

    Най добрият вариант според мен е -> да има само два драйвер класа с едни и същи методи които съответно
    наследяват два интерфейса : DatabaseHelper и интерфейса за съответните sql заявки
    и методите в ДАО-то да са едни и същи като име и съответно екзекуция в тялото на метода
     */


    @Override
    public List<MySQLItems> getAllDataMySql(){

      return Yank.queryBeanList(getALL, MySQLItems.class,null);

    }
    @Override
    public String getItemByIDMySql(int iD){
        String sql = getItemByID+iD;
       return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCountMySql() {
        return Yank.executeSQLKey(getItemsCount,null);
    }

    @Override
    public int getItemsDetailsCountMySql() {
         return Yank.executeSQLKey(getItemsDetailsCount,null);
    }

    @Override
    public int getLoadCountMySql() {
        return Yank.executeSQLKey(getLoadItemCount,null);
    }

    @Override
    public String getItemByNameMySql(String name) {
        String sql = getItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    //Oracle

    @Override
    public List<MySQLItems> getAllDataOracle() {
        return Yank.queryBeanList(orcleGetALL, MySQLItems.class,null);
    }

    @Override
    public String getItemByIDOracle(int iD) {
        String sql = orcleGetItemByID+iD;
        return Yank.queryBean(sql, Items.class,null).toString();
    }

    @Override
    public int getItemsCountOracle() {
        return Yank.executeSQLKey(orcleGetItemsCount,null);
    }

    @Override
    public int getItemsDetailsCountOracle() {
        return Yank.executeSQLKey(orcleGetItemsDetailsCount,null);
    }

    @Override
    public int getLoadCountOracle() {
        return Yank.executeSQLKey(orcleGetLoadItemCount,null);
    }

    @Override
    public String getItemByNameOracle(String name) {
        String sql = orcleGetItemByNames+name;
        return Yank.queryBean(sql, Items.class,null).toString();
    }


}
