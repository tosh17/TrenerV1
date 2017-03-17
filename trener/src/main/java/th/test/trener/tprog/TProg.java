/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.tprog;

import th.test.trener.eprogs.*;

/**
 *
 * @author a_scherbakov
 */
public class TProg {

    EProg eProg;
    TDay tDay;

    public TProg(EProg eProg) {
        this.eProg = eProg;
        tDay=new TDay(getCurentDay(getLastDay()));
    }

    private int getLastDay() {
        return 2;
    }

    private EDay getCurentDay(int lastDay) {

        return eProg.getDay(lastDay % eProg.getCountDay() + 1);
    }
    public void start(){
      tDay.start();
    }
}
