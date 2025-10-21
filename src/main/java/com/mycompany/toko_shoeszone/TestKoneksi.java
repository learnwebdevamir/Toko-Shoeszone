/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toko_shoeszone;

import com.shoeszone.db.koneksi;
import java.sql.Connection;

public class TestKoneksi {
    public static void main(String[] args) {
        Connection conn = koneksi.getConnection();
        if (conn != null) {
            System.out.println("✅ Koneksi ke database BERHASIL!");
        } else {
            System.out.println("❌ Gagal koneksi ke database!");
        }
    }
}
/**
 *
 * @author ADVAN
 */

