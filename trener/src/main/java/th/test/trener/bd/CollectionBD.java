/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import th.test.trener.bd.CollExes;
import java.util.ArrayList;
import th.test.trener.bd.IntBD;
import th.test.trener.eprogs.EDay;
import th.test.trener.eprogs.EExes;
import th.test.trener.eprogs.EPodhod;
import th.test.trener.eprogs.EProg;
import th.test.trener.tprog.TExes;
import th.test.trener.user.User;

/**
 *
 * @author a_scherbakov
 */
public class CollectionBD implements IntBD {

    private static boolean stat = true;
    static IntBD db;

    private CollectionBD() {
    }

    public static IntBD init() {
        if (stat) {
            stat = false;
            db = new CollectionBD();
        }
        return db;
    }

    @Override
    public EExes getExes(int id) {
        return CollExes.getExes(id);
    }

    @Override
    public EDay getDay(int id, int number) {
        return CollExes.getDay(id, number);
    }

    @Override
    public EProg getProg(int id) {
        return CollExes.getProg(id);
    }

    @Override
    public boolean connect() {
      //не требуется
      return true;
    }

    @Override
    public boolean writeProg(EProg prog) {
      //не требуется
       return false;
    }

    @Override
    public boolean writeDay(EDay day) {
       //не требуется
       return false;
    }

    @Override
    public boolean writeExes(EExes exes) {
       //не требуется
       return false;
    }

    @Override
    public boolean writePodhod(EPodhod podhod) {
     //не требуется
       return false;
    }

    @Override
    public EPodhod getPodhod(int id) {
        return CollExes.getPodhod(id);
    }

    @Override
    public boolean disconnect() {
        //не требуется
       return true;
    }

    @Override
    public User getUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserByNick(String nick) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] findEProgIdByUser(int idUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeLogT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeTExes(int[] write) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
