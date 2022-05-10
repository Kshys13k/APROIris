import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class
 */
public class Main {

    /**
     * prints help
     */
    private static void help(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("README.md"));
            String line ;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Cannot load help");
            e.printStackTrace();
        }
    }


    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        OperationListToTXT txt=new OperationListToTXT();
        DataSetOperations dataSetOperations= new DataSetOperations();
        DataToJSON json=new DataToJSON();
        List<Record> data=new ArrayList<>();

        String command;
        int parameter;
        String parameter2;
        float result;

        System.out.println("Welcome to APROiris, program with helps in analysing irises data set. If you need help type 'help','h' or check out README.txt file:");

        loop: for(;;){
            command=scanner.next();
            switch (command){
                case "help": txt.writeToTXT("Help"); help(); break;
                case "h": help(); break;
                case "load":
                    loadCSV load= new loadCSV();
                    data= load.load();
                    System.out.println("Data set loaded successfully");
                    txt.writeToTXT("Data set loaded successfully");
                    break;
                case "average":
                    parameter= Integer.parseInt(scanner.next());
                    result=dataSetOperations.arithmeticAverage(data, parameter);
                    System.out.println("Average value of column "+parameter+" is: "+result);
                    txt.writeToTXT("Average value of column "+parameter+" is: "+result);
                    break;
                case "averageOf":
                    parameter= Integer.parseInt(scanner.next());
                    parameter2= scanner.next();
                    result=dataSetOperations.arithmeticAverageForGivenSpecies(data,parameter,parameter2);
                    System.out.println("Average of column "+parameter+" for species: "+parameter2+" is: "+result);
                    txt.writeToTXT("Average of column "+parameter+" for species: "+parameter2+" is: "+result);
                    break;
                case "median":
                    parameter= Integer.parseInt(scanner.next());
                    result=dataSetOperations.median(data, parameter);
                    System.out.println("Median of column "+parameter+" is: "+result);
                    txt.writeToTXT("Median of column "+parameter+" is: "+result);
                    break;
                case "medianOf":
                    parameter= Integer.parseInt(scanner.next());
                    parameter2= scanner.next();
                    result=dataSetOperations.medianForGivenSpecies(data,parameter,parameter2);
                    System.out.println("Median of column "+parameter+" for species: "+parameter2+" is: "+result);
                    txt.writeToTXT("Median of column "+parameter+" for species: "+parameter2+" is: "+result);
                    break;
                case "max":
                    parameter= Integer.parseInt(scanner.next());
                    result=dataSetOperations.maxFloat(data, parameter);
                    System.out.println("Max value of column "+parameter+" is: "+result);
                    txt.writeToTXT("Max value of column "+parameter+" is: "+result);
                    break;
                case "maxOf":
                    parameter= Integer.parseInt(scanner.next());
                    parameter2= scanner.next();
                    result=dataSetOperations.maxFloatForGivenSpecies(data,parameter,parameter2);
                    System.out.println("Max value of column "+parameter+" for species: "+parameter2+" is: "+result);
                    txt.writeToTXT("Max value of column "+parameter+" for species: "+parameter2+" is: "+result);
                    break;
                case "min":
                    parameter= Integer.parseInt(scanner.next());
                    result=dataSetOperations.minFloat(data, parameter);
                    System.out.println("Min value of column "+parameter+" is: "+result);
                    txt.writeToTXT("Min value of column "+parameter+" is: "+result);
                    break;
                case "minOf":
                    parameter= Integer.parseInt(scanner.next());
                    parameter2= scanner.next();
                    result=dataSetOperations.minFloatForGivenSpecies(data,parameter,parameter2);
                    System.out.println("Min value of column "+parameter+" for species: "+parameter2+" is: "+result);
                    txt.writeToTXT("Min value of column "+parameter+" for species: "+parameter2+" is: "+result);
                    break;
                case "count":
                    parameter2= scanner.next();
                    result=dataSetOperations.appearancesCounter(data, parameter2);
                    System.out.println("Species: "+parameter2+" have appeared: "+result+" times");
                    txt.writeToTXT("Species: "+parameter2+" have appeared: "+result+" times");
                    break;
                case "print":
                    dataSetOperations.print(data);
                    txt.writeToTXT("Printing data");
                    break;
                case "save":
                    json.saveData(data);
                    txt.writeToTXT("Saving data to JSON");
                    System.out.println("Data set has been saved");
                    break;
                case "exit": break loop;
            }
        }

    }
}
