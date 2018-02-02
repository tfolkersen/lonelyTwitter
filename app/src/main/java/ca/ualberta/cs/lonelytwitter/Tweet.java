package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;

/**
 * Represents a tweet
 *
 * @author folkerse
 * @see Tweetable
 * @see ImportantTweet
 * @see NormalTweet
 *
 * @version 1.0
 */


public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList moods = new ArrayList<Mood>();


    /**
     * Adds a mood to the mood list of the tweet
     *
     * @param mood is a mood that you attach to a tweet
     * @see Mood
     */
    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    /**
     * Constructor for Tweet
     *
     * @param message the message of the tweet
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }//end constructor


    /**
     * Constructor for Tweet
     *
     * @param message the message of the tweet
     * @param date the date that the tweet was made
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }//end constructor


    /**
     * Gets the date of the tweet
     *
     * @return the date of the tweet
     */
    public Date getDate(){
        return date;
    }//end getDate()

    /**
     * Sets the date of the tweet
     *
     * @param date the date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }//end setDate()

    /**
     * Get the message of the tweet
     *
     * @return the message of the tweet
     */
    public String getMessage(){
        return this.message;
    }//end getMessage()


    /**
     * Sets hte message of the tweet
     *
     * @param message the message of the tweet
     * @throws TweetTooLongException exception if the tweet is longer than 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140){
            throw new TweetTooLongException();
        }else{
            this.message = message;
        }
    }//end setMessage()

    /**
     * Returns whether or not the tweet is important
     *
     * @return whether or not the tweet is important
     */
    public abstract Boolean isImportant();

}