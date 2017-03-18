/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import java.util.ArrayList;
import th.test.trener.eprogs.*;
import th.test.trener.tprog.*;
import th.test.trener.user.User;

/**
 *
 * @author a_scherbakov
 */
public interface IntBD {

    /**
     * @return Соединяется с базой даных Выполняется при иницилизации
     * автоматически
     *
     */
    public boolean connect();

    public boolean disconnect();

    public EExes getExes(int id);
    public boolean writeExes(EExes exes);

    public EPodhod getPodhod(int id);
    public boolean writePodhod(EPodhod podhod);

    public EDay getDay(int id, int number);
    public boolean writeDay(EDay day);

    public EProg getProg(int id);
    public boolean writeProg(EProg prog);

 //   public boolean writeTExes(int[] write);
    
    public User getUser(int id);
    public User getUserByNick(String nick);
    public boolean writeUser(User user);
    public boolean updateUser(User user);

}
