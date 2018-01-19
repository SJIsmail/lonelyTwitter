package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private List<Mood> moods = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String messgae, Date date){
        this.message = messgae;
        this.date = date;

    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140){
            throw new TweetTooLongException();

        }
        else{
            this.message = message;
        }
    }

    public abstract Boolean IsImportant();

    public void addMood(Mood newMood){
        moods.add(newMood);


    }


}