package org.example.bridge;

public class Client {
    public static void main(String[] args) {
        ShapeColorBridge shapeColorBridge = new ColoredCircle(new Red());
        shapeColorBridge.draw();
    }
}
