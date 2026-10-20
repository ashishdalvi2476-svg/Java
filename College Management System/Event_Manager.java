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
import java.util.ArrayList;
interface Additional_Functions{
    void add_event(College_Event c);
    void update_event_name(int event_id,String event_name);
    void update_event_date(int event_id,String date);
    void update_event_capacity(int event_id,int capacity);
    void update_event_venue(int event_id,String event_venue);
    void remove_event(int event_id);
    void display_all_event();
}
public class Event_Manager implements Additional_Functions{
    private ArrayList<College_Event> event_list = new ArrayList<>();
    
    public void add_event(College_Event c){
        
        boolean check = true;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==c.event_id){
                    check = false;
                    System.out.println("This Event Already Exist , We Cannot enter Duplicates.");
                    break;
                }
            }
            
            if(check){
                      event_list.add(c);
                      System.out.println("Event Added Successfully.");
            }
    }
    
    public void update_event_capacity(int event_id,int capacity){
        
        if(capacity<0) {
            System.out.println("Please , Enter a valid Number.");
            return;
        }
        
        if(event_list.isEmpty()){
            System.out.println("Sorry , There Is No Event Scheduled.");
            return;
        }
        
        boolean change = false;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==event_id){
                    change = true;
                    event_list.get(i).capacity = capacity;
                    System.out.println("Capacity of event have been changed to "+ capacity);
                    break;
                }
            }  
               
            if(!change){
            System.out.println("Sorry , The Event Does Not Found.");
            } 
    }
    
        public void update_event_date(int event_id,String date){
            
            if(event_list.isEmpty()){
            System.out.println("Sorry , There Is No Event Scheduled.");
            return;
            }
            
            boolean change = false;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==event_id){
                    change = true;
                    event_list.get(i).date = date;
                    System.out.println("Dates Of the event is now : "+ date); 
                    break;
                }
            }
            if(!change){
                System.out.println("Sorry , The Event Does Not Found.");
            }
    }
        
        public void update_event_name(int event_id,String event_name){
            
            if(event_list.isEmpty()){
            System.out.println("Sorry , There Is No Event Scheduled.");
            return;
            }
  
            boolean change = false;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==event_id){
                    change = true;
                    event_list.get(i).event_name = event_name;
                    System.out.println("Event Name is : "+ event_name);
                    break;
                }
            }
            
            if(!change){
                System.out.println("Sorry , The Event Does Not Found.");
            }
    }
        
        public void update_event_venue(int event_id,String event_venue){
            
            if(event_list.isEmpty()){
            System.out.println("Sorry , There Is No Event Scheduled.");
            return;
            }
            
            boolean change = false;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==event_id){
                    change = true;
                    event_list.get(i).event_venue = event_venue;
                    System.out.println("Event Venue is : "+ event_venue);
                    break;
                }
            }
            
            if(!change){
                System.out.println("Sorry , The Event Does Not Found.");
            }
    }
    
    public void remove_event(int event_id){
        if(!event_list.isEmpty()){
            boolean change = false;
            for(int i=0;i<event_list.size();i++){
                if(event_list.get(i).event_id==event_id){
                    change = true;
                    event_list.remove(i);
                    System.out.println("Event Removed Successfully.");
                    break;
                }
            }
            
            if(!change){
                    System.out.println("Sorry , The Event Does Not Exist.");
            }
        }
        else{
            System.out.println("Sorry , There Is No Event Scheduled.");
        }
    }
    
    public void display_all_event(){
        if(!event_list.isEmpty()){
            for(int i=0;i<event_list.size();i++){
                event_list.get(i).Display();
            }
        }
        else{
            System.out.println("Sorry , There Is No Event Scheduled.");
        }
    }
    

//    For Checking all the functionalities.
//    public static void main(String[] args){
//        College_Event c1 = new College_Event(101,"The Odessy.","CSBS Department.",250,"10-10-2027");
//        Event_Manager e = new Event_Manager();
//        
//        e.add_event(c1);
//        e.update_event_name(101, "Abhudaya");
//        e.update_event_capacity(101, 500);
//        e.update_event_venue(101, "Auditorium");
//        e.update_event_date(101, "12-10-2029");
//        System.out.println();
//        e.display_all_event();
//    }
}

