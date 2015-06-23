package me.valour.vagacasa.models;

import com.orm.SugarRecord;

import java.util.Calendar;
import java.util.List;

/**
 * Created by alice on 6/22/15.
 */
public class Hunt extends SugarRecord<Hunt> {

        Integer minPrice;
        Integer maxPrice;

        Calendar startSearchDate;
        Calendar endSearchDate;

    public Hunt(){
        minPrice = 0;
        maxPrice = Integer.MAX_VALUE;

        startSearchDate = Calendar.getInstance();
        endSearchDate = null;

    }

    public Hunt(Integer minPrice, Integer maxPrice, Calendar startSearchDate, Calendar endSearchDate){
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;

        this.startSearchDate = startSearchDate;
        this.endSearchDate = endSearchDate;

    }

    public void setUserValues(List<UserValue> values){
        for(UserValue v: values){
            v.hunt = this;
            v.save();
        }

    }

}
