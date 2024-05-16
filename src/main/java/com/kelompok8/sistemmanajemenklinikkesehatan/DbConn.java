package com.kelompok8.sistemmanajemenklinikkesehatan;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author kalfi
 */
public class DbConn {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/klinikkesehatandb";
        String username = "root";
        String password = "";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Berhasil Terhubung ke Database!");
        } catch(Exception e) {
            System.out.println("Gagal terhubung ke Database! Berikut adalah pesan errornya : \n");
            e.printStackTrace();
        }
        
        return conn;
    }
}