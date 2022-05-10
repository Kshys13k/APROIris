import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Loading data set from CSV file
 */
public class loadCSV {

    /**
     * converts string from CSV file to data set format used by this program
     * @param string
     * @return
     */
    private List<Record> converter(String string){
        List<Record> list=new ArrayList();
        String[]rows=string.split("N");
        for(String row:rows){
            if(row.equals("Id,SepalLengthCm,SepalWidthCm,PetalLengthCm,PetalWidthCm,Species")) continue;
            String[] cells=row.split(",");
            try{
                Record r= new Record(Integer.parseInt(cells[0]),Float.parseFloat(cells[1]),Float.parseFloat(cells[2]),Float.parseFloat(cells[3]),Float.parseFloat(cells[4]),cells[5]);
                list.add(r);
            }catch (Exception r){
                System.out.println("Incorrect data format");
                break;
            }
        }
        return list;
    }

    /**
     * Loading data set from CSV file
     * @return
     */
    public List<Record> load(){
        StringBuilder resultString = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/Iris.csv"));
            String line ;
            while ((line = br.readLine()) != null){
                resultString.append(line);
                resultString.append("N");
            }
        } catch (IOException e) {
            System.out.println("Cannot load file 'iris.csv'");
            e.printStackTrace();
        }
        resultString = new StringBuilder(resultString.substring(0, resultString.length() - 1));

        return converter(resultString.toString());
    }

}
