/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.bd;

import java.util.ArrayList;
import java.util.List;
import th.test.trener.eprogs.*;

/**
 *
 * @author a_scherbakov
 */
public class CollExes {

    static EExes getExes(int id) {

        switch (id) {
            case 1:
                return new EExes(1, "Разгибание ног сидя на тренажере", 1);
            case 2:
                return new EExes(2, "Приседание со штангой", 2);
            case 3:
                return new EExes(3, "Приседание в тренажере", 2);
            case 4:
                return new EExes(4, "Жим ногами в тренажере", 2);
            case 5:
                return new EExes(5, "Тяга штанги в наклоне", 5);
            case 6:
                return new EExes(6, "Тяга гантель в наклоне", 5);
            case 7:
                return new EExes(7, "ГиперЭкстензия", 7);
            case 8:
                return new EExes(8, "Икры", 8);
            case 9:
                return new EExes(9, "Пресс", 9);
            case 10:
                return new EExes(10, "Жим штанги на наклоной скамье", 10);
            case 11:
                return new EExes(11, "Жим гантелей на наклоной скамье", 10);
            case 12:
                return new EExes(12, "Жим штанги стоя с груди", 12);
            case 13:
                return new EExes(13, "Жим гантелей стоя с груди", 12);
            case 14:
                return new EExes(14, "Бицепс", 14);
            case 15:
                return new EExes(15, "Брусья", 15);
            case 16:
                return new EExes(16, "Подтягивание широким хватом", 16);
            case 17:
                return new EExes(17, "Тяга вертикального блока широким хватом", 16);
                 case 18:
                return new EExes(18, "Предплечье", 18);
        }
        return null;
    }

    static EPodhod getPodhod(int id) {
        int razminka = 2;
        int count = 3;
        int[] max = {12, 12, 12, 12};
        int[] min = {6, 6, 6, 6};
        return new EPodhod(razminka, count, max, min);
    }

    static EDay getDay(int id, int number) {
 EDay day;

        switch (id) {
            case 1:

                switch (number) {
                    case 1:
                        day = new EDay(1, 1, "Ноги и Спина");
                        int temp[] = {1, 3, 4, 16, 6, 7, 8, 9};
                        
                        for (int i : temp) {
                            day.addExes(getExes(i), getPodhod(i));
                        }
                        return day;
                    case 2:
                        day = new EDay(1, 2, "Грудь и Плечи");
                        int temp1[] = {10, 11, 13, 14, 15, 18, 7, 9};
                        for (int i : temp1) {
                            day.addExes(getExes(i), getPodhod(i));
                        }
                        return day;

                }
        }
        return null;
    }
    static EProg getProg(int id){
    EProg prog=new EProg(1,"База");
    prog.addDay(getDay(1,1));
    prog.addDay(getDay(1,2));
    return prog;
    }
}
