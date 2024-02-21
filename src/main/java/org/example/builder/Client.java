package org.example.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("sai").setAge(19).setTotalMarks(55).build();

    }
}
//Builder DesignPattern:- It's a Creation Design Pattern
//It was used:-1) when there are lots of attributes
//             2) when there are validations need to apply

