/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO_1;
import Model.gpcreation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinay
 */
public class Users1 extends HttpServlet {

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
         //SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
       
        if (action.equals("push")) {
//            Date v_date1=null;
//            try {
//                v_date1 = formatter.parse(request.getParameter("creation_date"));
//            } catch (ParseException ex) {
//                Logger.getLogger(Users1.class.getName()).log(Level.SEVERE, null, ex);
//            }
             gpcreation gcreate=new gpcreation();
           gcreate.setCreation_date(request.getParameter("creation_date"));
            gcreate.setGp_type(request.getParameter("Gp_type"));
            gcreate. setGate_name(request.getParameter("Gate_name"));
            gcreate.setVhcl_no(request.getParameter("Vhcl_no"));
            gcreate.setDestination(request.getParameter("Destination"));
           gcreate.setAgency_name(request.getParameter("Agency_name"));
           gcreate.setAgency_address(request.getParameter("agency_address"));
          // gcreate.setGp_no("Gp_no");
            //String dateInString="28-Aug-2024";
           
           
            
                  //  int g = Integer.parseInt(v_gate_pass_no);
            
            UserDAO_1 ud = new UserDAO_1();
           
            try {
                int gpno =  ud.getGpNo();
                ud.users1_push(gcreate);
             
              
               request.setAttribute("gpno",String.valueOf(gpno));
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("gpcreate.jsp");
                requestDispatcher.forward(request, response);

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
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
//                requestDispatcher.forward(request, response);
//            }
            } catch (SQLException ex) {
                Logger.getLogger(Users1.class.getName()).log(Level.//                request.setAttribute("loginResult", "Invalid Credentials");
SEVERE, null, ex);
            }
           
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