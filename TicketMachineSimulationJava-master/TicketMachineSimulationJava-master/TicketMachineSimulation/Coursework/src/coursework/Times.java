package coursework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/*
The purpose of this class is to populate the JList with times and dates for
each movie for the next few consecutive days starting from the current date.
 */
public class Times {

    public Times() {

    }

    public static String dates(int x) {//gets the current date yyyy/mm/dd format.
        String formatted;
        int num = x;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, num);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        formatted = format1.format(cal.getTime());

        return formatted; //returns a string of the formatted time 

    }

    public static String[] timeArrays(int listValue) {

/*String arrays that hold the times and date values.
    these were going to be held inside a text file like the movie names however I
    was having trouble implementing exatly what i wanted so this was the method
        i decided to go with.
*/
        String[] times1 = {//each set of dates and times can be assigned to a different movie.
            "             Date            Time  ",
            "Today:    " + dates(0) + "     11:45am",
            "Today:    " + dates(0) + "     14:30pm",
            "Today:    " + dates(0) + "     17:00pm",
            "Today:    " + dates(0) + "     19:30pm",
            "Tomorrow: " + dates(1) + "     15:00pm",
            "Tomorrow: " + dates(1) + "     18:00pm",
            "Date:     " + dates(2) + "     13:00pm",
            "Date:     " + dates(2) + "     16:00pm",
            "Date:     " + dates(2) + "     19:30pm",
            "Date:     " + dates(2) + "     21:00pm",
            "Date:     " + dates(3) + "     12:00pm",
            "Date:     " + dates(3) + "     15:30pm",
            "Date:     " + dates(3) + "     19:30pm",
            "Date:     " + dates(4) + "     12:00pm",
            "Date:     " + dates(4) + "     14:30pm",
            "Date:     " + dates(4) + "     16:45pm",
            "Date:     " + dates(4) + "     19:30pm"
        };

        String[] times2 = {
            "             Date            Time  ",
            "Today:    " + dates(0) + "     11:00am",
            "Today:    " + dates(0) + "     14:00pm",
            "Today:    " + dates(0) + "     19:00pm",
            "Tomorrow: " + dates(1) + "     13:30pm",
            "Tomorrow: " + dates(1) + "     16:00pm",
            "Tomorrow: " + dates(1) + "     20:00pm",
            "Date:     " + dates(2) + "     12:00pm",
            "Date:     " + dates(2) + "     19:00pm",
            "Date:     " + dates(3) + "     15:00pm",
            "Date:     " + dates(3) + "     18:00pm",
            "Date:     " + dates(3) + "     21:30pm",
            "Date:     " + dates(3) + "     10:30pm",
            "Date:     " + dates(4) + "     13:00pm",
            "Date:     " + dates(4) + "     14:30pm",
            "Date:     " + dates(4) + "     16:45pm",
            "Date:     " + dates(4) + "     21:30pm"
        };

        String[] times3 = {
            "             Date            Time  ",
            "Today:    " + dates(0) + "     11:00am",
            "Today:    " + dates(0) + "     14:00pm",
            "Tomorrow: " + dates(1) + "     13:30pm",
            "Tomorrow: " + dates(1) + "     16:00pm",
            "Tomorrow: " + dates(1) + "     20:00pm",
            "Date:     " + dates(3) + "     15:00pm",
            "Date:     " + dates(3) + "     18:00pm",
            "Date:     " + dates(3) + "     21:30pm",
            "Date:     " + dates(3) + "     10:30pm",
            "Date:     " + dates(4) + "     13:00pm",
            "Date:     " + dates(4) + "     16:45pm",
            "Date:     " + dates(4) + "     21:30pm"
        };

        String[] times4 = {
            "             Date            Time  ",
            "Today:    " + dates(0) + "     19:00pm",
            "Tomorrow: " + dates(1) + "     10:30am",
            "Tomorrow: " + dates(1) + "     13:30pm",
            "Tomorrow: " + dates(1) + "     19:15pm",
            "Tomorrow: " + dates(1) + "     20:20pm",
            "Date:     " + dates(2) + "     13:40pm",
            "Date:     " + dates(2) + "     19:10pm",
            "Date:     " + dates(3) + "     12:50pm",
            "Date:     " + dates(3) + "     18:00pm",
            "Date:     " + dates(3) + "     21:30pm",
            "Date:     " + dates(4) + "     13:00pm",
            "Date:     " + dates(4) + "     14:30pm",
            "Date:     " + dates(4) + "     17:45pm",
            "Date:     " + dates(4) + "     22:00pm"
        };

        String[] times5 = {
            "             Date            Time  ",
            "Today:    " + dates(0) + "     10:00am",
            "Today:    " + dates(0) + "     12:00pm",
            "Today:    " + dates(0) + "     15:00pm",
            "Today:    " + dates(0) + "     20:30pm",
            "Tomorrow: " + dates(1) + "     10:45am",
            "Tomorrow: " + dates(1) + "     13:15pm",
            "Tomorrow: " + dates(1) + "     19:50pm",
            "Tomorrow: " + dates(1) + "     20:20pm",
            "Date:     " + dates(2) + "     13:40pm",
            "Date:     " + dates(2) + "     15:50pm",
            "Date:     " + dates(3) + "     18:50pm",
            "Date:     " + dates(3) + "     21:00pm",
            "Date:     " + dates(3) + "     22:30pm",
            "Date:     " + dates(4) + "     12:00pm",
            "Date:     " + dates(4) + "     13:30pm",
            "Date:     " + dates(4) + "     14:45pm",
            "Date:     " + dates(4) + "     19:00pm"
        };

        String[] noInfo = {"Times for this movie are not currently listed"};

        int listV = listValue;//list seleected value from movielist Jlist

        //method used to return array to Coursework class to populate jlist based on given value.
        if (listV == 2) {
            return times1;
        } else if (listV == 3) {
            return times2;
        } else if (listV == 4) {
            return times3;
        } else if (listV == 5) {
            return times4;
        } else if (listV == 6) {
            return times5;
        } else if (listV == 7) {
            return times1;
        } else if (listV == 8) {
            return times2;
        } else if (listV == 9) {
            return times3;
        } else if (listV == 10) {
            return times5;
        } else if (listV < 2 || listV > 10) {//for demonstation purposes the limit for this was 10. just to show what happens
            //if more than 10 movies are on the list. and the error messasge given.
            //there are currently 11 values on the list.
            return noInfo;
        }

        return null;//if a return statement is not hit before this point. null will be returned.
    }

}
