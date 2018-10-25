package writetocsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Angela Petsuch
 * 
 *
 */
public class WriteToCSV {

    public static void main(String[] args) {
        // fields that make up a record for each user
        String ID = "1234";
        String name = "Bob";
        String age = "22";
        // filepath to store file in project
        String filepath = "cake.txt";
        
        saveRecord(ID, name, age, filepath);

    }
    public static void saveRecord(String ID, String name, String age, String filepath) {
        
        try {
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // write to file in csv format
            pw.println(ID + ", " + name + ", " + age);
            pw.flush();
            pw.close();
            
            System.out.println("Record Saved.");
        } catch (Exception e) {
            System.out.println("Record Not Saved.");
        }
        
    }
}
