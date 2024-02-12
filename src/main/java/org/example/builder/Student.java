package org.example.builder;

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

    public static class Builder{
        private int age;
        private int totalMarks;
        private String name;
        public String getName() {

            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
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
            if((age<=18 || age>80) && (totalMarks<=44 || totalMarks>100)) throw new IllegalArgumentException("Age should be in between 19 and 80 || totalMarks should be in between 45 and 100 ");
            if(age<=18 || age>80) throw new IllegalArgumentException("Age should be greater than 18 and less than or equal to 80");
            if(totalMarks<=44 || totalMarks>100) throw new IllegalArgumentException("Total marks should be greater than 44 and less than or equal to 100");
        }
        public Student build(){
            valid();
            return new Student(this);
        }
    }

}
