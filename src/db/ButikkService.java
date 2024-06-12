package db;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.util.Optional;

public class ButikkService {
    private final MysqlDataSource butikkDS;

    public ButikkService() {
        butikkDS = new MysqlDataSource();
        butikkDS.setPassword(ButikkProperties.PROPS.getProperty("password"));
        butikkDS.setPortNumber(Integer.parseInt(ButikkProperties.PROPS.getProperty("port")));
        butikkDS.setServerName(ButikkProperties.PROPS.getProperty("host"));
        butikkDS.setDatabaseName(ButikkProperties.PROPS.getProperty("butikk"));
        butikkDS.setUser(ButikkProperties.PROPS.getProperty("username"));
    }
}