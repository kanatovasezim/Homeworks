package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ServletSum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        Random rndm = new Random();
        int max = 10, min = 0;
        int num = rndm.nextInt(max - min) + min + 1;
        int num2 = rndm.nextInt(max - min) + min + 1;
        int sum = num +num2;
        pw.print(sum);
    }
}
