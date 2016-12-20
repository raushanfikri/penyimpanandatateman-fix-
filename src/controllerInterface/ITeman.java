/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerInterface;
import Model.MTeman;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author microsoft
 */
public interface ITeman {
     MTeman simpan(MTeman o) throws SQLException;
    void hapus(String id) throws SQLException;
    void edit (MTeman o) throws SQLException;
    List<MTeman> tampil() throws SQLException;
}
