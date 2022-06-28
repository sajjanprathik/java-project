
package weeks;

import java.util.*;

public class week3 {                                                                         //CLASS WEEK3 IN WEEKS PACKAGE
   
   
    public void week3_internship()
    {
    System.out.println("Welcome to third week of your internship!!".toUpperCase());            //STRING HANDLING FUNCTION
    System.out.println("Let's get started");
       System.out.println("This week we are learning  about \"WEB DEVELOPMENT\": ");
 
    System.out.println("Enter the date number(1-5) ");
   
    Scanner sc = new Scanner(System.in);
     int h = sc.nextInt();
     
       
         switch (h) {
             case 1 -> {
                  System.out.println("Today we shall learn about \"DESIGNING\"");
             }
             case 2 -> {
                  System.out.println("Today we shall learn about \"REVIEW\"");
             }
             case 3 -> {
                   System.out.println("Today we shall learn about \"DEVELOP\"");
             }
             case 4 -> {
                 System.out.println("Today we shall learn about \"TESTING\"");
             }
             case 5 -> {
                 System.out.println("Today we shall learn about \"LUNCHING\"");
             }
             default -> {
                      System.out.println("Enter wheather you completed the week course (1 or 0)");
                    int g=sc.nextInt();
                    if(g==1)
                            {
                                     System.out.println("Successfully you have completed the 3rd week's course .");
                                     System.out.println("------------------------------------------------------------ ");
                                     week4 we4=new week4();
                                     we4.week4_internship();
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
