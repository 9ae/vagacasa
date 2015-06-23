package me.valour.vagacasa.models;

import com.orm.SugarRecord;

/**
 * Created by alice on 6/22/15.
 */
public class Place extends SugarRecord<Place> {

    String provider;
    String providerId;

    Integer price;
    Integer status; // 0 : bookmarked, 1: contacted: 2: seen, -1 :removed

    Agent agent;

    String address;

    Hunt hunt;


}
