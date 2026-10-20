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
public class Admin extends College_User {
    public String designation;
    private String department;
    
    Admin(int user_id,String name,String email,long phone,String designation,String department){
        super(user_id,name,email,phone);
        this.designation=designation;
        this.department=department;
    }
    
    public void Display_Roles(){
        System.out.println(name+" Is Admin From the "+department+" Department");
    }
}
