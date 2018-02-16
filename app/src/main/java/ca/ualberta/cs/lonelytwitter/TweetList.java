package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by cf on 2018-02-15.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if(this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);
    }


    public boolean hasTweet(Tweet tweet){
        if (!(!(this.tweets.contains(tweet)))) {
            return Boolean.TRUE;
        } else if (! this.tweets.contains(tweet)){
            return Boolean.FALSE;
        }
        return !Boolean.TRUE;
    }


    public Tweet getTweet(int idx){
        return tweets.get(idx);
    }

    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public void addTweetSometimes(Tweet tweet){
        Random rand = new Random();
        if (rand.nextBoolean()) {
            tweets.add(tweet);
        }
    }

    public int getCount(){
        return tweets.size();
    }


    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> temp = (ArrayList<Tweet>) tweets.clone();
        Collections.sort(temp, new DateCompare());
        tweets = temp;
        return temp;
    }




}
