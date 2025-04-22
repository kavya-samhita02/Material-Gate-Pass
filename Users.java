/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import Model.UserMaster;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vinay
 */
public class Users extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Users</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Users at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //   processRequest(request, response);
        String action = request.getParameter("action");
        if (action.equals("validate")) {

            String v_pwd = request.getParameter("passwd");
            String v_uname = request.getParameter("user_name");
            int v_username = Integer.parseInt(v_uname);
            //String v_pwd = request.getParameter("passwd");
            UserDAO ud = new UserDAO();
            UserMaster usrmstr = new UserMaster();
            usrmstr = ud.user_validate(v_username, v_pwd);
           

            if (usrmstr.getUser_name() == null) {

                request.setAttribute("loginResult", "Invalid Credentials");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
                requestDispatcher.forward(request, response);

            } else {

                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("user_name", usrmstr.getUser_name());
                httpSession.setAttribute("user_id", v_username);

                if (usrmstr.getHod().equals("N")) {
                    response.sendRedirect("gpcreate.jsp");
                } else if (usrmstr.getHod().equals("Y")) {
                    response.sendRedirect("gpclearance.jsp");
                }
            }

//            if (!usrmstr.getUser_name().equals("") || !(usrmstr.getUser_name() == null)) {
//
//                HttpSession httpSession = request.getSession();
//                httpSession.setAttribute("user_name", usrmstr.getUser_name());
//                httpSession.setAttribute("user_id", v_username);
//
//                if (usrmstr.getHod().equals("N")) {
//                    response.sendRedirect("gpcreate.jsp");
//                } else if (usrmstr.getHod().equals("Y")) {
//                    response.sendRedirect("gpclearance.jsp");
//                }
//
//            } else {
//
//                request.setAttribute("loginResult", "Invalid Credentials");
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
//                requestDispatcher.forward(request, response);
//            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}