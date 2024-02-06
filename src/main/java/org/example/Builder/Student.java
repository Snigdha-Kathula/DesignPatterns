package org.example.Builder;

public class Student {
    //age should be >18
    // TotaalMarks should be >45
    private String name;
    private int age;
    private int totalMarks;

    public Student(Builder builder) {
        this.age = builder.age;
        this.totalMarks = builder.totalMarks;
        this.name = builder.name;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    private static class Builder{
        private int age;
        private int totalMarks;
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getTotalMarks() {
            return totalMarks;
        }

        public Builder setTotalMarks(int totalMarks) {
            this.totalMarks = totalMarks;
            return this;
        }
        private void valid(){
            if(age<=18) throw new IllegalArgumentException("Age should be greater than 18");
            if(totalMarks<=44) throw new IllegalArgumentException("Total marks should be greater than 44");
        }
        public Student build(){
            valid();
            return new Student(this);
        }
    }

}
