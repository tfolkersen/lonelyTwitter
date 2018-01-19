package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public class Sad extends Mood {
    @Override
    public String toString(){
        return ":(";
    }//end toString()

    public Sad(Date date){
        super(date);
    }//end constructor

    public Sad(){
        super();
    }//end constructor



}