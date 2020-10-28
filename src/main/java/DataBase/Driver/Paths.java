package DataBase.Driver;

import java.io.File;

public interface Paths {

    File jsonData= new File("src/main/java/DataBase/CreationOfData/SqlCreationRequests/ItemsFields.json");
    File jsonDataOrcl = new File("src/main/java/DataBase/CreationOfData/SqlCreationRequests/ItemsOrcl.json");

    String jsonPath= jsonData.getAbsolutePath();
    String orclPath = jsonDataOrcl.getAbsolutePath();
}
