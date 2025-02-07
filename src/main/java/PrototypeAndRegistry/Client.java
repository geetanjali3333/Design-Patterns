package PrototypeAndRegistry;



public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student st=new Student();
        st.batch="Apr23Student";
        st.name="Geeta";
        st.id=1;
        studentRegistry.registry("Apr23", st);

    }

    public static void main(String[] args){
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);
        studentRegistry.get("Apr23");

    }
}
