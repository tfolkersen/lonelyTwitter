package ca.ualberta.cs.lonelytwitter;


import java.util.Comparator;

/**
 * Created by cf on 2018-02-15.
 */

public class DateCompare implements Comparator<Tweet>{

    public DateCompare(){

    }

    public int compare(Tweet a, Tweet b) {
        return b.getDate().compareTo(a.getDate());
    }



}
