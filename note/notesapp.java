import java.io.*;
import java.util.Scanner;

public class notesapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "note.txt"; // file name to save note

        System.out.println("Please write a note:"); // ask user
        String note = sc.nextLine(); // read note from user

        // writing the note to the file
        try {
            FileWriter filewriter = new FileWriter(filename); // open file
            filewriter.write(note); // write note
            filewriter.close(); // close file
            System.out.println("Note saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        // reading the note from the file
        try {
            FileReader filereader = new FileReader(filename); // open file
            BufferedReader bufferedreader = new BufferedReader(filereader); // wrap reader

            System.out.println("\nReading note from file:");
            String line;
            while ((line = bufferedreader.readLine()) != null) {
                System.out.println(line); // print each line
            }

            bufferedreader.close(); // close reader
            filereader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }

        sc.close(); // close scanner
    }
}
