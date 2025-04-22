/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.UserMaster;
import Model.gpcreation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import java.sql.DriverManager;

/**
 *
 * @author Vinay
 */
public class UserDAO_1 {
public PreparedStatement pStmt;
    //private Connection dbConnection;
Database dba = new Database();
    public UserDAO_1() {
        //dbConnection = Database.connect();
        dba.connect();
    }

    public void users1_push(gpcreation gc) throws SQLException {

//        String user_name = "";
        gpcreation gcreate = new gpcreation();
        UserDAO_1 ud1=new UserDAO_1();
       
         String ins_query = "insert into GP_CREATION (CREATION_DATE,GP_TYPE,GATE_NAME,VHCL_NO,DESTINATION,AGENCY_NAME,AGENCY_ADDRESS,GP_STATUS,GP_NO) values(to_date('" + gc.getCreation_date() + "','DD/MM/RRRR'),'" + gc.getGp_type() + "','" + gc.getGate_name() + "','" + gc.getVhcl_no() + "','" + gc.getDestination() + "','" + gc.getAgency_name() + "','" + gc.getAgency_address() + "','DRAFT','"+gc.getGp_no()+"')";
            pStmt = dba.con.prepareStatement(ins_query);
            pStmt.executeUpdate();
//            ResultSet rs = pStmt.executeQuery(ins_query);
//            while (rs.next()) {
//         gcreate.setCreation_date((rs.getDate("CREATION_DATE")));
//             gcreate.setGp_type(rs.getInt("GP_TYPE"));
////               gcreate.setExpected_retn_dt(rs.getInt("EXPECTED_RETN_DT"));
//               gcreate.setCleared_by(rs.getInt("CLEARED_BY"));
//               gcreate.setCleared_date(rs.getInt("CLEARED_DATE"));
//               gcreate.setGp_remarks(rs.getString("GP_REMARKS"));
    }
            public int getGpNo() {
                
            
int gpno=0;
//        String user_name = "";
      // gpcreation gcreate = new gpcreation();
        try {
            String select_query1 = "select GP_NO from GP_NO";
            Statement stmt = dba.con.createStatement();
            ResultSet rs = stmt.executeQuery(select_query1);
            while (rs.next()) {
           //  request.setAttribute("Gp_no");
           gpno = rs.getInt("GP_NO");
            }
            dba.con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return gpno;
//              
//            }
          
        
        //return ud1;
    }
            public void update_GpNo() throws SQLException{
                
               
              int gpno =   getGpNo();
              gpno++;
                String update_query="UPDATE GP_NO SET GP_NO ='" + gpno + "'";
                    
                pStmt = dba.con.prepareStatement(update_query);
            pStmt.executeUpdate();
                
    }
}

            
                
            
            
//     public String get_hod(int user_id) throws SQLException {
//        String dept_cd;
//      String select_query = "SELECT HOD FROM DIPLOMA_USER_MASTER WHERE user_id='" + user_id + "'";
//
//            Statement stmt = dbConnection.createStatement();
//            ResultSet rs = stmt.executeQuery(select_query);
//
//            if (rs.next()) {
//                dept_cd = rs.getString("dept_code");
//            } else {
//                dept_cd = "00";
//            }
//            dbConnection.close();
//            return dept_cd;
//    }
//