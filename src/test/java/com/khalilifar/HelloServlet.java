package com.khalilifar;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloServlet extends HttpServlet {


    //gets executed everytime you run the method
    //Data coming from client is stored in req
    //Data you want to send back to client is stored in res
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");

        //get a response
        res.getWriter().println("Hello world");


    }


}
