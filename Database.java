package DAO;

/**
 *
 * @author SEKHAR
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Vinay
 */
public class Database {
//     private static OracleDataSource ods;
//    static {
//        try{
//    ods=new OracleDataSource();
//    ods.setDriverType("thin");
//    ods.setNetworkProtocol("tcp");
//    ods.setPortNumber(1521);
//    }
//    catch(Exception ex){
//        System.out.println(ex);
//    }
    public Connection con;
    public Database()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void connect()
    {
    
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    }
    
//    public static Connection getConnection(){
//    
//        try {
//            ods.setUser("pranathi.2702");
//            ods.setPassword("pranu.27");
//            ods.setDatabaseName("xe");
//            ods.setServerName("xe");
//            return ods.getConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//

//    }