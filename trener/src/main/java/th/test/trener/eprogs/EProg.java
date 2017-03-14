/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.eprogs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author a_scherbakov
 */
public class EProg {
    private int id;
    private String description;
    private int countDay=0;
    private Map<Integer, EDay> listDay = new HashMap<Integer, EDay>();

    public EProg(int id,  String description) {
        this.id = id;
        this.description = description;
       
    }
    public void addDay(EDay day){
      listDay.put(++countDay,day);
    } 

    @Override
    public String toString() {
       String str=description+System.lineSeparator();
       for(int i=1;i<=countDay;i++){
           str=str+listDay.get(i)+System.lineSeparator();
       } 
       return str;
    }
}
