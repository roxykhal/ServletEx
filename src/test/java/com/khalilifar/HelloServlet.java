package com.khalilifar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {


    //gets executed everytime you run the method
    //Data coming from client is stored in req
    //Data you want to send back to client is stored in res
    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("In service");


    }


}
