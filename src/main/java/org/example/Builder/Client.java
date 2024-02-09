package org.example.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("Snigdha").setAge(23).setTotalMarks(450).build();

    }
}
