package com.timbuchalka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

//        try with resources, to be automatically be closed after try statement.
//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\phill\\OneDrive\\Desktop\\Java_Masterclass\\JMC_17\\JavaMasterClass-jdk17\\S25_Databases\\S25.432_CreatingDatabasesWithJDBCInJava\\testjava.db");
//             Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\phill\\OneDrive\\Desktop\\Java_Masterclass\\JMC_17\\JavaMasterClass-jdk17\\S25_Databases\\S25.432_CreatingDatabasesWithJDBCInJava\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

//            IMPORTANT:
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
