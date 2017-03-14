/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener;

import th.test.trener.bd.CollectionBD;
import th.test.trener.bd.*;

/**
 *
 * @author a_scherbakov
 */
public class Tstart {

    /**
     * @param args the command line arguments
     */
    static IntBD base,base1;


    public static void main(String[] args) {
        // TODO code application logic here
     base1 = FabricBD.createBD(FabricBD.Metod.Collection);
       System.out.println(base1.getProg(1));
          base = FabricBD.createBD(FabricBD.Metod.SQLite);
         base.connect();
         base.writeDay(base1.getDay(1,2));
     
    }

}
