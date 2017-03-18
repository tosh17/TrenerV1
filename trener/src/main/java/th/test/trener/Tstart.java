/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener;


import th.test.trener.user.User;
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
//       Console cons=new Console();
//       int i=cons.getInputInt("Введите номер дня");
//       EDay day=FactoryBD.createBD(FactoryBD.Metod.SQLite).getDay(1, i);
//       System.out.println(day);
//       TProg tprog=new TProg(FactoryBD.createBD(FactoryBD.Metod.SQLite).getProg(1));
//       tprog.start();

    User tosh=new User(3);
    System.out.println(UDate.nowDate());
    System.out.println(UDate.dataString(UDate.nowDate()));
     System.out.println(UDate.timeString(UDate.nowTime()));
    }

}
