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
public class College_Event {
    public int event_id;
    public String event_name;
    public String event_venue;
    public int capacity;
    public String date;
    
    College_Event(int event_id,String event_name,String event_venue,int capacity,String date){
        this.event_id = event_id;
        this.event_name = event_name;
        this.event_venue = event_venue;
        this.capacity = capacity;
        this.date = date;
    }
    
    public void Display(){
        System.out.println("Event Name : "+ event_name);
        System.out.println("Event Venue : "+ event_venue);
        System.out.println("Event Date : "+ date);
        System.out.println("Event Capacity : "+ capacity);
        System.out.println();
    }
    
}
