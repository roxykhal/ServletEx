package com.khalilifar;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class AppTest {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world");

        //run tomcat to start it
        Tomcat tomcat = new Tomcat();
        tomcat.start();

        //you have to keep it running, code above is just stopping


    }}
