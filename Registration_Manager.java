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
import java.util.HashMap;
import java.util.ArrayList;
interface Student_Registration_Functions{
    void register_for_event(int id,Student s,College_Event c);
    void cancel_registration(int id,Student s);
    void display_registered_event(int id);
}
public class Registration_Manager implements Student_Registration_Functions{
    public HashMap<Integer,ArrayList<Student>> manager = new HashMap<>();
    
    public void register_for_event(int id,Student s,College_Event c){

    ArrayList<Student> registered_student_detail = manager.get(id);
    
    if(registered_student_detail == null){
        registered_student_detail = new ArrayList<>();
        manager.put(id,registered_student_detail);
    }
    
    if(registered_student_detail.size()>= c.capacity){
        System.out.println("Seats are already Full.");
    }
    
    for(int i=0;i<registered_student_detail.size();i++){
        if(registered_student_detail.get(i).user_id == s.user_id){
            System.out.println("You Have Already Registered.");
        }
    }
    
    registered_student_detail.add(s);
     System.out.println("Student Registered Successfully.");
  }
    
    public void cancel_registration(int id,Student s){
        ArrayList<Student> registered_student_detail = manager.get(id);
        
        if(registered_student_detail == null){
        System.out.println("No One Registered For the event with id : "+id);
        return;
        }
        
        boolean removed = false;
        for(int i=0;i<registered_student_detail.size();i++){
            if(registered_student_detail.get(i).user_id == s.user_id){
                removed = true;
                registered_student_detail.remove(i);
                System.out.println("Student Removed Succefully.");
                break;
            }
        }
        
        if(!removed){
            System.out.println("You Have Not Registered for this event.");
        }
        
    }
    
    public void display_registered_event(int id){
        ArrayList<Student> registered_student_detail = manager.get(id);
        
        if(registered_student_detail == null){
        System.out.println("No One Registered For the event with id : "+id);
        return;
        }
        
        if(registered_student_detail.isEmpty()){
            System.out.println("There Are No registration of this event.");
        }
        
        for(int i=0;i<registered_student_detail.size();i++){
            System.out.println("Name Of Student : "+registered_student_detail.get(i).name);
            System.out.println("Branch Of Student : "+registered_student_detail.get(i).get_branch());
            System.out.println("Study Year of the Student : "+registered_student_detail.get(i).get_year());
            System.out.println();
        }
    }
    
    // General Testing Of the event
//    public static void main(String[] args){
//        College_Event c = new College_Event(401,"The Odessay","Auditorium",670,"10-9-2019"); 
//        Student s = new Student(2476,"Ashish","ksjhduh",99999,"005","CSBS",2);
//        
//        Registration_Manager r1 = new Registration_Manager();
//        
//        r1.register_for_event(401,s,c);
//        r1.cancel_registration(401, s);
//        r1.display_registered_event(401);
//    }
}
