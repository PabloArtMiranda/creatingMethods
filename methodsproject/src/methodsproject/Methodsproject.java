/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsproject;

import java.util.Scanner;

/**
 * Group: C
 * @author Lucas,Douglas,Harvey,Jonatan,Pablo,Yan Kida.
 */
public class Methodsproject {
    static void helloworld(String name){
    //this method will only print hello world.
    System.out.println("Hello World and Hello "+ name);
    }
  /**
  * @author Douglas
  */
    static void addtwonumbers(int num1,int num2){    
     //this method will only add two numbers.
        int add = num1 + num2;
        
        System.out.println("Please, type two numbers for the operation: ");
        System.out.println(" Num1 + Num2 = " + add);
    }   
   /**
  * @author Yan
  */

    static void subtracttwonumbers(int num1,int num2){
    // this method will subtract two numbers.    
        int sub = num2 - num1;
        System.out.println("Num2 - Num1 =" + sub);
    }
    
    static void mutiplytwonumbers(int num1,int num2){
    // this method will multiply to numbers.    
        int mult = num1*num2;
        System.out.println("Num1 * Num2 ="+mult);
    }
    
    static void dividetwonumbers(int num1,int num2){
    //this mehod will divide the second number by the first.
        int div = num2/num1;
        System.out.println("Num2 / Num1 =" + div);
    }
    // @author Lucas
    static void checkage(int age){
    //this method will check age and print his status.
        if( age <= 18){System.out.println("School");}
        else if(age > 18 && age <= 25){System.out.println("College");}
        else if(age > 25 && age <= 66){System.out.println("Worker");}
        else if(age > 66 && age <= 100){System.out.println("Retired");} 
        else if(age < 0 || age > 100){System.out.print("Invalid");}
    }
    
    static void squarernumber(int num){
    //This code will geve the square. 
        int square = num * num;
        System.out.println("The square of " + num + " = " + square);
    }
    
    static void oddnumber(int num){
        if( num%2 == 0){
            System.out.println("The number " + num + " is odd ");
        }
        else{
            System.out.println("The number " + num + " is even");
        }
    }
    
    public static void main(String[] args) {
        //This Scanner is for Helloworld method.
        System.out.println(" Please tell your name ");
        Scanner br = new Scanner(System.in);
        String name = br.nextLine();
        helloworld(name);
        
        //This Scanner is for oddnumber.
        System.out.println(" Please insert a number ");
        Scanner bt = new Scanner(System.in);
        int num = bt.nextInt();
        oddnumber(num);
        
        addtwonumbers(2,2);
        subtracttwonumbers(2,10);
        mutiplytwonumbers(4,4);
        dividetwonumbers(2,10);
        checkage(20);
        squarernumber(20);
        
        
    }
    
}
