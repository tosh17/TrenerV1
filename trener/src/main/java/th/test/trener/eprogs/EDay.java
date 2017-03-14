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
    private int idOfDay;
    private int idProg;
    private int numberOfDay;
    private String description;
    private Map<Integer, EExes> listExes= new HashMap<>();
    private Map<Integer, EPodhod> listPodhod= new HashMap<>();
    private int count;

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
        str="День " +getNumberOfDay() + System.lineSeparator();
        str=str + getDescription() + System.lineSeparator();
        for(int i=1;i<=count;i++){
        str=str + i+" " +listExes.get(i)+"  "+listPodhod.get(i)+System.lineSeparator();
        }
      
        return str;
    }

    /**
     * @return the idProg
     */
    public int getIdProg() {
        return idProg;
    }

    /**
     * @param idProg the idProg to set
     */
    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }

    /**
     * @return the numberOfDay
     */
    public int getNumberOfDay() {
        return numberOfDay;
    }

    /**
     * @param numberOfDay the numberOfDay to set
     */
    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

   public EExes getExes(int number){
   return listExes.get(number);
   }
public EPodhod getPodhod(int number){
   return listPodhod.get(number);
   }
    public int getCount() {
        return count;
    }

    public int getIdOfDay() {
        return idOfDay;
    }

    public void setIdOfDay(int idOfDay) {
        this.idOfDay = idOfDay;
    }
    
}
