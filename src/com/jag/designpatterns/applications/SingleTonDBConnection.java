package com.jag.designpatterns.applications;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleTonDBConnection {

	public static void main(String[] args) {
		
		DBConnection dbConnection = DBConnection.getInstance();
		Connection connection =dbConnection.openConnection();
		
		
		
	}
	
}



class DBConnection {
    private static DBConnection dbConnectionSingleton = null;
    private static Connection conn = null;
    private boolean flag = true;
 
    /** A private Constructor prevents any other class from instantiating. */
    private DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } 
        catch (Exception e) {
            flag = false;
        } 
        
        
        if (flag) {
            openConnection();
        }
    }
    
    /** Static 'instance' method */
    public static DBConnection getInstance() {
    	
    	
        if (dbConnectionSingleton == null) {
            dbConnectionSingleton = new DBConnection();
        }
        return dbConnectionSingleton;
    }
    
    
    
     
    public Connection openConnection() {
    	//If 'conn' is null, then initaialize new one
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3309/db", "senecaBBB", "db");
            } 
            catch (SQLException e) {
                flag = false;
            }
        }
        
        //otherwise, return old one
        return conn;
    }
    
 
    public boolean getConnectionStatus() {
        return flag;
    }
    
}