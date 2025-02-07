package PrototypeAndRegistry;

import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> studentMap;

    public void registry(String key, Student st){
        studentMap.put(key,st);
    }
    public Student get(String key){
//        return studentMap.get(key); //give the actual prototype
        return studentMap.get(key).copy(); //give the copy
    }
}
