package me.valour.vagacasa.models;

import com.orm.SugarRecord;

/**
 * Created by alice on 6/22/15.
 */
public class UserValue extends SugarRecord<UserValue> {
    String name;
    Integer scale;
    Integer multiplier;

    Hunt hunt;

   public UserValue(String name, Integer scale, Integer multiplier){
       this.name = name;
       this.scale = scale;
       this.multiplier = multiplier;

       this.hunt = null;
   }

   public void setHunt(Hunt hunt){
       this.hunt = hunt;

   }

}
