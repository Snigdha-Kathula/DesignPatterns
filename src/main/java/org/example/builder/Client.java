package org.example.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("Snigdha").setAge(19).setTotalMarks(55).build();

    }
}
