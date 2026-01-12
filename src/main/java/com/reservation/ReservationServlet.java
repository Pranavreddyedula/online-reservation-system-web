package com.reservation;

import java.io.IOException;
import java.sql.*;
import java.util.Random;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ReservationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String trainNo = request.getParameter("trainNo");
        String classType = request.getParameter("classType");
        String date = request.getParameter("date");
        String from = request.getParameter("from");
        String to = request.getParameter("to");

        String trainName = trainNo.equals("12345") ? "Express Train" : "Superfast Train";
        String pnr = "PNR" + new Random().nextInt(100000);

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO reservations VALUES (?,?,?,?,?,?,?,?,?)"
            );

            ps.setString(1, pnr);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, trainNo);
            ps.setString(5, trainName);
            ps.setString(6, classType);
            ps.setString(7, date);
            ps.setString(8, from);
            ps.setString(9, to);

            ps.executeUpdate();
            response.sendRedirect("success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
