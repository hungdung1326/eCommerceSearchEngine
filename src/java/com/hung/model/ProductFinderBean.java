/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.model;

import com.hung.controller.ProductDataAccess;
import com.hung.entity.Product;
import java.util.List;

/**
 *
 * @author hungn
 */
public class ProductFinderBean {

    private String keyword;

    public void setKeyWord(String keyword) {
        this.keyword = keyword;
    }

    public List<Product> getProducts() throws ClassNotFoundException {
        return new ProductDataAccess().getProductsByName(keyword);
    }

}
