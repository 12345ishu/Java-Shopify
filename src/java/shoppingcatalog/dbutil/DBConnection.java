/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcatalog.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author a
 */
public class DBConnection {
    public static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded successfully");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-IFIF4D0:1521/XE","onlineshopping","shopping");
            
            
        }
        catch(Exception ex)
        {
            System.out.println("exception in openning connection"+ex);
            
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    

public static void closeConnection()
{
try
{
conn.close();
}
catch(Exception ex)
{
 System.out.println("exception in closing connection"+ex);

}
}
}

    

