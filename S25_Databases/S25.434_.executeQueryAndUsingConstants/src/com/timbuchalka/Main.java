package com.timbuchalka;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

//        try with resources, to be automatically be closed after try statement.
//             Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");

//            Toggling the JDBC auto-commit:
//            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

//            Fixing error, by adding IF NOT EXISTS:
            statement.execute("CREATE TABLE  IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            Inserting into the table:
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                                   "VALUES('Joe', 4562, 'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 4829484, 'jane@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 9038, 'dog@email.com')");

//            Update:
//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");

//            Delete:
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

//            Retrieving result set:
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();

//            IMPORTANT:
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}