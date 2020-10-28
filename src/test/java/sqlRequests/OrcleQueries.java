package sqlRequests;

public interface OrcleQueries {
    String orcleGetALL=" select * from testdatamysql.items ,testdatamysql.itemsdetails ,testdatamysql.itemsloadingdetails ";
    String orcleGetItemByID = "select from items where itemID =";
    String orcleGetItemByNames = "select from items where ItemName=";
    String orcleGetItemsCount = "select count(*) from Items";
    String orcleGetItemsDetailsCount="select count(*) from ItemsDetails";
    String orcleGetLoadItemCount = "select count(*) from itemsloadingdetails";
}
