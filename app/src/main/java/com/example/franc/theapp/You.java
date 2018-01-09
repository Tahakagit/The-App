package com.example.franc.theapp;

import io.realm.RealmObject;

/**
 * Created by franc on 09/01/2018.
 */

public class You extends RealmObject {

    private String yourName;
    private int startLevel;

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public int getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(int startLevel) {
        this.startLevel = startLevel;
    }
}
