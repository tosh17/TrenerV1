/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import th.test.trener.eprogs.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a_scherbakov
 */
public class SQLiteBD implements IntBD {

    private static Connection conn;
    private static Statement statmt;
    private static ResultSet resSet;
    private static PreparedStatement pstmt = null;
    
    private static boolean stat = true;
    static IntBD db;

    private SQLiteBD() {
    }

    public static IntBD init() {
        if (stat) {
            stat = false;
            db = new SQLiteBD();
        }
        return db;
    }

    @Override
    public EExes getExes(int id) {
        try {
          //  resSet = statmt.executeQuery("SELECT * FROM e_exes");
            pstmt = conn.prepareStatement("SELECT * FROM e_exes where id=?");
            pstmt.setInt(1, id);
            resSet= pstmt.executeQuery();
            while (resSet.next()) {
                int id1 = resSet.getInt("id");
                String name = resSet.getString("name");
                System.out.println("ID = " + id1);
                System.out.println("name = " + name);
                System.out.println();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public EDay getDay(int id, int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EProg getProg(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void connect() {
        try {
            conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:tren.db");
            statmt = conn.createStatement();
            System.out.println("База Подключена!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLiteBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
