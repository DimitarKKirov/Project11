package DataBase.Driver;

import java.io.File;

public interface Paths {

    File jsonData= new File("src/main/java/DataBase/CreationOfData/SqlCreationRequests/ItemsFields.json");

    String jsonPath= jsonData.getAbsolutePath();
}
