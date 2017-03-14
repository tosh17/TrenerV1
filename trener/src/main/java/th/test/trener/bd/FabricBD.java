/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

/**
 *
 * @author a_scherbakov
 */
public class FabricBD {

    private FabricBD() {
    }

    public static IntBD createBD(Metod metod) {
        switch(metod){
            case Collection:
                return CollectionBD.init();
        }
        return null;
    }

    public enum Metod {
        Collection, SQLite;

    }
}
