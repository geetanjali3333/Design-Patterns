package PrototypeAndRegistry;



public class Student implements Prototype<Student>
{
    int id;
    String name;
    String batch;

    Student(){

    }
    Student(Student st){
        this.id=st.id;
        this.name=st.name;
        this.batch=st.batch;
    }
    @Override
    public Student copy() {
          Student st=new Student(this); //(this) get from Student constructor
//        Student st=new Student();
//        st.id=this.id;
//        st.batch=this.batch;
//        st.name=this.name;
        return st;
    }
}
