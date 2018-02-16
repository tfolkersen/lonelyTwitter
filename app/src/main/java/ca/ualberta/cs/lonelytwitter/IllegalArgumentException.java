package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by cf on 2018-02-15.
 */

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(){
        super();

        Log.i("ERROR", "YOUR PROGRAM IS BAD");
    }

}
