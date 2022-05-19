package Model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class CSV {
//    private  ArrayList<String[]> rows = new ArrayList<String>();
//    private String[] array =new String[rows.size()];

    private String[] onerow;
    private static  int id =2 ;


    //to create new invoice data
    public static void createinvoice(String path,String[] data) {
        File file = new File(path);
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            writer.writeNext(data);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //update invoice data
 public static void update (String path,int numcol,int numrow,String data) throws IOException, CsvException {

        CSVReader csvreader= new CSVReader(new FileReader(new File(path)));
        List<String[]> newdata =csvreader.readAll();
        newdata.get(numcol)[numrow]=data;
        CSVWriter csvwritter =new CSVWriter(new FileWriter(new File( path )));
        csvwritter.writeAll(newdata);
        csvwritter.flush();
 }
//Read Csv File
    public static String[][] readCSV(String path) throws FileNotFoundException, IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            Collection<String[]> lines = new ArrayList<>();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                lines.add(line.split(";"));

            }
            return lines.toArray(new String[lines.size()][]);
        }
    }

    }








