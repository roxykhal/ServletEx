package com.khalilifar;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class AppTest {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world");

        //run tomcat to start it
        Tomcat tomcat = new Tomcat();


        //mapping - get hold of context object
        Context context = tomcat.addContext("", null);

        //first parameter is context, second parameter is the name of the servlet, third parameter is name of class
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());

        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();

        //you have to keep it running, code above is just stopping
        tomcat.getServer().await();

    }}
