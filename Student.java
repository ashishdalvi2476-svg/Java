/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeEvent;

/**
 *
 * @author ashis
 */
public class Student extends College_User{
    public String roll;
    private String branch;
    private int study_year;
    
    Student(int user_id,String name,String email,long phone,String roll,String branch,int study_year){
        super(user_id,name,email,phone);
        this.roll=roll;
        this.branch=branch;
        this.study_year=study_year;
    }
    
    String get_branch(){
        return branch;
    }
    int get_year(){
        return study_year;
    }
    public void Display_Roles(){
        System.out.println(name+" Is A Student Of the College.");
    }
    
}
