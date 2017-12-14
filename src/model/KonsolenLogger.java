package model;

public class KonsolenLogger extends Logger {

    @Override
    void log(Ampelphase phase) {
        String text = "Zeit: "+ getTimeAsString() + ", umgeschaltet zu " + phase;
        System.out.println(text);
    }
}
