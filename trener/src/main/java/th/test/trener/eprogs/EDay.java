/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.eprogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author a_scherbakov
 */
public class EDay {
    private int idProg;
    private int numberOfDay;
    private String description;
    private Map<Integer, EExes> listExes= new HashMap<>();
    private Map<Integer, EPodhod> listPodhod= new HashMap<>();
    int count;

    public EDay(int idProg, int numberOfDay, String description) {
        this.idProg = idProg;
        this.numberOfDay = numberOfDay;
        this.description = description;
        count=0;
    }

   public void addExes(EExes exes,EPodhod podhod){
       count++;
       listExes.put(count,exes);
       listPodhod.put(count, podhod);
   }

  
    @Override
    public String toString() {
        String str;
        str="День " +numberOfDay + System.lineSeparator();
        str=str + description + System.lineSeparator();
        for(int i=1;i<=count;i++){
        str=str + i+" " +listExes.get(i)+"  "+listPodhod.get(i)+System.lineSeparator();
        }
      
        return str;
    }
    
}
