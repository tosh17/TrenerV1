/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import java.util.ArrayList;
import th.test.trener.eprogs.*;

/**
 *
 * @author a_scherbakov
 */
public interface IntBD {
   
    public boolean connect();
    public boolean disconnect();
    
    
    public EExes getExes(int id);
    public EPodhod getPodhod(int id);
    public EDay getDay(int id,int number);
    public EProg getProg(int id);
       
    public boolean writeProg(EProg prog);
    public boolean writeDay(EDay day);
    public boolean writeExes(EExes exes);
    public boolean writePodhod(EPodhod podhod);
    
}
