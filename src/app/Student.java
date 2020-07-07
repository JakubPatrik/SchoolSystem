package app;

class Student{
    private String name;
    private int age;
    private char sex;
    private String studentData;
    private int countOfStudents = 0;

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    Student(){
        countOfStudents++;
    }
    
    public int getCountOfStudents() {
        return this.countOfStudents;
    }

    public String getStudentData(){
        studentData = ("Name: " + getName() + ", " + getAge() + ", " + getSex());
        return studentData;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void printStudent(){
        studentData = ("Name: " + getName() + ", " + getAge() + ", " + getSex());
        System.out.println(studentData);
    }
}