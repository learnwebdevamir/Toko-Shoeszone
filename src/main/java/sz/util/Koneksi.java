package sz.util;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;

    public static Connection Go() {
        if (koneksi == null) {
            try {
                // Ganti dengan driver yang sesuai jika menggunakan JDBC versi lain
                String url = "jdbc:mysql://localhost:3306/toko_shoes";
                String user = "root"; // Ganti dengan username MySQL Anda
                String pass = "";     // Ganti dengan password MySQL Anda
                
                // Daftarkan Driver
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                
                // Buat Koneksi
                koneksi = DriverManager.getConnection(url, user, pass);
                // System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi database GAGAL! Periksa XAMPP/MySQL Anda.\n" + e.getMessage());
                // Keluar dari aplikasi jika koneksi gagal total
                System.exit(1); 
            }
        }
        return koneksi;
    }
}