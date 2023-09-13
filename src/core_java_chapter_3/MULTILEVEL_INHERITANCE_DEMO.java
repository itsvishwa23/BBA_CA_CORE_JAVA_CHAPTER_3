/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

    //super class  
    class Student  
    {  
    int reg_no;  
    void putNo()  
    {  
    System.out.println("registration number= "+reg_no);  
    }  
    }  
    //intermediate sub class  
    class Marks extends Student  
    {  
    float marks;  
    void getMarks(float m)  
    {  
    marks=m;  
    }  
    void putMarks()  
    {  
    System.out.println("marks= "+marks);  
    }  
    }  
    //derived class  
    class Sports extends Marks  
    {  
    float score;  
    void getScore(double scr)  
    {  
    score=(float) scr;  
    }  
    void putScore()  
    {  
    System.out.println("score= "+score);  
    }  
    }  
    public class MULTILEVEL_INHERITANCE_DEMO   
    {  
    public static void main(String args[])  
    {  
    Sports ob=new Sports();
   // ob.getNo(111);
    ob.putNo();  
    ob.getMarks(78);  
    ob.putMarks();  
    ob.getScore(68.7);  
    ob.putScore();  
    
    }  
    }  