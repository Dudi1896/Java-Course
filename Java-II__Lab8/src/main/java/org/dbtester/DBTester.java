package org.dbtester;

import java.sql.*;

public class DBTester {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("Trying to connect to ucanaccess Database....");
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessConnection");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/udemb/Downloads/RegistrationMDB.accdb");
            System.out.println("connection established! " + connection);

            Statement statement = connection.createStatement();

            String sql;
            sql = "select * from Courses";
            System.out.println(sql);
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println("Course ID = " + resultSet.getString(1));
                System.out.println("Course Name = " + resultSet.getString(2));
                System.out.println("Description = " + resultSet.getString(3));
                System.out.println("Credit Hours = " + resultSet.getString(4));
                System.out.println("======================== ");
            }
            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}