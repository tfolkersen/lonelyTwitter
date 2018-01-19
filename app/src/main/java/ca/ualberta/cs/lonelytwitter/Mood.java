package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cf on 2018-01-18.
 */

public abstract class Mood {
    protected Date date;


    public Mood(Date date){
        this.date = date;
    }

    public Mood(){
        this.date = new Date();
    }

    public void setDate(Date date){
        this.date = date;
    }


    public Date getDate(){
        return this.date;
    }

    public abstract String toString();

}
