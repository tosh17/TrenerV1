/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shcherbakov
 */
public class Console implements IntInput{

    @Override
    public int getInputInt(String str) {
    
    return Integer.parseInt(getInputString(str));
    }

    @Override
    public int getInputInt() {
        return Integer.parseInt(getInputString());
    }

    @Override
    public String getInputString() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          
            String line = reader.readLine();
            return line;
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }

    @Override
    public String getInputString(String str) {
         System.out.println(str);
         return getInputString();
    }
    
}
