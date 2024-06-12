import db.ButikkService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ButikkService butikkService = new ButikkService();
        new Program(butikkService);
    }
}