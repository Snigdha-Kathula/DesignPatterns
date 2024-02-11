package org.example.prototype;

class ConcretePrototype implements Prototype {
    int id;
    String name;

    public ConcretePrototype(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public ConcretePrototype(ConcretePrototype prototype) {
        this.id = prototype.id;
        this.name = prototype.name;
    }

    // Getter and setter methods for attributes (id and name)

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}