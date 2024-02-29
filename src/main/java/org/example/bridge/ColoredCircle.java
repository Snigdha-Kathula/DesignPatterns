package org.example.bridge;

public class ColoredCircle extends ShapeColorBridge {
    public ColoredCircle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle With ");
        color.fill();
    }
}
