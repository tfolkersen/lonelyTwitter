package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public class Happy extends Mood {
    @Override
    public String toString(){
        return ":)";
    }//end toString()

    public Happy(Date date){
        super(date);
    }//end constructor

    public Happy(){
        super();
    }//end constructor



}
