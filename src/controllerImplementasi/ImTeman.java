/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerImplementasi;

import controllerInterface.ITeman;
import Koneksi.CTeman;
import Model.MTeman;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author microsoft
 */
public class ImTeman implements ITeman{

    @Override
    public MTeman simpan(MTeman o) throws SQLException {
         PreparedStatement st = (PreparedStatement) 
    CTeman.KoneksiDatabase().prepareStatement("INSERT INTO tbl_teman VALUES(?,?,?,?,?)");
    st.setString(1,o.getId());
    st.setString(2,o.getNama());
    st.setString(3,o.getNohp());
    st.setString(4,o.getEmail());
    st.setString(5,o.getAlamat());
    st.executeUpdate();
    return o;
    }

    @Override
    public void hapus(String id) throws SQLException {
         PreparedStatement st = (PreparedStatement)
   CTeman.KoneksiDatabase().prepareStatement("DELETE FROM tbl_teman WHERE id_teman = ?");
      st.setString(1, id);
    st.executeUpdate();
    }

    @Override
    public void edit(MTeman o) throws SQLException {
        com.mysql.jdbc.PreparedStatement st = (com.mysql.jdbc.PreparedStatement)
   CTeman.KoneksiDatabase().prepareStatement("UPDATE tbl_teman SET nama = ?, no_hp = ?, email= ?, alamat= ? WHERE id = ?");
    st.setString(1,o.getNama());
    st.setString(2,o.getNohp());
    st.setString(3,o.getEmail());
    st.setString(4,o.getAlamat());
    st.setString(5,o.getId());
    st.executeUpdate();
    }

    @Override
    public List<MTeman> tampil() throws SQLException {
        Statement stm = (Statement) CTeman.KoneksiDatabase().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_kaset");
        List <MTeman> Listteman = new ArrayList<>();
        while (rst.next()){
        MTeman teman = new MTeman();
        teman.setId(rst.getString("id_teman"));
        teman.setNama(rst.getString("nama"));
        teman.setNohp(rst.getString("no_hp"));
        teman.setEmail(rst.getString("email"));
        teman.setAlamat(rst.getString("alamat"));
        Listteman.add(teman);
        }
        return Listteman;
    }
    
}
