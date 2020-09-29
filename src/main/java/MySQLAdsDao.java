import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(), config.getUser(), config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
        List<Ad> ads = new ArrayList<Ad>();
        while(rs.next()){//when loop all the ads, rs.next() will return null
            Ad ad = new Ad(rs.getLong(1),rs.getLong(2),rs.getString(3),rs.getString(4));
            ads.add(ad);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement stmt = connection.createStatement();//execute query in mySQL
        stmt.executeUpdate(String.format("INSERT INTO ads(user_id, title, description) VALUES(%d, '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription()),Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();//a set of new ads
        rs.next();//go to the first ad we created
        return rs.getLong(1);//get the first column in the database. or getString(num);
    }
}
