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
  /**
   * Возращает интерфейс для работы с БД
   * @param  metod 
   *  
   * @return 
   */
    public static IntBD createBD(Metod metod) {
        switch(metod){
            case Collection:
                return CollectionBD.init();
            case SQLite:
                return SQLiteBD.init();
        }
        return null;
    }

    public enum Metod {
        /**
         * Метод для статичной коллекции
         * @serial  
         * 
         */
        
        Collection, 
        /**
         * Метод для работы с базой sqllite
         * @serial 
         * 
         */
        SQLite;

    }
}
