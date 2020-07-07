package app;

import java.util.ArrayList;
import java.util.List;

class School{
    private String name;
    private Address address;
    private List <Student> students = new ArrayList<>();
    private List <Teacher> teachers = new ArrayList<>();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setStudent(Student student) {
        this.students.add(student);
    }
    public void getStudent(int index) {
        System.out.println((this.students.get(index)).getStudentData());
    }

    public void setTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public void getTeacher(int index) {
        System.out.println((this.teachers.get(index)).getTeacherData());
    }

    public void setAddress(Address address){
        this.address = address;
    }
    public void getAddress(){
        address.printAddress();
    }

}

