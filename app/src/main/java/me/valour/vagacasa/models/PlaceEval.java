package me.valour.vagacasa.models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by alice on 6/22/15.
 */
public class PlaceEval extends SugarRecord<PlaceEval> {

    Place place;
    UserValue metric;
    Integer value;

    public PlaceEval(Place p, UserValue k, Integer value){
        this.place = p;
        this.metric = k;
        this.value = value;
    }

    public static List<PlaceEval> getAllEvals(Place p){
        return (List<PlaceEval>) PlaceEval.find(PlaceEval.class,
                "place = ?",
                p.getId().toString());
    }

}
