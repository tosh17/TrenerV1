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
public class FactoryBD {

    private static Metod defMetod = Metod.SQLite;

    private FactoryBD() {
    }

    /**
     * Установка Метода по умолчани
     * не допустимо использование Collection
     * @param metod
     * @return 
     */
    public static boolean setDefault(Metod metod) {
        if ( metod == Metod.Collection) {
            return false;
        } else {
            defMetod = metod;
            return true;
        }

    }

    /**
     * Возращает интерфейс для работы с БД
     *
     * @param metod
     *
     * @return
     */
    public static IntBD createBD(Metod metod) {
        switch (metod) {
            case Collection:
                return CollectionBD.init();
            case SQLite:
                return SQLiteBD.init();
        }
        return null;
    }
   
   /**
    * Используется для создания базы поумолчанию
    * Так же эта база используется для записи выполняемых упражнений
    * @return 
    */ 
   public static IntBD createBD(){
   return createBD(defMetod);
   }
    public enum Metod {
        /**
         * Метод для статичной коллекции
         *
         * @serial
         *
         */

        Collection,
        /**
         * Метод для работы с базой sqllite
         *
         * @serial
         *
         */
        SQLite;

    }
}
