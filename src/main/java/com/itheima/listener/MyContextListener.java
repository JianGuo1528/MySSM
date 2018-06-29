package com.itheima.listener;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;


public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            new StdSchedulerFactory();
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.shutdown(true);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

        // Clear mysql thread
        try {
            AbandonedConnectionCleanupThread.checkedShutdown();
        } catch (Throwable t) {

        }

        // This manually deregisters JDBC driver, which prevents Tomcat 7 from complaining about memory leaks
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            try {
                DriverManager.deregisterDriver(driver);
            } catch (Throwable t) {
            }
        }

        // Clear C3P0 data source
        /*for (Object o : C3P0Registry.getPooledDataSources()) {
            try {
                ((PooledDataSource) o).close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
