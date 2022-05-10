//package com.company;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//
//public class DataToJSON {
//    public void saveData(List<Record>data){
//        for(int i=0;i<data.size();i++){
//            Gson gson= new GsonBuilder().setPrettyPrinting().create();
//            File file = new File("src/main/java/operations.txt");
//            try {
//                gson.toJson(data,file);
//            } catch (IOException ex) {
//                System.out.println("Error. Cannot write to file.");
//            }
//        }
//    }
//}
