/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hanjian Listanto
 */
public class SQLConnection {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "205314102";

        Connection conn = null;
        Statement stmt;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, user, password);
            stmt = conn.createStatement();
         

            stmt.close();
            conn.close();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            // perform error handling here
            JOptionPane.showMessageDialog(null, "Username dan Password anda salah");
        }
    }
}
