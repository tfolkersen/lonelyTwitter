package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by cf on 2018-02-15.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");


        try {
            tweets.addTweet(tweet);
        } catch (IllegalArgumentException E) {
        }
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");

        assertFalse(tweets.hasTweet(tweet));

        try {
            tweets.addTweet(tweet);
        } catch (IllegalArgumentException E) {
        }


        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
            TweetList tweets = new TweetList();

            Tweet tweet = new NormalTweet("Normal tweet");

            try {
                tweets.addTweet(tweet);
            } catch (IllegalArgumentException E) {
            }

            Tweet returnedTweet = tweets.getTweet(0);

            assertTrue(tweet.equals(returnedTweet));

            Tweet newTweet = new NormalTweet("Jank");

            try {
                tweets.addTweet(newTweet);
            } catch (IllegalArgumentException E) {
            }

            returnedTweet = tweets.getTweet(1);

            assertFalse(returnedTweet.equals(tweet));

            //Shouldn't throw exception
            try {
                tweets.addTweet(new NormalTweet("xd"));
            } catch (IllegalArgumentException e) {
                assertTrue(false);
            }

            //Should throw exception
            boolean failed = false;
            try {
                tweets.addTweet(tweet);
            } catch (IllegalArgumentException e) {
                failed = true;
            }

            assertTrue(failed);

        }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("First tweet");

        try {
            tweets.addTweet(tweet);
        } catch (IllegalArgumentException E) {
        }

        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();

        Tweet tweet1 = new NormalTweet("first");
        Tweet tweet2 = new NormalTweet("second");
        Tweet tweet3 = new NormalTweet("third");
        Tweet tweet4 = new NormalTweet("fourth");
        try {
            tweets.addTweet(tweet1);
            tweets.addTweet(tweet2);
        } catch (IllegalArgumentException e) {

        }

        assertEquals(tweets.getCount(), 2);

        try {
            tweets.addTweet(tweet1);
        } catch (IllegalArgumentException e) {

        }

        assertEquals(tweets.getCount(), 2);


        try {
            tweets.addTweet(tweet3);
        } catch (IllegalArgumentException e) {

        }

        assertEquals(tweets.getCount(), 3);
    }


    public void testGetTweets(){
        TweetList tweets = new TweetList();
        TweetList tweets2 = new TweetList();


        Tweet tweet1 = new NormalTweet("first");
        Tweet tweet2 = new NormalTweet("second");
        Date d = tweet1.getDate();
        tweet2.setDate(new Date(d.getYear(),d.getMonth(),d.getDate()-1));

        ArrayList<Tweet> expected = new ArrayList<Tweet>();
        expected.add(tweet1);
        expected.add(tweet2);


        try {
            tweets.addTweet(tweet1);
            tweets.addTweet(tweet2);
            tweets2.addTweet(tweet2);
            tweets2.addTweet(tweet1);
        } catch (IllegalArgumentException e) {

        }

        ArrayList<Tweet> actual1 = tweets.getTweets();
        ArrayList<Tweet> actual2 = tweets2.getTweets();


        assertTrue((expected.size() == actual1.size()) && (expected.size() == actual2.size()));


        for (int i = 0; i < expected.size(); i++) {
            Tweet curObj = expected.get(i);
            assertTrue((actual1.indexOf(curObj) == i) && (actual2.indexOf(curObj) == i));
        }
    }







}