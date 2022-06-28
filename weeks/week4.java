package weeks;

import java.util.*;

public class week4 {                                                                              //CLASS WEEK4 IN WEEKS PACKAGE
       
   
    public void week4_internship()
    {
    System.out.println("Welcome to fourth week of your internship!!".toUpperCase());           //STRING HANDLING FUNCTION
    System.out.println("Let's get started");
   
    System.out.println("Enter the date number(1-5) ");
   
    Scanner sc = new Scanner(System.in);
     int h = sc.nextInt();
     
switch (h) {
             case 1 -> {
                  System.out.println("Today we shall learn about \"UNDERSTANDING WORKPLACE CULTURE\"");
             }
             case 2 -> {
                  System.out.println("Today we shall learn about \"IMPORTANCE OF COMMUNICATION SKILLS\"");
             }
             case 3 -> {
                   System.out.println("Today we shall learn about \"ANALYSING AND PROBLEM SOLVING\"");
             }
             case 4 -> {
                 System.out.println("Today we shall learn about \"TEAMWORK AND COLLABORATION\"");
             }
             case 5 -> {
                 System.out.println("Today we shall learn about \"TIME MANAGEMENT AND MULTTITASKING\"");
             }
             default -> {
                      System.out.println("Enter wheather you completed the week's course (1 or 0)");
                    int g=sc.nextInt();
                    if(g==1)
                            {
                                     System.out.println("Successfully you have completed all weeks courses .");
                                     System.out.println("------------------------------------------------------------ ");
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
