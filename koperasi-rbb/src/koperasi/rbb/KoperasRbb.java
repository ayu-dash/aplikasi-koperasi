package koperasi.rbb;

import java.sql.*;
import javax.swing.JOptionPane;
import views.LoginView;

public class KoperasRbb {
    public static void main(String[] args) {
        if (!isDatabaseExist("koperasi_rbb")) {
            JOptionPane.showMessageDialog(
                null,
                "Database 'koperasi_rbb' tidak ditemukan!\nSilakan buat database terlebih dahulu.",
                "Database Tidak Ditemukan",
                JOptionPane.ERROR_MESSAGE
            );
            System.exit(1);
        }
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }


    public static boolean isDatabaseExist(String dbName) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "")) {
            ResultSet rs = conn.getMetaData().getCatalogs();
            while (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(dbName)) return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
