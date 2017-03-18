/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.test.trener.user;

import th.test.trener.bd.FactoryBD;
import th.test.trener.tprog.TExes;
import th.test.trener.tprog.TProg;
import th.test.trener.util.UDate;

/**
 *
 * @author shcherbakov
 */
public class User {

    private String name;
    private String nick;
    private int id;
    private int startData;

    public User(int id) {
        User tmp = FactoryBD.createBD().getUser(id);
        this.name = tmp.getName();
        this.nick = tmp.getNick();
        this.id = tmp.getId();
        this.startData = tmp.getStartData();
    }

    public User(int id, FactoryBD.Metod metod) {
        User tmp = FactoryBD.createBD(metod).getUser(id);
        this.name = tmp.getName();
        this.nick = tmp.getNick();
        this.id = tmp.getId();
        this.startData = tmp.getStartData();
    }

    public User(String name, String nick) {
        this.name = name;
        this.nick = nick;
        this.startData = UDate.nowDate();
        save();
        this.id = FactoryBD.createBD().getUserByNick(nick).getId();

    }

    public User(int id, String name, String nick, int startData) {
        this.name = name;
        this.nick = nick;
        this.id = id;
        this.startData = startData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartData() {
        return startData;
    }

    public void setStartData(int startData) {
        this.startData = startData;
    }

    private final boolean save() {
        return FactoryBD.createBD().writeUser(this);

    }

    public boolean update() {
        return false;
    }

    public void start() {
        Environment.init().setCurrentUser(this.getId());
        int[] progDay = FactoryBD.createBD().findEProgIdByUser(id);
        if (progDay[0] == 0) {
            progDay[0] = 1;
            progDay[1] = 0;
        }
        Environment.init().setCurrentProg(progDay[0]);
        Environment.init().setCurrentProgDay(progDay[1]);
        TProg tProg=new TProg(progDay[0],progDay[1]);
        tProg.start();
    }

}
