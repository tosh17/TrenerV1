/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.eprogs;

/**
 *
 * @author a_scherbakov
 */
public class EPodhod {

    private int razminka;
    private int count;
    private int[] max;
    private int[] min;

    public EPodhod(int razminka, int count, int[] max, int[] min) {
        this.razminka = razminka;
        this.count = count;
        this.max = max;
        this.min = min;
    }

    public int[] getMin() {
        return min;
    }

    public void setMin(int[] min) {
        this.min = min;
    }

    public int getRazminka() {
        return razminka;
    }

    public void setRazminka(int razminka) {
        this.razminka = razminka;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getMax() {
        return max;
    }

    public void setMax(int[] max) {
        this.max = max;
    }

    @Override
    public String toString() {
        String str= "Р(" + razminka + ")" + " П=";
        for(int i =0;i<count;i++){
        str=str+"/"+min[i]+"-"+max[i];
        }
        return str;
    }

}
