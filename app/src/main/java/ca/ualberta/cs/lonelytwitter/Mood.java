package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * THE MOOD FOR THE TWEETS
 *
 * @author folkerse
 *
 * @version 1.0
 * @see Sad
 * @see Happy
 */

public abstract class Mood {
    protected Date date;


    /**
     * Constructor
     *
     * @param date the date for the mood
     */
    public Mood(Date date){
        this.date = date;
    }


    /**
     * Constructor
     *
     */
    public Mood(){
        this.date = new Date();
    }


    /**
     * Sets the date
     *
     * @param date the date for the mood
     */
    public void setDate(Date date){
        this.date = date;
    }


    /**
     * Gets the date
     *
     * @return the date
     */
    public Date getDate(){
        return this.date;
    }


    public abstract String toString();

}
