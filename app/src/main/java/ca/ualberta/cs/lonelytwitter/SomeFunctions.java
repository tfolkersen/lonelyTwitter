package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.List;

/**
 * Created by cf on 2018-02-15.
 */

public class SomeFunctions {


    public static void printTweetList(List<Tweet> l){
        for (int i = 0; i < l.size(); i++) {
            Log.i("STUFF", l.get(i).message);
        }
    }



}
