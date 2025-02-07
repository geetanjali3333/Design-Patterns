package PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    int iq;

    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq=is.iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent st=new IntelligentStudent(this);
//        IntelligentStudent st=new IntelligentStudent();
//        st.iq=this.iq;
//        st.id=this.id;
//        st.name=this.name;
//        st.batch=this.batch;
        return st;

    }
}
