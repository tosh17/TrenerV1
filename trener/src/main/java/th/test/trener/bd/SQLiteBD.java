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

    private static boolean stat = true;
    private static IntBD db;

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
        ResultSet resSet;
        PreparedStatement pstmt = null;

        try {
            //  resSet = statmt.executeQuery("SELECT * FROM e_exes");
            pstmt = conn.prepareStatement("SELECT * FROM e_exes where id=?");
            pstmt.setInt(1, id);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                String name = resSet.getString("name");
                return new EExes(id, name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return null;
    }

    @Override
    public EDay getDay(int id, int number) {
        ResultSet resSet;
        PreparedStatement pstmt = null;
        try {
            EDay day = null;
            pstmt = conn.prepareStatement("SELECT * FROM e_day where id_prog=? and number_day=?");
            pstmt.setInt(1, id);
            pstmt.setInt(2, number);
            resSet = pstmt.executeQuery();
            int idOfDay = -1;
            while (resSet.next()) {
                idOfDay = resSet.getInt("id");
                String description = resSet.getString("description");
                day = new EDay(id, number, description);
                day.setIdOfDay(idOfDay);
            }
            //поиск упражнений
            pstmt = conn.prepareStatement("SELECT * FROM e_day_exes where id_day=?");
            pstmt.setInt(1, idOfDay);
            resSet = pstmt.executeQuery();

            while (resSet.next()) {
                int idExes = resSet.getInt("id_exes");
                int idPodhod = resSet.getInt("id_podhod");
                day.addExes(getExes(idExes), getPodhod(idPodhod));
            }
            return day;

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public EProg getProg(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean connect() {
        try {
            conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:tren.db");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean writeProg(EProg prog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeDay(EDay day) {
        ResultSet resSet;
        PreparedStatement pstmt = null;
        try {
            if (getDay(day.getIdProg(), day.getNumberOfDay()) != null) {
                return false;
            } else {

                pstmt = conn.prepareStatement("insert into e_day (id_prog,number_day,description) " + "VALUES (?,?,?)");
                pstmt.setInt(1, day.getIdProg());
                pstmt.setInt(2, day.getNumberOfDay());
                pstmt.setString(3, day.getDescription());
                int rowCount = pstmt.executeUpdate();
                int idOfDay = getDay(day.getIdProg(), day.getNumberOfDay()).getIdOfDay();
                for (int i = 1; i <= day.getCount(); i++) {
                    pstmt = conn.prepareStatement("insert into e_day_exes  " + "VALUES (?,?,?)");
                    pstmt.setInt(1, idOfDay);
                    pstmt.setInt(2, day.getExes(i).getId());
                    pstmt.setInt(3, day.getPodhod(i).getId());
                    writeExes(day.getExes(i));
                    writePodhod(day.getPodhod(i));
                    rowCount = pstmt.executeUpdate();

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean writeExes(EExes exes) {
        ResultSet resSet;
        PreparedStatement pstmt = null;
        try {
            if (getExes(exes.getId()) != null) {
                return false;
            } else {

                pstmt = conn.prepareStatement("INSERT INTO `e_exes` " + "VALUES (?,?)");
                pstmt.setInt(1, exes.getId());
                pstmt.setString(2, exes.getName());
                int rowCount = pstmt.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean writePodhod(EPodhod podhod) {
        ResultSet resSet;
        PreparedStatement pstmt = null;
        try {
            if (getPodhod(podhod.getId()) != null) {
                return false;
            } else {

                pstmt = conn.prepareStatement("INSERT INTO `e_podhod` " + "VALUES (?,?,?,?,?)");
                pstmt.setInt(1, podhod.getId());
                pstmt.setInt(2, podhod.getRazminka());
                pstmt.setInt(3, podhod.getCount());
                pstmt.setString(4, podhod.getStrMin());
                pstmt.setString(5, podhod.getStrMax());
                int rowCount = pstmt.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public EPodhod getPodhod(int id) {
        ResultSet resSet;
        PreparedStatement pstmt = null;
        try {
            //  resSet = statmt.executeQuery("SELECT * FROM e_exes");
            pstmt = conn.prepareStatement("SELECT * FROM e_podhod where id=?");
            pstmt.setInt(1, id);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                String min = resSet.getString("min");
                String max = resSet.getString("min");
                int razminka = resSet.getInt("razminka");
                int count = resSet.getInt("count");
                return new EPodhod(id, razminka, count, min, max);

            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteBD.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

}
