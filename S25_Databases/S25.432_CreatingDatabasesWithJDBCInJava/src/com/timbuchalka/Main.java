package com.timbuchalka;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        public static final String DB_NAME = "testjava.db";
        public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\databases\\testjava.db" + DB_NAME;

        public static final String TABLE_CONTACTS = "contacts";

        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_EMAIL = "email";

        try {
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");

//            Toggling the JDBC auto-commit:
//            conn.setAutoCommit(false);

//            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

//            Fixing error, by adding IF NOT EXISTS:
//            statement.execute("CREATE TABLE  IF NOT EXISTS contacts" +
//                    "(name TEXT, phone INTEGER, email TEXT)");

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
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                        results.getInt("phone") + " " +
//                        results.getString("email"));
//            }

//            SAFER:
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.execute("DROP TABLE IF EXISTS" + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF EXISTS" + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + "text, " +
                    COLUMN_PHONE + "integer, " +
                    COLUMN_EMAIL + "text, " +
                    ")");

//            statement.execute("INSERT INTO" + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Tim', 6545678, 'tim@email.com')");
//
//            statement.execute("INSERT INTO" + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Joe', 45632, 'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO" + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Jane', 4829484, 'jane@somwhere.com')");
//
//            statement.execute("INSERT INTO" + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Fido', 9038, 'dog@email.com')");

            insertContact(statement, ("Tim", 6545678, "tim@email.com");
            insertContact(statement, ("Joe", 6545678, "joe@somwhere.com");
            insertContact(statement, ("Jane", 6545678, "jane@somewhere.com");
            insertContact(statement, ("Fido", 6545678, "dog@email.com");

            statement.execute("UPDATE" + TABLE_CONTACTS + "SET" +
                    COLUMN_PHONE + "=5566789" +
                    "WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE" + COLUMN_NAME + "='Joe'");

//            Easier way of retrieving results:
            ResultSet results = statement.executeQuery("SELECT * FROM" + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();

//            IMPORTANT:
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO" + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
