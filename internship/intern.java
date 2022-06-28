package internship;                                                             
import java.lang.String;

import weeks.week1;                                                                 //IMPORTING PACKAGES
import weeks.week2;
import weeks.week3;
import weeks.week4;
import java.util.*;

interface inter                                                                   //INTERFACE
{
    void snacks();
 
    void lunch();
 
    default void juice(){                                                         //INTERFACE WITH DEFAULT FUNCTION
      System.out.println("This is Default Interface Method - JUICE") ;
    }
}
interface inter2{

        void  internos(int l);                                                    //INTERFACE WITH VARIABLES
        void members(int k);
}

class newintern{                                                                //SUPER CLASS
   
        String name;
        String no;
        String collage;
        String majorpro;
        int yoj;
   
        Scanner sc = new Scanner(System.in);
   
        newintern() {                                                           //DEFAULT CONSTRUCTOR
                name=null;
                no=null;
                collage=null;
                majorpro=null;
                yoj=0;
        }
   
        newintern(String name3,int yoj3,String collage3,String majorpro3,String no3){   //PARAMETORIZED COSTRUCTOR
            
                this.name=name3;                                                    //use of this function
                this.yoj= yoj3;
                this.collage=collage3;
                this.majorpro=majorpro3;
                this.no=no3;
        }
   
        void display() {
            
             System.out.println("Name of Intern is "+name );
             System.out.println("Year of the joining is " +yoj);
             System.out.println("Degree collage of the intern is "+collage);
             System.out.println("Major project of the intern is "+majorpro);
             System.out.println("Mobile number of the intern is "+no);
        }
   
}

class interninfo extends newintern implements inter{                            //SINGLE INHERITANCE    //SUB CLASS                                                                  
    //String name;                                                              //IMOLEMENTATION OF INTERFACE
    //String no;
    //String collage;
    //String majorpro;
    //int yoj;
   
    int id_no;
    String project;
   
     Scanner sc = new Scanner(System.in);
   
     interninfo(){                                                              //DEFAULT CONSTRUCTOR
         
       super.name=null;                                                         //USE OF SUPER KEYWORD
       super.no=null;                                                               
       super.collage=null;
       super.majorpro=null;
       super.yoj=0;
   
       this.id_no=0;
       this.project=null;
     }
   
    interninfo(String name1,int yoj1,String collage1,String majorpro1,String no1,int id_no1,String project1){
                                                                                      //PARAMETORIZED CONSTRUCTOR
        super.name=name1;
        super.yoj= yoj1;                                                         //SUPER FUNCTION
        super.collage=collage1;
        super.majorpro=majorpro1;
        super.no=no1;
       
        this.id_no=id_no1;
        this.project=project1;
    }
   
     void display(){                                                            //OVERRIDDING METHOD
            System.out.println("Id Number is "+id_no);
              super.display();                                                  //PASSING FUNCTION TO SUPER CLASS
           System.out.println("Assigned project is "+project);
     }
   
     interninfo retobj(){                                                               //RETURNING OBJECT FROM METHOD
         interninfo os = new interninfo("Sanjay",2019,"Vidyavardaka","IC_Development","9283710473",3,"Silicon_chips");
        return os;
     
     }
 
     public void snacks(){                                                      //IMPLEMENTING INTERFACE FUNCTIONS
        System.out.println("You can eat Snacks if you want.");
     }
  
     public void lunch()
     {
         System.out.println("Lunch will be provided in the canteen.");
     }
}

class guide extends interninfo implements inter2{                               //MULTIPLE INHERITANCES
   
    String gname;
   
    guide(){                                                                    //DEFAULT CONSTRUCTOR
 
        super.name=null;
        super.no=null;
        super.collage=null;
        super.majorpro=null;
        super.yoj=0;
   
        super.id_no=0;
        super.project=null;
   
        this.gname=null;
    }
   
    guide(String name2,int yoj2,String collage2,String majorpro2,String no2,int id_no2,String project2,String gname2)
    {
        super.name=name2;
        super.yoj= yoj2;
        super.collage=collage2;                                                 //SUPER KEYWORD
        super.majorpro=majorpro2;
        super.no=no2;
       
        super.id_no=id_no2;
        super.project=project2;
       
        this.gname=gname2;
    }
   
  
    void display(){
            System.out.println("Guide is "+gname);
              super.display();                                                  //PASSING FUNCTION TO SUPER CLASS
   
    }
   
  
    public void internos(int l) {
         System.out.println("Total number of interns are : "+l );
    }
   
