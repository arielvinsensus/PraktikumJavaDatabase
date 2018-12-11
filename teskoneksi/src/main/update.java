/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ajid
 */
public class update {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String username="root";
            final String pw="";
            final Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas_pakagung",username,pw);
            
            Statement statement=(Statement) koneksi.createStatement();
            statement.executeUpdate("UPDATE tabel_mahasiswa SET "
                    +"nama= 'yazid abdul rachman', ttl='Bekasi, 13 juni 1998'"
                    +"WHERE id_mahasiswa='1';"
            );
            
            System.out.println("update berhasil");
        }catch(final SQLException ex){
        }catch(final InstantiationException ex){
        }catch(final IllegalAccessException ex){
        }catch(final ClassNotFoundException ex){
        }
    }
    
}
