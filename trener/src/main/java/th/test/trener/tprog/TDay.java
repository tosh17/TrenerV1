/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.tprog;

import input.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import th.test.trener.bd.FactoryBD;
import th.test.trener.eprogs.EDay;
import th.test.trener.eprogs.EExes;

/**
 *
 * @author a_scherbakov
 */
public class TDay {

    EDay eDay;
    private Map<Integer, TExes> listExes = new HashMap<>();
  

    public TDay(EDay eDay) {
        this.eDay = eDay;
        setTExes();
        
    }

    private void setTExes() {
        for (int i = 1; i <= eDay.getCount(); i++) {
            TExes tExes = new TExes(eDay.getExes(i), eDay.getPodhod(i));
            listExes.put(i, tExes);
        }
    }

    public void start() {
        Console cons = new Console();

        for (int i = 1; i <= eDay.getCount(); i++) {
            System.out.println(eDay.getExes(i));
            System.out.println(eDay.getPodhod(i));
            while (!listExes.get(i).isDone()) {
                listExes.get(i).makeExes(cons.getInputInt("Кол раз"), cons.getInputInt("вес"));
            }
        }
    }

 
    }
