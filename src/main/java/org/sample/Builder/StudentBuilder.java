package org.sample.Builder;

public class StudentBuilder {


    int age;
    String name;
    String batch;
    String course;
    int gradYear;
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    Student build(){
        return new Student(this);
    }


}
