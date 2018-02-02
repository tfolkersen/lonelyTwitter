package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The mood happy
 *
 * @author folkerse
 * @version 1.0
 * @see Mood
 */

public class Happy extends Mood {
    /**
     *
     *
     * @return the ascii characters for happy
     */
    @Override
    public String toString(){
        return ":)";
    }//end toString()


    /**
     * Constructor
     *
     * @param date the date when you were happy, for example, any date other than Feb 1 from 6:00 to 8:00
     */
    public Happy(Date date){
        super(date);
    }//end constructor


    /**
     * Constructor
     *
     */
    public Happy(){
        super();
    }//end constructor



}
