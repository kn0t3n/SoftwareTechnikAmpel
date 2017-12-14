package model;

import java.time.LocalDateTime;

public abstract class Logger {

    abstract void log(Ampelphase phase);

    String getTimeAsString(){
        LocalDateTime jetzt = LocalDateTime.now();
        String text = jetzt.toString();
        return text;
    }
}
