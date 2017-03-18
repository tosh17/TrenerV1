/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.user;

/**
 *
 * @author shcherbakov
 */
public  class Environment {

    private static boolean inst = false;
    private static Environment env = null;

    private static int currentUser;
    private static int currentProg;
    private static int currentProgDay;
    private static int currentIdTLog;
    
    private Environment() {
    }

    static public Environment init() {
        if (!inst) {
            env = new Environment();
            return env;
        }
        return env;
    }

    public int getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }

    public int getCurrentProg() {
        return currentProg;
    }

    public void setCurrentProg(int currentProg) {
        this.currentProg = currentProg;
    }

    public int getCurrentProgDay() {
        return currentProgDay;
    }

    public void setCurrentProgDay(int currentProgDay) {
        this.currentProgDay = currentProgDay;
    }

    public int getCurrentIdTLog() {
        return currentIdTLog;
    }

    public void setCurrentIdTLog(int currentIdTLog) {
        this.currentIdTLog = currentIdTLog;
    }

    @Override
    public String toString() {
        return "Environment{" + "currentUser=" + currentUser + ", currentProg=" + currentProg + ", currentProgDay=" + currentProgDay + ", currentIdTLog=" + currentIdTLog + '}';
    }

}
