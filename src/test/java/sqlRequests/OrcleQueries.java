package sqlRequests;

public interface OrcleQueries {
    String orcleGetALL=" select * from testdatamysql.items ,testdatamysql.itemsdetails ,testdatamysql.itemsloadingdetails ";
    String orcleGetItemByID = "select ItemSerialNumber, ItemName from ITEMS where ITEM_ID = ";
    String orcleGetItemsDetailsByID = "select itemID from ItemsDetails where itemID = ";
    String orcleGetLoadItemByID = "select itemID from itemsloadingdetails where itemID =";
    String orcleGetItemByNames = "select from items where ItemName=";
    String orcleGetItemsCount = "select count(*) from ITEMS";
    String orcleGetItemsDetailsCount="select count(*) from ItemsDetails";
    String orcleGetLoadItemCount = "select count(*) from itemsloadingdetails";
}
