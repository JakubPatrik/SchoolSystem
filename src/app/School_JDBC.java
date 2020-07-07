package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;
import GUI.*;

public class School_JDBC {

	static Random rand = new Random();

    static char [] sexes = {'M','F'};
    static String [] maleNames = {"Dusan","Marek","Jozko","Ivan","Andrej","Lukas","Jakub","Rafi","Kiko","Erik"};
    static String [] femaleNames = {"Daniela","Maria","Michaela","Ivana","Petra","Sabina","Dorka","Karin","Marina","Klaudia"};
    private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String CONN = "jdbc:mysql://localhost:3306/school_database";

	private Connection con;
  	private Statement st;
  	private ResultSet rs;
	
	public School_JDBC(){
		try{	
			con = DriverManager.getConnection(CONN,USERNAME,PASSWORD);
			System.out.println("Connection succesful.........");
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery("SELECT * FROM students");		

			for(int i = 0; i<10;i++){

	            String meno = "";
	            char pohlavie = sexes[rand.nextInt(2)];
	            int age = rand.nextInt(4) + 15;

	            if (pohlavie == 'M'){
	            meno = maleNames[rand.nextInt(10)];
	            }
	            if (pohlavie == 'F'){
	            meno = femaleNames[rand.nextInt(10)];
	        	}

				String queryStudent = ("INSERT INTO students (status_,name_,age,sex) VALUES ('Student','"+meno+"','"+age+"','"+pohlavie+"')");
				st.executeUpdate(queryStudent);
			}
			
			for(int i = 0; i<10;i++){

	            String meno = "";
	            char pohlavie = sexes[rand.nextInt(2)];
	            int age = rand.nextInt(46)+19;

	            if (pohlavie == 'M'){
	            meno = maleNames[rand.nextInt(10)];
	            }
	            if (pohlavie == 'F'){
	            meno = femaleNames[rand.nextInt(10)];
	            } 
	                   
	        	String queryTeacher = ("INSERT INTO teachers (status_,name_,age,sex) VALUES ('Student','"+meno+"','"+age+"','"+pohlavie+"')");
	        	st.executeUpdate(queryTeacher);  
			}
		}

		catch (SQLException e) {
			System.out.println("SQLException:\n"+e.toString());
		}
		
	}
		
	public static void main(String...args) {
		//new School_JDBC();
		Login_window lw = new Login_window();
	  }

}

