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
public class main {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
    // We have three types of user student , admin , coordinator
    
    int choice=0;
    while(choice!=4){
        
        System.out.println("===== College Event management System =====");
        System.out.println();
        
        System.out.println("Please Select Your Role : ");
        System.out.println("1. Admin.");
        System.out.println("2. Student.");
        System.out.println("3. Volunteer Coordinator.");
        System.out.println("4. Exit.");
        
        choice = Integer.valueOf(x.nextLine());
        
        // admin -> add , update , remove the event
        // student -> register , cancel registration , see registered event
        // volunteer coordinator -> assign , remove & see all volunteer
        
        Event_Manager e = new Event_Manager();
        Registration_Manager r = new Registration_Manager();
        Volunteer_Manager v = new Volunteer_Manager();
        
        switch(choice){
            case 1:
                int c1=0;
                System.out.println("You Have Registered as Admin.");
                System.out.println();
                
                while(c1!=5){
                System.out.println("1. Add An Event.");
                System.out.println("2. Update An Event.");
                System.out.println("3. Remove An Event.");
                System.out.println("4. Display All Event.");
                System.out.println("5. Exit.");
                
                c1 = Integer.valueOf(x.nextLine());
                
                switch(c1){
                    case 1:
                        
                        System.out.println("Enter The Event id :");
                        int id = Integer.valueOf(x.nextLine());
                        System.out.println();
                        
                        System.out.println("Enter The Event Name :");
                        String name = x.nextLine();
                        System.out.println();
                        
                        System.out.println("Enter The Event Venue :");
                        String venue = x.nextLine();
                        System.out.println();
                        
                        System.out.println("Enter The Event Capacity :");
                        int capa = Integer.valueOf(x.nextLine());
                        System.out.println();
                        
                        System.out.println("Enter The Event Date (dd-mm-yyyy) :");
                        String dat = x.nextLine();
                        System.out.println();
                        
                        College_Event c = new College_Event(id,name,venue,capa,dat);
                        e.add_event(c);
                        break;
                        
                    case 2:
                        int c2=0;
                        System.out.println("Select What You Want to Update ; ");
                        System.out.println();
                        
                        while(c2!=5){
                        System.out.println("1. Update Event Name.");
                        System.out.println("2. Update Event Date.");
                        System.out.println("3. Update Event Venue.");
                        System.out.println("4. Update Event Capacity.");
                        System.out.println("5. Exit.");
                        
                        c2=Integer.valueOf(x.nextLine());
                        
                        switch(c2){
                            case 1:
                                System.out.println("Please Enter The Event Id & Name to be Changed : ");
                                int i1 = Integer.valueOf(x.nextLine());
                                String n = x.nextLine();
                                
                                e.update_event_name(i1, n);
                                break;
                                
                            case 2:
                                System.out.println("Please Enter The Event Id & Date to be Changed : ");
                                int i2 = Integer.valueOf(x.nextLine());
                                String d = x.nextLine();
                                
                                e.update_event_date(i2,d);
                                break;
                                
                            case 3:
                                System.out.println("Please Enter The Event Id & Venue to be Changed : ");
                                int i4 = Integer.valueOf(x.nextLine());
                                String ve = x.nextLine();
                                
                                e.update_event_date(i4,ve);
                                break;
                                
                            case 4:
                                System.out.println("Please Enter The Event Id & Capacity to be Changed : ");
                                int i5 = Integer.valueOf(x.nextLine());
                                int ca = Integer.valueOf(x.nextLine());
                                
                                e.update_event_capacity(i5,ca);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Enter Valid Option.");
                                break;
                        }
                        
                        }
                        break;
                    
                    case 3:
                        System.out.println("Enter the Event id You Want to remove.");
                        int i6 = Integer.valueOf(x.nextLine());
                        
                        e.remove_event(i6);
                        break;
                        
                    case 4:
                        e.display_all_event();
                        break;
                    case 5:
                        break;
                        
                    default:
                        System.out.println("Please Enter a Valid Choice");
                        break;
                        
                    
                }
                }
        
            case 2:
                System.out.println("You Have registered As Student.");
                System.out.println();
                
                int c3=0;
                while(c3!=5){
                    System.out.println("1. Register For Event.");
                    System.out.println("2. Cancel Registration.");
                    System.out.println("3. See Registered Events.");
                    System.out.println("4. See All Events.");
                    System.out.println("5. Exit.");
                    
                    c3 = Integer.valueOf(x.nextLine());
                    
                    switch(c3){
                        case 1:
                            System.out.println("Enter The id of Event : ");
                            int id1=Integer.valueOf(x.nextLine());
                            
                            System.out.println("Enter Your Study Year , name & branch : (Seperate it with spaces)");
                            int sy = Integer.valueOf(x.nextLine());
                            String na=x.nextLine();
                            String b =x.nextLine();
                            
                            System.out.println("Enter Your CollegeId , email , phone number , roll number : (Seperate it with spaces) ");
                            int uid=Integer.valueOf(x.nextLine());
                            String em = x.nextLine();
                            String roll = x.nextLine();
                            long ph = 889898;
                            
                            Student s = new Student(uid,na,em,ph,roll,b,sy);
                            break;
                        case 2:
                            System.out.println("Enter The Student Details as listed for removal : ");
                            System.out.println();
                            
                            System.out.println("Enter The id of Event : ");
                            int id2=Integer.valueOf(x.nextLine());
                            
                            System.out.println("Enter Your Study Year , name & branch : (Seperate it with spaces)");
                            int sy1 = Integer.valueOf(x.nextLine());
                            String na1=x.nextLine();
                            String b1 =x.nextLine();
                            
                            System.out.println("Enter Your CollegeId , email , phone number , roll number : (Seperate it with spaces) ");
                            int uid1=Integer.valueOf(x.nextLine());
                            String em1 = x.nextLine();
                            String roll_1 = x.nextLine();
                            long ph1 = 889898;
                            
                            Student s1 = new Student(uid1,na1,em1,ph1,roll_1,b1,sy1);
                            
                            System.out.println("Enter The id Of The Event : ");
                            int a = Integer.valueOf(x.nextLine());
                            System.out.println();
                            
                            r.cancel_registration(a,s1);
                            break;
                        case 3:
                            System.out.println("Enter The id of Event : ");
                            int id3=Integer.valueOf(x.nextLine());
                            r.display_registered_event(id3);
                            break;
                        case 4:
                            System.out.println("Here Are All the Event Details : ");
                            e.display_all_event();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Please Enter valid option !! ");
                            break;
                    }
                }
                
                break;
            case 3:
                System.out.println("You Have Registered as Volunteer Coordinator.");
                
                break;
            case 4:
                break;
            default:
                System.out.println("Enter Valid Option.");
                break;
        }
    }
    }    
}
