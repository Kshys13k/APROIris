import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperationListToTXT {
    public void writeToTXT(String text){
        File file = new File("src/main/java/operations.txt");
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error. Cannot write to file.");
        }
    }
}
