package sql.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StateCapitalDB {
    private static final String dbName = "stateCapitals.db";
    private static final String jdbcUrl = "jdbc:sqlite:./src/main/java/sql/connect/" + dbName;
    public static void createNewDatabase() {

        try (Connection conn = DriverManager.getConnection(jdbcUrl)) {
            if (conn != null) {
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTable() {

        String sql = """
                CREATE TABLE IF NOT EXISTS stateCapitals (
                	id integer PRIMARY KEY,
                	state text NOT NULL,
                	capital text NOT NULL
                );""";

        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully");

            // Add some data to the table
            sql = """
                    INSERT INTO stateCapitals(state, capital) VALUES
                    ('Alabama', 'Montgomery'),
                    ('Alaska', 'Juneau'),
                    ('Arizona', 'Phoenix'),
                    ('Arkansas', 'Little Rock'),
                    ('California', 'Sacramento'),
                    ('Colorado', 'Denver'),
                    ('Connecticut', 'Hartford'),
                    ('Delaware', 'Dover'),
                    ('Florida', 'Tallahassee'),
                    ('Georgia', 'Atlanta'),
                    ('Hawaii', 'Honolulu'),
                    ('Idaho', 'Boise'),
                    ('Illinois', 'Springfield'),
                    ('Indiana', 'Indianapolis'),
                    ('Iowa', 'Des Moines'),
                    ('Kansas', 'Topeka'),
                    ('Kentucky', 'Frankfort'),
                    ('Louisiana', 'Baton Rouge'),
                    ('Maine', 'Augusta'),
                    ('Maryland', 'Annapolis'),
                    ('Massachusetts', 'Boston'),
                    ('Michigan', 'Lansing'),
                    ('Minnesota', 'St. Paul'),
                    ('Mississippi', 'Jackson'),
                    ('Missouri', 'Jefferson City'),
                    ('Montana', 'Helena'),
                    ('Nebraska', 'Lincoln'),
                    ('Nevada', 'Carson City'),
                    ('New Hampshire', 'Concord'),
                    ('New Jersey', 'Trenton'),
                    ('New Mexico', 'Santa Fe'),
                    ('New York', 'Albany'),
                    ('North Carolina', 'Raleigh'),
                    ('North Dakota', 'Bismarck'),
                    ('Ohio', 'Columbus'),
                    ('Oklahoma', 'Oklahoma City'),
                    ('Oregon', 'Salem'),
                    ('Pennsylvania', 'Harrisburg'),
                    ('Rhode Island', 'Providence'),
                    ('South Carolina', 'Columbia'),
                    ('South Dakota', 'Pierre'),
                    ('Tennessee', 'Nashville'),
                    ('Texas', 'Austin'),
                    ('Utah', 'Salt Lake City'),
                    ('Vermont', 'Montpelier'),
                    ('Virginia', 'Richmond'),
                    ('Washington', 'Olympia'),
                    ('West Virginia', 'Charleston'),
                    ('Wisconsin', 'Madison'),
                    ('Wyoming', 'Cheyenne');""";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}