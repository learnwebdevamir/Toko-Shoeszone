/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shoeszone.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/toko_shoeszone"; // ganti sesuai database kamu
                String user = "root"; // ganti jika user lain
                String password = ""; // isi password MySQL kamu jika ada

                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi database berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi database gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}

/**
 *
 * @author ADVAN
 */