    public void members(int k){
           System.out.println("Total members in company are : "+k );
    }
     
}


class myexception extends Exception{                                            //CUSTOM EXCEPTION
    
        myexception(String s){
        super(s);
        }
}

class thread1 implements Runnable{                                              //threads using Runnable function
   
    Thread t;
   
    thread1()
    {
        t=new Thread(this,"Thread_1");
        System.out.println("Random variable Generation "+t);
        t.start();
    }
    public void run()                                                           //use of "run" function
    {
        Scanner sc = new Scanner(System.in);
        
        try{                                                                    //TRY FUNCTION
            
             System.out.println("Enter the number of Random numbers"            
                                + " you want to generate: ");
             int  n=sc.nextInt();
             int[] a=new int[n];
             int min=0;
             int max=10000;
       
             for(int i=0;i<n;i++) {
            
             a[i]=(int)(Math.random()*(max-min+1)+min);
             System.out.println("ramdom number "+(i+1)+": "+a[i]);
             System.out.println("Square of random variable is : "+(a[i]*a[i])); 
             System.out.println("Cube of random number is : "+(a[i]*a[i]*a[i]));
              }
        
        }
        
        catch(Exception e) {                                                    //CATCH FUNCTION
                 System.out.println("This is a General Exception .Hence caught.");
        }
    }
   
}

class thread2 implements Runnable{                                              //THREADS USING "RUNNABLE" FUNCTION

    Thread t1;
    String m;
    
    thread2() {
   
       t1=new Thread(this,"Thread_2");
       System.out.println("Second thread: "+t1);
       t1.start();
    }
   
    public void run(){
        
        System.out.println("Enter your Father name : ");
        Scanner sc = new Scanner(System.in);
        m=sc.nextLine();
       
        System.out.println("Father name is: " +m);
        System.out.println("------------------------------------------------------------ ");
    }
   
}

class thread3 implements Runnable{

    Thread t3;
    String j;
   
    thread3(){
   
        t3= new Thread(this,"Thread_3");
        System.out.println("Third thread: "+t3);
        t3.start();
    }
   
    public synchronized void run() {                                            //THREAD SYNCHRONISATION    
   
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your hobbies: ");
       
         j=sc.next();
         System.out.println("Hobbies are : "+j);
         System.out.println("------------------------------------------------------------ ");
    }

}

