package Driver;

public class Master {
    private static Master Master = new Master();
    private MySQLDatabaseDriver Mysql;
    private OracleDatabaseDriver Oracle;


    public static Master getMaster() {
        return Master;
    }

    public MySQLDatabaseDriver MysqlDriver() {
        if (Mysql == null) {
            Mysql = new MySQLDatabaseDriver();
        }
        return Mysql;
    }

    public OracleDatabaseDriver OracleDriver() {
        if (Oracle == null) {
            Oracle = new OracleDatabaseDriver();
        }
        return Oracle;
    }
}
