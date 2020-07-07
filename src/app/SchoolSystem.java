package app;

import java.util.Random; 

/**
 * @author Jakub Patrik
 * @version 14/10/2019
 */
class SchoolSystem{  
    
    static Random rand = new Random();

    static char [] sexes = {'M','F'};
    static String [] maleNames = {"Dusan","Marek","Jozko","Ivan","Andrej","Lukas","Jakub","Rafi","Kiko","Erik"};
    static String [] femaleNames = {"Daniela","Maria","Michaela","Ivana","Petra","Sabina","Dorka","Karin","Marina","Klaudia"};
   
    public static void main(String[] args) {
        
        School leaf = new School();
        leaf.setName("Leaf Academy");
        System.out.println(leaf.getName());

        Address address = new Address();
        address.setCity("Bratislava");
        address.setStreet("Sasinkova");
        address.setNumber(13);
        address.setZip("811 08");
        // Setting up the address of the school

        leaf.setAddress(address);
        leaf.getAddress();

        System.out.println();
        System.out.println("-------------------------------------------------------");
        // Adding the address to the school

        for(int i = 0; i<100;i++){

            String meno = "";
            char pohlavie = sexes[rand.nextInt(2)];
            int age = rand.nextInt(4) + 15;

            if (pohlavie == 'M'){
            meno = maleNames[rand.nextInt(10)];
            }
            if (pohlavie == 'F'){
            meno = femaleNames[rand.nextInt(10)];
            }

        Student a = new Student();
        a.setCountOfStudents(i+1);
        a.setAge(age);
        a.setName(meno);
        a.setSex(pohlavie);

        leaf.setStudent(a);
        leaf.getStudent(i);
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------");
        // Setting up the student and adding to the school
        
        for(int i = 0; i<25;i++){

            String meno = "";
            char pohlavie = sexes[rand.nextInt(2)];
            int age = rand.nextInt(46)+19;

            if (pohlavie == 'M'){
            meno = maleNames[rand.nextInt(10)];
            }
            if (pohlavie == 'F'){
            meno = femaleNames[rand.nextInt(10)];
            } 
            
        Teacher a = new Teacher();
        a.setCountOfTeachers(i+1);
        a.setAge(age);
        a.setName(meno);
        a.setSex(pohlavie);

        leaf.setTeacher(a);
        leaf.getTeacher(i);     
        }
        // Setting up the teacher and adding to the school
        

    }
}