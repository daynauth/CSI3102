

package studentsdemo;


public class Student implements Comparable{
    private double examScore;
    private String name;
    
    public Student(String name, double examScore){
        this.examScore = examScore;
        this.name = name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setExam(double newScore){
        examScore = newScore;
    }
    
    public String getName(){
        return name;
    }
    
    public double getExam(){
        return examScore;
    }
    
    @Override
    public int compareTo(Object otherObject){
        Student other = (Student)otherObject;
        if(examScore < other.examScore)return -1;
        if(examScore > other.examScore)return 1;
        return 0;
    }
    
}
