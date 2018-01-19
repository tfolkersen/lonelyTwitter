package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;



    public Tweet(String message){
        this.message = message;
    }//end constructor


    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }//end constructor


    public Date getDate(){
        return date;
    }//end getDate()


    public void setDate(Date date){
        this.date = date;
    }//end setDate()

    public String getMessage(){
        return this.message;
    }//end getMessage()


    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }//end setMessage()


    public abstract Boolean isImportant();

}