/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyD.dao;

import keyD.dbutill.DBconnection;
import keyD.pojo.OwnerRegisterdetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class keydDAO {
     public static boolean AddOwnerRegisterdetails(OwnerRegisterdetails e)throws SQLException
    {
        Connection conn =DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into OwnerRegister values(?,?,?,?,?,?)");
        
        ps.setString(1,e.getOwnerName());
        ps.setString(2, e.getPassword());
        ps.setString(3,e.getEmail());
        ps.setString(4,e.getOrg());
        ps.setString(5,e.getAddress());
        ps.setString(6,e.getPhoneNo());
        
        int result=ps.executeUpdate();
        return result==1;
        
    }
    
}
