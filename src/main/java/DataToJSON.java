import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Saving data set to Iris.json
 */
public class DataToJSON {
    /**
     * Saving data to json file
     * @param data
     */
    public void saveData(List<Record>data){
        Gson gson= new Gson();
        String json="[";
        for(int i=0;i<data.size();i++){
            json=json+gson.toJson(data.get(i))+",\n";
        }
        json=json.substring(0,json.length()-2);
        json=json+"]";
        Path path = Paths.get("src/main/java/Iris.json");
        try {

            Files.writeString(path, json);
        } catch (IOException ex) {
            System.out.println("Error. Cannot write to file.");
        }
    }
}
