/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

/**
 *
 * @author Leonardo
 */
public class ProdutoDao {

    public List<Produto> listar() {
        String sql = "SELECT * FROM tb_gubeeJson";
        List<Produto> retorno = new ArrayList<Produto>();

        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                Produto prod = new Produto();
                prod.setId(res.getInt("id"));
                prod.setProductName(res.getString("productName"));
                prod.setDescription(res.getString("description"));
                prod.setTargetMarket(res.getString("targetMarket"));
                prod.setStack(res.getString("stack"));

                retorno.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        return retorno;
    }
}
