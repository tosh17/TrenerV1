/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author shcherbakov
 */
public class UDate {

    private UDate() {
        GregorianCalendar calendar;
        calendar = new GregorianCalendar(1975,
                Calendar.DECEMBER, 31);
    }
    private static long getNowSec(int utc){
    Date date = new Date();
    return date.getTime()/ 1000 +utc*3600;
    }
    public static long nowDate(int utc) {
               
        return getNowSec(utc)/ ( 60 * 60 * 24);
       
    }

    public static long nowTime(int utc) {
 
        return getNowSec(utc) % ( 60 * 60 * 24);
    }

    public static String intDataToString(long i,int utc) {
        Date date = new Date((i*24-utc)*3600000);
        
        return date.toString();
    }
}
