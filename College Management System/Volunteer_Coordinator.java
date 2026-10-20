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
public class Volunteer_Coordinator extends College_User {
    public String team_name;
    Volunteer_Coordinator(int user_id,String name,String email,long phone,String team_name){
        super(user_id,name,email,phone);
        this.team_name=team_name;
    }
    
    public void Display_Roles(){
        System.out.println(name+" Belongs To "+team_name+" Team.");
    }
    
}
