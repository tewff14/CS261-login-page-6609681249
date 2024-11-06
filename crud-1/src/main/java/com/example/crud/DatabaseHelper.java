package com.example.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=myDB;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "YourStrong@Passw0rd";

    public static Long getLastIndex() {
        String query = "SELECT MAX(id) AS last_index FROM users";
        Long lastIndex = null;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            if (resultSet.next()) {
                lastIndex = resultSet.getLong("last_index");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (lastIndex != null) ? lastIndex : 0L;
    }

}