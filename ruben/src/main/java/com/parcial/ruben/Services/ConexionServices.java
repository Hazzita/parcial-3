package com.parcial.ruben.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionServices {
    public Connection openDb() {
        try {
          Class.forName("org.mariadb.jdbc.Driver");
          return DriverManager.getConnection("jdbc:mariadb://localhost:3306/extincion","root","");
        } catch (SQLException e) {
          System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException cnfex) {
            System.out.println("Error "+cnfex.getMessage());
        }
        return null;
      }
}
