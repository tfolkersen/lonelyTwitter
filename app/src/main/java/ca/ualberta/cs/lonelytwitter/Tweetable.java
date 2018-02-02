package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents something that can be tweeted
 *
 * @author folkerse
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @see NormalTweet
 */

public interface Tweetable {
    String getMessage();
    Date getDate();



}
