package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ismail on 1/18/18.
 */

public class FirstMood extends Mood {

    FirstMood() {
        super();
    }

    FirstMood(Date setDate) {
        super(setDate);
    }

    public String CurrentMood()
    {
        return "First";
    }


}
