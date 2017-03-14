/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener;

import th.test.trener.bd.CollectionBD;
import th.test.trener.bd.IntBD;

/**
 *
 * @author a_scherbakov
 */
public class Temp {
    IntBD base2;
    public Temp(IntBD base){
            base2 = CollectionBD.init();
        if (base == base2) {
            System.out.println("yyyyyy");
        } else {
            System.out.println("nnnnn");
        }
    }
}
