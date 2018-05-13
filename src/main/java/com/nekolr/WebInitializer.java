package com.nekolr;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Web容器启动
 */
@HandlesTypes(value = AppInitializer.class)
public class WebInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        List<AppInitializer> initializerList = new LinkedList<>();
        if (set != null) {
            for (Class<?> clazz : set) {
                if (!clazz.isInterface() && !Modifier.isAbstract(clazz.getModifiers()) &&
                        AppInitializer.class.isAssignableFrom(clazz)) {
                    try {
                        initializerList.add((AppInitializer) clazz.newInstance());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (initializerList.isEmpty()) {
                servletContext.log("No AppInitializer types detected on classpath");
                return;
            }

            servletContext.log(initializerList.size() + " AppInitializer detected on classpath");
            for (AppInitializer appInitializer : initializerList) {
                appInitializer.onStart(servletContext);
            }
        }
    }
}
