package org.dbtester;

import java.sql.*;
public class Student {
    Integer ID;
    String firstName;
    String lastName;
    String street;
    String city;
    String studentEmail;
    Double gpa;
    String state;
    Integer zipCode;

    Student(){

    }

    Student(Integer ID, String firstName, String lastName, String street, String city, String studentEmail, Double gpa, String state, Integer zipCode){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.studentEmail = studentEmail;
        this.gpa = gpa;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public Double getGpa() {
        return gpa;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public void display(){
        System.out.print(getID() + " ");
        System.out.print(getFirstName()+ " ");
        System.out.print(getLastName()+ " ");
        System.out.print(getStreet()+ " ");
        System.out.print(getState()+ " ");
        System.out.print(getZipCode()+ " ");
        System.out.print(getStudentEmail()+ " ");
        System.out.print(getGpa()+ " ");
    }
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessConnection");
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/udemb/Downloads/RegistrationMDB.accdb");

        System.out.println("connection established! " + connection);
        return connection;
    }
    public void selectDB(Integer stuId) {
        try {

            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String sql;

            sql = "Select * from Students where ID='"+stuId+"'";
            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                setID(resultSet.getInt("ID"));
                setFirstName(resultSet.getString("FirstName"));
                setLastName(resultSet.getString("LastName"));
                setStreet(resultSet.getString("City"));
                setState(resultSet.getString("State"));
                setZipCode(resultSet.getInt("Zip"));
                setStudentEmail(resultSet.getString("EMail"));
                setGpa(resultSet.getDouble("GPA"));
            }
            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteDB(Integer stuId){
        try {

            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String sql;

            sql = "DELETE from Students where ID='"+stuId+"'";
            System.out.println(sql);
            int n = statement.executeUpdate(sql);

            if (n==1)
                System.out.println("DELETE Successful!!!");
            else
                System.out.println("DELETE FAILED***********");
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateDB(Integer ID, String firstName, String lastName, String street, String city, String studentEmail, Double gpa, String state, Integer zipCode){

        setID(ID); setFirstName(firstName); setLastName(lastName); setStreet(street); setCity(city); setStudentEmail(studentEmail); setGpa(gpa); setState(state); setZipCode(zipCode);

        try {
            Connection connection = getConnection();
            String sql = "UPDATE Students SET FirstName=?, LastName=?, Street=?, City=?, EMail=?, GPA=?, State=?, Zip=? WHERE ID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, getFirstName());
            preparedStatement.setString(2, getLastName());
            preparedStatement.setString(3, getStreet());
            preparedStatement.setString(4, getCity());
            preparedStatement.setString(5, getStudentEmail());
            preparedStatement.setDouble(6, getGpa());
            preparedStatement.setString(7, getState());
            preparedStatement.setInt(8, getZipCode());
            preparedStatement.setInt(9, getID()); // Set ID last in the WHERE clause

            System.out.println(sql);
            int n1 = preparedStatement.executeUpdate();

            if (n1==1)
                System.out.println("UPDATE Successful!!!");
            else
                System.out.println("UPDATE FAILED***********");
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertDB(Integer ID, String firstName, String lastName, String street, String city, String studentEmail, Double gpa, String state, Integer zipCode){

        setID(ID); setFirstName(firstName); setLastName(lastName); setStreet(street); setCity(city); setStudentEmail(studentEmail); setGpa(gpa); setState(state); setZipCode(zipCode);

        try {
            Connection connection = getConnection();

            String sql = "INSERT INTO Students (ID, FirstName, LastName, Street, City, EMail, GPA, State, Zip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, getID());
            preparedStatement.setString(2, getFirstName());
            preparedStatement.setString(3, getLastName());
            preparedStatement.setString(4, getStreet());
            preparedStatement.setString(5, getCity());
            preparedStatement.setString(6, getStudentEmail());
            preparedStatement.setDouble(7, getGpa());
            preparedStatement.setString(8, getState());
            preparedStatement.setInt(9, getZipCode());

            System.out.println(sql);
            int n1 = preparedStatement.executeUpdate();

            if (n1==1)
                System.out.println("INSERT Successful!!!");
            else
                System.out.println("INSERT FAILED***********");
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    };
}
