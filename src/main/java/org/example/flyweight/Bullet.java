package org.example.flyweight;

public class Bullet {
    private String direction;
    private int speed;
    private String currCoordinates;
    private String targetCoordinates;
    private BulletType bulletType;

    public Bullet(BulletType bulletType, String direction, int speed, String currCoordinates, String targetCoordinates) {
        this.direction = direction;
        this.speed = speed;
        this.currCoordinates = currCoordinates;
        this.targetCoordinates = targetCoordinates;
        this.bulletType =bulletType;
    }
    public void fire(){
        System.out.println("bullet fired with "+speed+" speed");
    }
}