public class intern {                                                           //MAIN CLASS
   
       
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException, InterruptedException{
   
           
         System.out.println("Welcome to journey of your internship!!");
       
         System.out.println("Mention whether you want to continue the internship or you want the details of interns (1 or 0):");
         
         Scanner sc = new Scanner(System.in);
         int p;
         p = sc.nextInt();
     
          if(p==1) {
              
             System.out.println("Mention whether you are new Inter or old one(1 or 0) ");

              int k;
              k = sc.nextInt();
     
              if(k==1) {
           
                    System.out.println("Enter the Name ");
                    String name3= sc.nextLine() ;
                    sc.next();
      
                    System.out.println("Enter the year of joining ");
                    int yoj3= sc.nextInt();
                        
                    System.out.println("Enter the Collage from which you graduated ");
                    String collage3 = sc.next();
         
             
                    System.out.println("Enter the Major project you have done ");
                    String majorpro3= sc.next();
                 
                    System.out.println("Enter the mobile number ");
                    String no3= sc.next();
                       
                    newintern obj1 = new newintern( name3,yoj3, collage3, majorpro3,no3);   //PASSING PARAMETERS TO THE CONSTRUCTOR
               
                    System.out.println("------------------------------------------------------------ ");
                                   
                    System.out.println("The information of the Intern is ");
                    obj1.display();                                                          //USE OF SUPER CALSS FUNCTION
                      
                    System.out.println("------------------------------------------------------------ ");
                    
                    System.out.println("Let's Start the internship ");
                    System.out.println("------------------------------------------------------------ ");
                    
                    week1 we1=new weeks.week1();                                                //IMPORTING OF PACKAGES
                    we1.week1_internship();                                                     //CLASS OF DIFFERNT PACKAGES
         
               }
     
               else {
                  
                System.out.println("Let's continue the internship ");
                System.out.println("Enter current week number you are working now: ");
                
                int we = sc.nextInt();
                
                switch (we) {                                                           //REDIRECTING TO DIFFERENT PACKAGES
                    
                     case 1 -> {
                     week1 we1=new weeks.week1();
                     we1.week1_internship();
                     }
                     
                     case 2 -> {
                     weeks.week2 we2=new weeks.week2();
                     we2.week2_internship();
                     }
                     
                     case 3 -> {
                     weeks.week3 we3=new weeks.week3();
                     we3.week3_internship();
                     }
                     
                    case 4 -> {
                    weeks.week4 we4=new weeks.week4();
                    we4.week4_internship();
                    }
                    
                    default -> {
                    System.out.println("Enter wheather you completed the 4 weeks of your course (1 or 0):");
                    int g=sc.nextInt();
                            
                    if(g==1)
                        {
                            System.out.println("Successfully you have completed the course "
                                             + "Enjoy the test");
                        }
                    else
                        {
                            System.out.println("You have entered wrong week number!!");                                
                        }
                    }   
                }
         
         
             }
          }
          
        else {
              
             System.out.println("Information about Sharan:");
             interninfo ob1 = new interninfo("Sharan",2021,"NIE","Taking_robort","8938395672",1,"Robotics");  //PASSING PARAMETERS
             ob1.display();
             
             System.out.println("------------------------------------------------------------ ");
             
             System.out.println("Information about intern under \"Reshma\" gudience: ");
             guide ob2 = new guide("Shravani",2020,"JCSE","Ewaste_mangement","8938395622",2,"Bridge_construction","Rahan");
             ob2.display();
             
             System.out.println("------------------------------------------------------------ ");
         
             interninfo ob3 = new interninfo();
             interninfo ob4 = ob3.retobj();                                                     //RETURNING OBJECT
             ob4.display();
       
       
        }
          
          System.out.println("------------------------------------------------------------ ");
          
          System.out.println("Shownig use of Interfaces. ");                                //USE OF INTTERFACE
          
          inter ob5 = new interninfo();
          ob5.juice();
          ob5.lunch();
          
          System.out.println("------------------------------------------------------------ ");
          
          System.out.println("Shownig use of Interface with variables. ");                  // INTERFACE WITH VARIABLES
          
          inter2 ob7 = new guide();
          ob7.internos(20);
   
          inter2 ob8 = new guide();
          ob8.members(150);
   
          System.out.println("------------------------------------------------------------ ");
        
          System.out.println("Shownig use of Exceptions");                               //EXCEPTION
          
            try{
             
                 System.out.println("Enter the Company name ");
                 String name=sc.next();
                 int g=name.length();                                                   //STRING HANDLING FUNCTION (obj.length)
                 
                 System.out.println("The length of the name is "+g);
           
                 if(g%2==0)  {
                     
                 throw new ArithmeticException ();                                      //USE OF throw function
                 }
                 else {
                 throw new myexception(name );
             }
             
         }
         
         catch(ArithmeticException e)                                                     //USE OF UNCHEKED EXCEPTION
         {
              System.out.println("Here we making use of uncheked Exception.");
           
             System.out.println("The length of company name is even. " );
           
         }
         catch(myexception e)                                                           //USE OF CUSTOMIZED EXCEPTION
         {
             System.out.println("Here we are showing customized Exception: "+e);
             System.out.println(e.getMessage());
             
         }
         finally
         {
             System.out.println("Here we showing the use of Finally function");         //USE OF FINALLY FUNCTION
             System.out.println();
         }  
         
            System.out.println("------------------------------------------------------------ ");
            
            System.out.println("Here we showing the use of Threads");                   //USE OF THREADS
     
            thread1 obd =new thread1();
            try{
            obd.t.join();
             }
            
             catch(InterruptedException e){
                System.out.println("join function didn't worked here");
             }
           
             thread2 obd1 = new thread2();
             obd1.t1.join();                                                        //USE OF JOIN FUNCTION
             
             System.out.println("------------------------------------------------------------ ");
       
             thread3 obj0 = new thread3();
       
   
    }

}



   
