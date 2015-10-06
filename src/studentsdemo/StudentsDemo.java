package studentsdemo;

import java.util.Arrays;

public class StudentsDemo {

    public static void main(String[] args) {
        Student[] team7 = new Student[3];
        
        //add students to array
        team7[0] = new Student("Uchiha Sasuke", 6.00);
        team7[1] = new Student("Uzumaki Naruto", 1.00);
        team7[2] = new Student("Haruno Sakura", 9.50);
        
        Arrays.sort(team7);
        
        for(Student e : team7){
            System.out.println("name = " + e.getName() + ", Score = " + e.getExam());
        }
    }
    
}
