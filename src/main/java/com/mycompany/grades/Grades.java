/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Grades {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter reg_number:");
          int regNumber =scanner.nextInt();
        System.out.println("Enter  marks:");
          int marks=scanner.nextInt ();
          int marksmax=100;
          if (marks>=70 && marks<=marksmax){
               char grade= 'A';
               System.out.println(grade);
          }
          else if (marks>=60 && marks<=marksmax){
              char grade='B';
               System.out.println(grade);
              
     
          }     
           else if (marks>=50 && marks<=marksmax){
              char grade='C';
               System.out.println(grade);
              
     
          }     
           else if (marks>=40 && marks<=marksmax){
              char grade='D';
               System.out.println(grade);
              
     
          }     
           else if (marks>=0 && marks<=39){
              char grade='E';
               System.out.println(grade);
              
     
          } 
          else
               System.out.println("incorrect details");
          
    }
}
