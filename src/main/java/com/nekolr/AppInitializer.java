package com.nekolr;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public interface AppInitializer {

    void onStart(ServletContext servletContext) throws ServletException;
}
