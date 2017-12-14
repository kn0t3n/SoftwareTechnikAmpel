package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLogger extends Logger {

    @Override
    void log(Ampelphase phase) {
        File file = new File("log.txt");
        try {
            Writer writer = new FileWriter(file);
            writer.append("Hallo");
            writer.flush();
            writer.close();
        } catch (IOException e) {

        }
    }

    public FileLogger() {

    }
}
