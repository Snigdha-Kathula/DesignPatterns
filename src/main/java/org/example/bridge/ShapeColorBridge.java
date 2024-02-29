package org.example.bridge;

abstract class ShapeColorBridge {
    protected Color color;

    public ShapeColorBridge(Color color) {
        this.color = color;
    }
    abstract void draw();
}
