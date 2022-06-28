

package weeks;                                                                             //CLASS WEEK1 IN WEEKS PACKAGE
import java.util.*;
 

   
public class week1 {
   
     public void week1_internship()
    {
       
    System.out.println("Welcome to First week of your internship!!".toUpperCase());         //STRING HANDLING FUNCTION
    System.out.println("LET'S GET STARTED!!".toLowerCase());                    
     System.out.println("This week we are learning  about \"LINUX OPERATING SYSTEM\"");
    System.out.println("Enter the date number(1-5) ");
   
    Scanner sc = new Scanner(System.in);
     int h = sc.nextInt();
         
         switch (h) {
             case 1 -> {
                  System.out.println("Today we shall learn about \"KERNAL\"");
             }
             case 2 -> {
                  System.out.println("Today we shall learn about \"HIERARCHIAL FILE SYSTEM\"");
             }
             case 3 -> {
                   System.out.println("Today we shall learn about \"MULTI-USER SOFTWARE\"");
             }
             case 4 -> {
                 System.out.println("Today we shall learn about \"MULTIPROGRAMMING\"");
             }
             case 5 -> {
                 System.out.println("Today we shall learn about \"COMPUTER MULTITASKING\"");
             }
             default -> {
                      System.out.println("Enter wheather you completed the week course (1 or 0)");
                    int g=sc.nextInt();
                    if(g==1)
                            {
                                     System.out.println("Successfully you have completed the 1st week's course .");
                                     System.out.println("------------------------------------------------------------ ");
                                      week2 we2=new week2();
                                      we2.week2_internship();
                                    }
                    else
                            {
                                     System.out.println("You have entered wrong date number!!");
                                     System.out.println("------------------------------------------------------------ ");
                                     
                                   
                                    }
             }
         }
         
         
         }
   
         }
