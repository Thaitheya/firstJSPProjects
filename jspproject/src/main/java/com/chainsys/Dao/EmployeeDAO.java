package com.chainsys.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.pojo.Employee;

public class EmployeeDAO {

    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (name,city,salary) VALUES " +
            " (?, ?, ?);";

        int result = 0;

        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Step 1: Established the connection with database
      try (Connection connection = DriverManager
     .getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");

        // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement =  connection.prepareStatement("INSERT into employee")) {               

            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getCity());
            preparedStatement.setInt(3,employee.getSalary());
            

        // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQL state: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}