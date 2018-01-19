package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }//end constructor



    public ImportantTweet(String message, Date date){
        super(message, date);
    }//end constructor


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }//end isImportant()
}
