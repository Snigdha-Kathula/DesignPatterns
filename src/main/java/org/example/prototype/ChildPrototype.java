package org.example.prototype;

class ChildPrototype extends ConcretePrototype {
     private String additionalInfo;

    public ChildPrototype(int id, String name, String additionalInfo) {
        super(id, name);
        this.additionalInfo = additionalInfo;
    }

    // Copy constructor
    public ChildPrototype(ChildPrototype prototype) {
        super(prototype);
        this.additionalInfo = prototype.additionalInfo;
    }

    @Override
    public Prototype clone() {
        return new ChildPrototype(this);
    }

    @Override
    public String toString() {
        return "ChildPrototype{" +
                "id=" + super.id +
                ", name='" + super.name + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
