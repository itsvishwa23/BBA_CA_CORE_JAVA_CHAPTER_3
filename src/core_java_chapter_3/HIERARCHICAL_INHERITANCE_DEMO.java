/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

    //parent class  
    class Student  
    {  
    public void methodStudent()  
    {  
    System.out.println("The method of the class Student invoked.");  
    }  
    }  
    class Science extends Student  
    {  
    public void methodScience()  
    {  
    System.out.println("The method of the class Science invoked.");  
    }  
    }  
    class Commerce extends Student  
    {  
    public void methodCommerce()  
    {  
    System.out.println("The method of the class Commerce invoked.");  
    }  
    }  
    class Arts extends Student  
    {  
    public void methodArts()  
    {  
    System.out.println("The method of the class Arts invoked.");  
    }  
    }  
    public class HIERARCHICAL_INHERITANCE_DEMO 
    {  
    public static void main(String args[])  
    {  
    Science sci = new Science();  
    Commerce comm = new Commerce();  
    Arts art = new Arts();  
    //all the sub classes can access the method of super class  
    sci.methodStudent();  
    comm.methodStudent();  
    art.methodStudent();  
    }  
    }   