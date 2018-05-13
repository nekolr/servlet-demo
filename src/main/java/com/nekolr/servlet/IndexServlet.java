package com.nekolr.servlet;

import com.nekolr.util.LogUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LogUtil.log("---------------------doGet---------------------");
        PrintWriter out = response.getWriter();
        out.print("<html><body>Hello " + request.getParameter("name") + " </body></html>");
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LogUtil.log("---------------------doPost---------------------");
    }

    @Override
    public void init() throws ServletException {
        LogUtil.log("---------------------IndexServletInitialized---------------------");
    }


}
