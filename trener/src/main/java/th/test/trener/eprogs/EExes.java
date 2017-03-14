/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.eprogs;

import java.util.ArrayList;

/**
 *
 * @author a_scherbakov
 */
public class EExes {

    public EExes(int id, String name) {
        this.id = id;
        this.name = name;
            
    }

    @Override
    public String toString() {
        return "" + name ;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int id;
    String name;
    
  
}
