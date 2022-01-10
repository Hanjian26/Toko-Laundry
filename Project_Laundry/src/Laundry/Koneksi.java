/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Hanjian Listanto
 */
public class Koneksi {

    public static void main(String[] args) {

        Koneksi p = new Koneksi();
        Connection conn = p.getConnection();

        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public Connection getConnection() {

        // Load driver class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        // Hubungkan sumber data
        Connection conn = null;
        try {
            conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/laundrydb", "pbo2", "pbo2");
        } catch (SQLException ex) { // menangkap 
            System.out.println("Maaf, koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, koneksi ke database gagal terbentuk");
        }
        return conn;
    }
}
