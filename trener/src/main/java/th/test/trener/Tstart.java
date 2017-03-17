/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener;

import input.Console;
import th.test.trener.bd.CollectionBD;
import th.test.trener.bd.*;
import th.test.trener.eprogs.EDay;
import th.test.trener.eprogs.EProg;
import th.test.trener.tprog.TProg;
import th.test.trener.util.UDate;

/**
 *
 * @author a_scherbakov
 */
public class Tstart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Console cons=new Console();
       int i=cons.getInputInt("Введите номер дня");
       EDay day=FabricBD.createBD(FabricBD.Metod.SQLite).getDay(1, i);
       System.out.println(day);
       TProg tprog=new TProg(FabricBD.createBD(FabricBD.Metod.SQLite).getProg(1));
       tprog.start();
    }

}
