/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeEvent;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ashis
 */

interface volunteer_assigning{
    void assign_volunteer(int id,Student s);
    void remove_volunteer(int id,Student s);
    void display_volunteer(int id);
}
public class Volunteer_Manager {
    public HashMap<Integer,ArrayList<Student>> volunteer_map = new HashMap<>();
    
    public void assign_volunteer(College_Event event, Student s) {

        if (event == null || s == null) {
            System.out.println("Invalid event or student.");
            return;
        }

        int event_id = event.event_id;

        ArrayList<Student> volunteers = volunteer_map.get(event_id);

        if (volunteers == null) {
            volunteers = new ArrayList<>();
            volunteer_map.put(event_id, volunteers);
        }

        for (Student volunteer : volunteers) {
            if (volunteer.user_id == s.user_id) {
                System.out.println(
                    "This student is already assigned as a volunteer."
                );
                return;
            }
        }

        volunteers.add(s);

        System.out.println("Volunteer Assigned Successfully.");
    }


    public void remove_volunteer(int event_id, Student s) {

        ArrayList<Student> volunteers = volunteer_map.get(event_id);

        if (volunteers == null || volunteers.isEmpty()) {
            System.out.println("No volunteers assigned to this event.");
            return;
        }

        for (int i = 0; i < volunteers.size(); i++) {

            if (volunteers.get(i).user_id == s.user_id) {

                volunteers.remove(i);

                System.out.println("Volunteer Removed Successfully.");
                return;
            }
        }

        System.out.println("This student is not assigned to this event.");
    }


    public void display_volunteers(int event_id) {

        ArrayList<Student> volunteers = volunteer_map.get(event_id);

        if (volunteers == null || volunteers.isEmpty()) {
            System.out.println("No volunteers assigned to this event.");
            return;
        }

        System.out.println("Volunteers for Event ID: " + event_id);

        for (Student s : volunteers) {

            System.out.println("Student ID: " + s.user_id);
            System.out.println("Name: " + s.name);
            System.out.println("Branch: " + s.get_branch());
            System.out.println("Year: " + s.get_year());
            System.out.println();
        }
    }
}
