package com.vironit.bouquetService.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/logout" })


public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        final HttpSession session = request.getSession();

        session.removeAttribute("password");
        session.removeAttribute("email");
        session.removeAttribute("role");
        session.removeAttribute("cart");

        response.sendRedirect(request.getServletContext().getContextPath() + "/");
    }

}