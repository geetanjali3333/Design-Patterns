package org.sample.Builder;

public class Client {
    public static void main(String[] args){
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setName("Geeta");
        studentBuilder.setGradYear(2024);
        studentBuilder.setCourse("Java");
        studentBuilder.setBatch("Apr2024");

        Student s=new Student(studentBuilder);
       System.out.println(s.toString());
    }
}
