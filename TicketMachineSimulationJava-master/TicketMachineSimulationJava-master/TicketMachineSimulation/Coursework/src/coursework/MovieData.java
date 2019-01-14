package coursework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

//this class is for retrieving the movie data for the cinema
public class MovieData {
    

    public MovieData() {

    }
//both the listMovie() and list() methods achieve the same end result.
//one uses a Buffered reader while the other uses a Scanner.
    public static String[] listMovie() { // lists the movies in the list.
        String[] movieArr = null;//initialise the array
        try {
            BufferedReader reader = new BufferedReader(new FileReader("movie.txt"));//file location
            String movieStr;
            ArrayList<String> lines = new ArrayList<>();
            while ((movieStr = reader.readLine()) != null) {
                lines.add(movieStr);
            }
            movieArr = lines.toArray(new String[0]);
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Coursework.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movieArr;
    }
    
        public static String[] list() { // lists the movies in the list.

        ArrayList<String> list = new ArrayList<String>();
        String[] array = null;
        String temp = "k";
        try {
            Scanner s = new Scanner(new File("movie.txt"));

            while (s.hasNextLine()) {
                list.add(s.nextLine());
                temp = list.toString();
                //list= new ArrayList<String>(Arrays.asList(k.split("-")));
                //has trouble with split and correct appreance on jlist.
                //so left it out.
            }
            s.close();//close the scanner
            array = list.toArray(new String[list.size()]);

        } catch (FileNotFoundException e) {
            System.out.println("error msg");
        }
        return array;

    }
    
    public static String[] getMovies() {
        
      return null;
    }
    
    
    public static String showYear(){//displays current year.
        GregorianCalendar now = new GregorianCalendar();
        int thisYear = now.get(Calendar.YEAR);
        showMessageDialog(null, "This year is " + thisYear);
        return null;
    }
}
