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

    public EExes(int id, String name, int idAnalog) {
        this.id = id;
        this.name = name;
        this.idAnalog = idAnalog;
        
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

    public int getIdAnalog() {
        return idAnalog;
    }

    public void setIdAnalog(int idAnalog) {
        this.idAnalog = idAnalog;
    }

    int id;
    String name;
    int idAnalog;
  
}