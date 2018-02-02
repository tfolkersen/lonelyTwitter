package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A Mood for tweets
 *
 * @author folkerse
 *
 * @version 1.0
 * @see Mood
 */

public class Sad extends Mood {

    /**
     * Returns the ASCII characters representing the mood
     *
     * @return the ASCII characters representing the mood
     */
    @Override
    public String toString(){
        return ":(";
    }//end toString()


    /**
     * Constructor
     * @param date the date where you were sad example: February 1st from 5:00 PM to 8:00 PM
     */
    public Sad(Date date){
        super(date);
    }//end constructor


    /**
     * Constructor
     */
    public Sad(){
        super();
    }//end constructor



}