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
import th.test.trener.eprogs.EProg;

/**
 *
 * @author a_scherbakov
 */
public class CollectionBD implements IntBD {

    static boolean stat = true;
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
    public void connect() {
      //не требуется
    }

}
