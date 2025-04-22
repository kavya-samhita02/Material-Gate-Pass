package DAO;

import Model.UserMaster;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vinay
 */
public class UserDAO {

    //private Connection dbConnection;
Database dba = new Database();
    public UserDAO() {
       // dbConnection = Database.connect();
        dba.connect();
    }

    public UserMaster user_validate(int user_id, String password) {

//        String user_name = "";
        UserMaster usrmstr = new UserMaster();
        try {
            String select_query = "select USER_NAME,DEPT_CODE,HOD from user_master where user_id='" + user_id + "' and password='" + password + "'";
            Statement stmt = dba.con.createStatement();
            ResultSet rs = stmt.executeQuery(select_query);
            while (rs.next()) {
               usrmstr.setUser_name(rs.getString("USER_NAME"));
               usrmstr.setDept_code(rs.getInt("DEPT_CODE"));
               usrmstr.setHod(rs.getString("HOD"));
            }
            dba.con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return usrmstr;
    }
    
    public String get_hod(int user_id) throws SQLException {
   //  String dept_cd;
     String select_query1 = "SELECT HOD FROM USER_MASTER WHERE user_id='" + user_id + "'";
//
          Statement stmt = dba.con.createStatement();
         ResultSet rs = stmt.executeQuery(select_query1);
//
     //    if (rs.next()) {
//                dept_cd = rs.getString("dept_code");
//            } else {
//                dept_cd = "00";
//            }
//            dbConnection.close();
//            return dept_cd;   
   // }
//}

//    

