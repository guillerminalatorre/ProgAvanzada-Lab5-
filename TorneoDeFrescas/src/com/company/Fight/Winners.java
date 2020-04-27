package com.company.Fight;

import com.company.Dao.WinnersDao;
import com.company.Model.Human;

public class Winners {
    private WinnersDao dao;

    public Winners(){
        this.dao = new WinnersDao();
    }

    public void addWinner(Human h){
        dao.addWinner(h);
    }

    public String getWinners() {
        return dao.getWinners();
    }
}
