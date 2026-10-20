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
import java.util.Scanner;

abstract public class College_User {
    public int user_id;
    public String name;
    private String email;
    private long phone;
    
    College_User(int user_id,String name,String email,long phone){
        this.user_id=user_id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    
    abstract void Display_Roles();
}



