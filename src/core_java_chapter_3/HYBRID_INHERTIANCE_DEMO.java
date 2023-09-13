/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

    //parent class  
    class GrandFather  
    {  
    public void show()  
    {  
    System.out.println("I am grandfather.");  
    }  
    }  
    //inherits GrandFather properties  
    class Father extends GrandFather  
    {  
    @Override
    public void show()  
    {  
    System.out.println("I am father.");  
    }  
    }  
    //inherits Father properties  
    class Son extends Father  
    {  
    public void show()  
    {  
    System.out.println("I am son.");  
    }  
    }  
    //inherits Father properties  
    public class HYBRID_INHERTIANCE_DEMO extends Father  
    {  
    public void show()  
    {  
    System.out.println("I am a daughter.");  
    }  
    public static void main(String args[])  
    {  
    HYBRID_INHERTIANCE_DEMO obj = new HYBRID_INHERTIANCE_DEMO();  
    obj.show();  
    }  
    }  