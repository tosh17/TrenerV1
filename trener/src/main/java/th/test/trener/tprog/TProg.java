/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.tprog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import th.test.trener.bd.FactoryBD;
import th.test.trener.eprogs.*;
import th.test.trener.user.Environment;

/**
 *
 * @author a_scherbakov
 */
public class TProg {

    static Logger log = LoggerFactory.getLogger("=TProg==");
    EProg eProg;
    TDay tDay;

    public TProg(int idProg, int lastDay) {
        eProg = FactoryBD.createBD().getProg(idProg);
        tDay = new TDay(getCurentDay(lastDay));

    }

    private EDay getCurentDay(int lastDay) {
        int i, j;
        i = lastDay % eProg.getCountDay() + 1;
        Environment.init().setCurrentProgDay(i);
        j = Environment.init().getCurrentProgDay();
        log.debug(Environment.init().toString());
        return eProg.getDay(j);
    }

    public void start() {
FactoryBD.createBD().writeLogT();
    log.debug("before TDay",Environment.init().toString());
    log.debug(Environment.init().toString());
        tDay.start();
    }
}
