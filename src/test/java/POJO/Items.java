package POJO;


import DataBase.Driver.Paths;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Items implements Paths {

    private String itemsSerialNumber;
    private String itemName;


    public String getItemsSerialNumber() {
        return itemsSerialNumber;
    }

    public void setItemsSerialNumber(String itemsSerialNumber) {
        this.itemsSerialNumber = itemsSerialNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Items(){}
    public Items(String itemsSerialNumber, String itemName) {
        this.itemsSerialNumber = itemsSerialNumber;
        this.itemName = itemName;
    }

    void  itemsFields() {
        JSONParser reader = new JSONParser();
        try {
            FileReader fileReader = new FileReader(jsonPath);
            Object temp = reader.parse(fileReader);
            JSONArray jsTemp = (JSONArray) temp;
            for (Object o : jsTemp) {
                JSONObject tempJson = (JSONObject) o;
                if (tempJson.containsKey("ItemName")) {
                    String name = tempJson.get("ItemName").toString();
                    setItemName(name);
                    System.out.println(name);
                }
                if (tempJson.containsKey("ItemSerialNumber")) {
                    String serial = tempJson.get("ItemSerialNumber").toString();

                    setItemsSerialNumber(serial);
                    System.out.println(serial);
                }
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Items items = new Items();
        items.itemsFields();
    }
}
