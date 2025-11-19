/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sz.util;

public class Users {
    // Properti Static (Untuk Akses Global Setelah Login)
    private static int id;
    private static String nama;
    private static String username;
    private static String password;
    private static String email;
    private static String jabatan; // Tambahkan ini jika ada kolom Jabatan/Level

    // Properti Non-Static (Untuk Objek Data Sementara)
    private String UsrNama;
    private String UsrEmail;

    // --- Static Getters and Setters ---
    public static int getId() { return id; }
    public static void setId(int id) { Users.id = id; }

    public static String getNama() { return nama; }
    public static void setNama(String nama) { Users.nama = nama; }

    public static String getUsername() { return username; }
    public static void setUsername(String username) { Users.username = username; }

    public static String getPassword() { return password; }
    public static void setPassword(String password) { Users.password = password; }

    public static String getEmail() { return email; }
    public static void setEmail(String email) { Users.email = email; }
    
    public static String getJabatan() { return jabatan; }
    public static void setJabatan(String jabatan) { Users.jabatan = jabatan; }

    // --- Non-Static Getters and Setters ---
    // Digunakan saat membuat objek sementara (misalnya Usr di LoginPage)
    public String getUsrNama() { return UsrNama; }
    public void setUsrNama(String UsrNama) { this.UsrNama = UsrNama; }

    public String getUsrEmail() { return UsrEmail; }
    public void setUsrEmail(String UsrEmail) { this.UsrEmail = UsrEmail; }
}