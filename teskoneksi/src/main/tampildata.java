/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ajid
 */
public class tampildata {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String username="root";
            final String pw="";
            final Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas_pakagung",username,pw);
            
            Statement statement=(Statement) koneksi.createStatement();
            final ResultSet row=statement.executeQuery("SELECT * FROM tabel_mahasiswa;");
            
            while(row.next()){
                final String nim=row.getString("nim");
                final String nama=row.getString("nama");
                final String jk=row.getString("jk");
                final String ttl=row.getString("ttl");
                final String jurusan=row.getString("jurusan");
                
                System.out.println("NIM           :"+nim);
                System.out.println("NAMA          :"+nama);
                System.out.println("JENIS KELAMIN :"+jk);
                System.out.println("TTL           :"+ttl);
                System.out.println("JURUSAN       :"+jurusan);
                System.out.println("-----------------------");
            }
            
        }catch(final SQLException ex){
        }catch(final InstantiationException ex){
        }catch(final IllegalAccessException ex){
        }catch(final ClassNotFoundException ex){
        }
    }
    
}
