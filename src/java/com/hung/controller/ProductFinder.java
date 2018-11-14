/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.controller;

import com.hung.model.ProductFinderBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hungn
 */
public class ProductFinder extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String keyWord = req.getParameter("name");
        if (keyWord == null || keyWord.trim().isEmpty()) {
            resp.sendRedirect("Search.jsp?msg=Enter keyword!");
            return;
        }
        ProductFinderBean finder = new ProductFinderBean();
        finder.setKeyWord(keyWord);
        req.setAttribute("finder", finder);
        RequestDispatcher rd = req.getRequestDispatcher("Result.jsp");
        rd.forward(req, resp);

    }

}
