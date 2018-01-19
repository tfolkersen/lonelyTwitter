package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message){
        super(message);
    }//end constructor

    public NormalTweet(String message, Date date){
        super(message, date);
    }//end constructor

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }//end isImportant()

}
