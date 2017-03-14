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
                return new EExes(1, "Разгибание ног сидя на тренажере");
            case 2:
                return new EExes(2, "Приседание со штангой");
            case 3:
                return new EExes(3, "Приседание в тренажере");
            case 4:
                return new EExes(4, "Жим ногами в тренажере");
            case 5:
                return new EExes(5, "Тяга штанги в наклоне");
            case 6:
                return new EExes(6, "Тяга гантель в наклоне");
            case 7:
                return new EExes(7, "ГиперЭкстензия");
            case 8:
                return new EExes(8, "Икры");
            case 9:
                return new EExes(9, "Пресс");
            case 10:
                return new EExes(10, "Жим штанги на наклоной скамье");
            case 11:
                return new EExes(11, "Жим гантелей на наклоной скамье");
            case 12:
                return new EExes(12, "Жим штанги стоя с груди");
            case 13:
                return new EExes(13, "Жим гантелей стоя с груди");
            case 14:
                return new EExes(14, "Бицепс");
            case 15:
                return new EExes(15, "Брусья");
            case 16:
                return new EExes(16, "Подтягивание широким хватом");
            case 17:
                return new EExes(17, "Тяга вертикального блока широким хватом");
            case 18:
                return new EExes(18, "Предплечье");
        }
        return null;
    }

    static EPodhod getPodhod(int id) {

        int razminka = 2;
        int count = 3;
        String max = "12,12,12";
        String min = "6,6,6";
        if (id == 7 || id == 8 || id == 9 || id == 18) {
            id=1;
            razminka = 0;
            count = 4;
            max = "50,50,50,50";
            min = "20,20,20,20";
            return new EPodhod(id, razminka, count, min, max);
        } else {
            id=2;
            return new EPodhod(id, razminka, count, min, max);
        }
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

    static EProg getProg(int id) {
        EProg prog = new EProg(1, "База");
        prog.addDay(getDay(1, 1));
        prog.addDay(getDay(1, 2));
        return prog;
    }
}
