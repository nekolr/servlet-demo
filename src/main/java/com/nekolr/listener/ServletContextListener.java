package com.nekolr.listener;

import com.nekolr.servlet.IndexServlet;
import com.nekolr.util.LogUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LogUtil.log("---------------------ServletContextInitialized---------------------");
//        ServletContext servletContext = servletContextEvent.getServletContext();
//        ServletRegistration servletRegistration = servletContext.
//                addServlet(IndexServlet.class.getSimpleName(), IndexServlet.class);
//        servletRegistration.addMapping("/index");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LogUtil.log("---------------------ServletContextDestroyed---------------------");
    }
}
