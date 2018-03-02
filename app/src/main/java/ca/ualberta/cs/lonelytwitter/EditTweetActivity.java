package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet2);


        Intent i = getIntent();
        TextView v = (TextView) findViewById(R.id.singleTweetView);
        v.setText(i.getStringExtra("tweetText"));
    }
}
