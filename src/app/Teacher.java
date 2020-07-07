package app;

class Teacher{
    private String name;
    private int age;
    private char sex;
    private String teacherData;
    private int countOfTeachers = 0;

    Teacher(){
        countOfTeachers++;
    }
    public void setCountOfTeachers(int countOfTeachers) {
        this.countOfTeachers = countOfTeachers;
    }

    public int getCountOfTeachers() {
        return this.countOfTeachers;
    }    
    public String getTeacherData(){
        teacherData = ("Name: " + getName() + ", " + getAge() + ", " + getSex());
        return teacherData;
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

    public void printTeacher(){
        teacherData = ("Name: " + getName() + ", " + getAge() + ", " + getSex());
        System.out.println(teacherData);
    }
}