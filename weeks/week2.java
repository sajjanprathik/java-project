package weeks;

import java.util.*;                                                                                //CLASS WEEK2 IN WEEKS PACKAGE

public class week2 {
   
     public void week2_internship()
    {
    System.out.println("Welcome to second week of your internship!!".toUpperCase());           //STRING HANDLING FUNCTION
    System.out.println("Let's get started");
     System.out.println("This week we are learning  about \"SOFTWARE TESTING\": ");
    System.out.println("Enter the date number(1-5) ");
   
    Scanner sc = new Scanner(System.in);
     int h = sc.nextInt();
     
     
         switch (h) {
             case 1 -> {
                  System.out.println("Today we shall learn about \"WHY TO LEARN TESTING\"");
             }
             case 2 -> {
                  System.out.println("Today we shall learn about \"HOW TO FIND ERRORS\"");
             }
             case 3 -> {
                   System.out.println("Today we shall learn about \"HOW TO SOLVE ERRORS\"");
             }
             case 4 -> {
                 System.out.println("Today we shall learn about \"TYPES OF TESTING\"");
             }
             case 5 -> {
                 System.out.println("Today we shall learn about \"SOLVE USING REAL LIFE PROBLEM\"");
             }
             default -> {
                      System.out.println("Enter wheather you completed the week course (1 or 0)");
                    int g=sc.nextInt();
                    if(g==1)
                            {
                                     System.out.println("Successfully you have completed the 2nd week's course .");
                                     System.out.println("------------------------------------------------------------ ");
                                     week3 we3=new week3();
                                     we3.week3_internship();
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
