/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.LichHen;

/**
 *
 * @author Dell Precision 7510
 */
public class LichHenDAO {
    private String dbURL = "jdbc:mysql://localhost:3306/garaman";
    private String user_name = "root";
    private String password = "123456";
    public Connection connection = DBConnection.getConnection(dbURL, user_name, password);
    public void insert(LichHen l){
        String sql = "insert into lichHen values(?,?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setNString(1, l.);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
