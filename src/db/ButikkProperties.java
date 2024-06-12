package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ButikkProperties {
    public static final Properties PROPS;

    static {
        PROPS = new Properties();
        try {
            PROPS.load(new FileInputStream("Butikk.properties"));
        } catch (IOException e) {
            System.out.println("Unable to load properties:" + e.getMessage());
        }
    }
}
