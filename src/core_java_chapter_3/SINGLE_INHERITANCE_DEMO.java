/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

class Employee  
{    
float salary=34534*12;    
}    
public class SINGLE_INHERITANCE_DEMO extends Employee  
{   
float bonus=3000*6;  
public static void main(String args[])  
{  
SINGLE_INHERITANCE_DEMO obj=new SINGLE_INHERITANCE_DEMO();   
System.out.println("Total salary credited: "+obj.salary);    
System.out.println("Bonus of six months: "+obj.bonus);   
}    
} 