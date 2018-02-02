package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * when a tweet is NOT IMPORTANT
 *
 * @version 1.0
 * @author folkerse
 */


public class NormalTweet extends Tweet {


    /**
     * Constructor
     *
     * @param message your unimportant message AKA these javadocs
     */
    public NormalTweet(String message){
        super(message);
    }//end constructor

    /**
     * Constructor
     *
     * @param message UNIMPORTANT MESSAGE
     * @param date the date of the tweet of your UNIMPORTANT message
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }//end constructor


    /**
     * Returns whether the tweet is important
     *
     * @return false
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }//end isImportant()

}
