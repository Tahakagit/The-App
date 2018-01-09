package com.example.franc.theapp;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Created by franc on 09/01/2018.
 */

public class RealmHelper {

    private Realm mRealm;

    public RealmHelper() {

    }

    public void addItem(final RealmObject item){

        try {
            mRealm = Realm.getDefaultInstance();
            mRealm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    realm.insertOrUpdate(item);
                }
            });
        } finally {
            if(mRealm != null) {
                mRealm.close();
            }
        }
    }

    public void delItem(final RealmObject item){

        try {
            mRealm = Realm.getDefaultInstance();
            mRealm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    item.deleteFromRealm();
                }
            });
        } finally {
            if(mRealm != null) {
                mRealm.close();
            }
        }
    }

    public RealmResults retrieveAllItem(){

        RealmResults result = null;
        try {
            mRealm = Realm.getDefaultInstance();
            //insert your query
        } finally {
            if(mRealm != null) {
                mRealm.close();
            }
        }
        return result;
    }

}
