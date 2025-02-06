package org.sample.Builder;

public class Student {
    int age;
    String name;
    String batch;
    String course;
    int gradYear;

    Student(StudentBuilder builder){
        //Validations
        if(builder.age>25){
            throw new IllegalArgumentException("Age should be less than 25 years");
        }
        if(builder.gradYear>2024){
            throw new IllegalArgumentException("GradYear must be less than 2024");
        }
        if(builder.name==null){
            throw new NullPointerException("Name should not be null");
        }

        //set the attributes

        age=builder.age;
        name=builder.name;
        batch=builder.batch;
        course=builder.course;
        gradYear=builder.gradYear;
    }
   static StudentBuilder getBuilder(){
        return new StudentBuilder();
   }


    @Override
    public String toString() {
        return "My name is "+ name +" I am "+age + " years old. I completed my graduation in "+ gradYear+ " I am pursing the "+ course +" in batch"+ batch+" .";
    }
}
