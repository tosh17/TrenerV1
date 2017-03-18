/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.tprog;

import java.util.ArrayList;
import th.test.trener.bd.FactoryBD;
import th.test.trener.eprogs.*;
import th.test.trener.util.UDate;

/**
 *
 * @author a_scherbakov
 */
public class TExes {

    private int id;
    private EExes exes;
    private EPodhod podhod;

    private int razminka, count;
    private int countRazminka[], countCount[], weightRazminka[], weightCount[];
    private int[] write = {1,0,0,0,0,0,0,0};
    boolean done;

    public TExes(EExes exes, EPodhod podhod) {

        this.exes = exes;
        this.podhod = podhod;
        done = false;
        int t1 = podhod.getRazminka();
        int t2 = podhod.getCount();
        countRazminka = new int[t1];
        countCount = new int[t2];
        weightRazminka = new int[t1];
        weightCount = new int[t2];
        razminka = 0;
        count = 0;
        
        
    }

    public boolean isDone() {
        return done;
    }

    private boolean isRazminka() {
        return podhod.getRazminka() <= razminka;
    }

    public boolean isCount() {
        if (podhod.getCount() <= count) {
            done = true;
            return true;
        }
        return false;
    }

    public void makeExes(int count, int weight) {
        if (!isRazminka()) {
            countRazminka[razminka] = count;
            weightRazminka[razminka] = weight;
            razminka++;
//            save(UDate.nowDate(),UDate.nowTime(),)
        } else {
            countCount[this.count] = count;
            weightCount[this.count] = weight;
            this.count++;
            isCount();
        }
    }

    float progress;

//    public boolean save(int date,int time,int id_day,int id_exes) {
//        return FactoryBD.createBD().writeTExes(write);
//    }
    
}
