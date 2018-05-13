package com.nekolr;

import com.nekolr.servlet.IndexServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class CustomAppInitializer implements AppInitializer {
    @Override
    public void onStart(ServletContext servletContext) throws ServletException {

        ServletRegistration servletRegistration = servletContext.
                addServlet(IndexServlet.class.getSimpleName(), IndexServlet.class);
        servletRegistration.addMapping("/index");
    }
}
