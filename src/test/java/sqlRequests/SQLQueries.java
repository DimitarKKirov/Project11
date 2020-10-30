package sqlRequests;

public interface SQLQueries {
    String getALL=" select * from testdatamysql.items ,testdatamysql.itemsdetails ,testdatamysql.itemsloadingdetails ";
    String getItemByID = "select from items where itemID =";
    String getItemByNames = "select from items where ItemName=";
    String getItemsCount = "select count(*) from Items;";
    String getItemsDetailsCount="select count(*) from ItemsDetails";
    String getLoadItemCount = "select count(*) from itemsloadingdetails";



}
