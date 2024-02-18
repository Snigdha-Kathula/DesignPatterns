package org.example.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FlyWeight {
    HashMap<String, BulletType> map = new HashMap<>();

    public String addBulletType(String nameOfBulletType, BulletType bulletType) {
        if(!map.containsKey(nameOfBulletType)){
            return "BulletType Already Exist";
        }
         map.put(nameOfBulletType, bulletType);
        return "Successfully added new Bullet Type";
    }
    public BulletType getBulletType(String nameOfBulletType) {
        return map.get(nameOfBulletType);
    }
}
