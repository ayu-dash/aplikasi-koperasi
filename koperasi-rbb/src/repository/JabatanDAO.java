/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DatabaseConnection;
import java.util.List;
import java.util.ArrayList;
import models.JabatanModel;

/**
 *
 * @author wtf
 */
public class JabatanDAO {
    public static List<JabatanModel> getAll() {
        List<JabatanModel> list = new ArrayList<>();
        
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "SELECT * FROM jabatan";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                while(rs.next()) {
                    list.add(new JabatanModel(rs.getInt("id_jabatan"), rs.getString("nama_jabatan")));
                }
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
        
    public static int getIdJabatanBynama(String nama) {
        try(Connection conn = DatabaseConnection.connect()) {
            String query = "SELECT id_jabatan FROM jabatan WHERE nama_jabatan = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, nama);
                ResultSet rs = stmt.executeQuery();
                
                if(rs.next()) {
                    return rs.getInt("id_jabatan");
                }
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        
        return -1;
    }
}
