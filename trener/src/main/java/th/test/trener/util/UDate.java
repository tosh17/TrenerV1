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

    private static int getNowSec() {

        Date date = new Date();
        return (int) (date.getTime() / 1000 + Cfg.getUtc() * 3600);
    }

    public static int nowDate() {

        return getNowSec() / (60 * 60 * 24);

    }

    public static int nowTime() {

        return getNowSec() % (60 * 60 * 24);
    }

    public static String intDataToString(int i) {
        Date date = new Date(((long)i * 24 - Cfg.getUtc()) * 3600000);

        return date.toString();
    }

    public static String dataString(int i) {
        Date date = new Date(((long)i * 24 - Cfg.getUtc()) * 3600000);
        Calendar myCal = new GregorianCalendar();
        myCal.setTime(date);
        String str="";
        
        str=myCal.get(Calendar.DAY_OF_MONTH)+"-";
        if(myCal.get(Calendar.MONTH)<9)   {
        str+="0";
        }  
        str+=(myCal.get(Calendar.MONTH)+1)+"-"+myCal.get(Calendar.YEAR);
        return str;
    }
  public static String timeString(int i) {
        Date date = new Date((i  - Cfg.getUtc()*3600) * 1000);
        Calendar myCal = new GregorianCalendar();
        myCal.setTime(date);
        String str="";
        if(myCal.get(Calendar.HOUR_OF_DAY)<10)   {
        str+="0";
        } 
        str=myCal.get(Calendar.HOUR_OF_DAY)+":";
        if(myCal.get(Calendar.MINUTE)<10)   {
        str+="0";
        }  
        str+=myCal.get(Calendar.MINUTE)+":";
        if(myCal.get(Calendar.SECOND)<10)   {
        str+="0";
        }  str+=myCal.get(Calendar.SECOND);
        return str;
    }
    public static class Cfg {

        private static int utc = 3;

        public static int getUtc() {
            return utc;
        }

        public void setUtc(int utc) {
            this.utc = utc;
        }
    }
}
