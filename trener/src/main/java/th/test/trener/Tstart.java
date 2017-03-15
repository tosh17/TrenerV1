/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener;

import th.test.trener.bd.CollectionBD;
import th.test.trener.bd.*;
import th.test.trener.eprogs.EProg;
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
        EProg prog = EProg.load(1, FabricBD.Metod.Collection);
        System.out.println(prog);
        prog.save(FabricBD.Metod.SQLite);
    }

}
