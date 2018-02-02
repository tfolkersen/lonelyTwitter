package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents IMPORTANT tweets
 *
 * @author folkerse
 *
 * @version 1.0
 */

public class ImportantTweet extends Tweet {


    /**
     * Constructor
     *
     * @param message the message of the IMPORTANT tweets
     */
    public ImportantTweet(String message){
        super(message);
    }//end constructor


    /**
     * Constructor
     *
     * @param message tweet message
     * @param date the date of the tweet
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }//end constructor


    /**
     * Returns whether or not the tweet is important
     *
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }//end isImportant()
}
