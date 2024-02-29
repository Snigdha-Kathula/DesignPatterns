package org.example.bridge;

public class ColoredSquare extends ShapeColorBridge{
    public ColoredSquare(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Color With ");
        color.fill();
    }
}
