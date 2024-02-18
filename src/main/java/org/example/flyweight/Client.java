package org.example.flyweight;

public class Client {
    public static void main(String[] args) {
        BulletType bulletType = new BulletType(0.2, "Gold", 0.5, "shortBulletImage");
        FlyWeight flyWeight = new FlyWeight();
        flyWeight.addBulletType("0.2ShortBullet", bulletType);
        BulletType bulletType1 = flyWeight.getBulletType("0.2ShortBullet");
        Bullet bullet = new Bullet(bulletType1, "east", 100, "x,y", "x+10,y+10");
        bullet.fire();
    }
}
