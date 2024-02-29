package org.example.bridge;

public class ColoredRectangle extends ShapeColorBridge{
    public ColoredRectangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Color With ");
        color.fill();
    }
}
