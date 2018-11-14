/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.controller;

import com.hung.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author hungn
 */
public class ProductDataAccess {
    private PreparedStatement searchStatement;
    private PreparedStatement getSearchStatement() throws ClassNotFoundException, SQLException{
        if (searchStatement == null) {
            Connection conn = new DBConnection().getConnection();
            searchStatement = conn.prepareStatement("SELECT id, name, des FROM PRODUCT WHERE name like ?");           
        }
        return searchStatement;
    }
    public List<Product> getProductsByName(String name) throws ClassNotFoundException{
        try {
            PreparedStatement stmt = getSearchStatement();
            stmt.setString(1, "%"+name+"%");
            ResultSet rs = stmt.executeQuery();
            List<Product> list = new LinkedList<Product>();
            while(rs.next()){
                list.add(new Product(rs.getString("id"), rs.getString("name"), rs.getString("des")));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
        
    }
    
}
