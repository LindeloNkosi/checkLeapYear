/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkleapyear;

import java.util.Scanner;

/**
 *
 * @author linde
 */
public class CheckLeapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int year;
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please enter the year that you want to check if it is a leap year or not >>");
        year = scan.nextInt();
        
        if ((year%400==0)||((year%4==0)&&(year%100!=0))){
            System.out.println("The year " + year + " is a leap year");
           
           }
        else{
            System.out.println("This year " + " is notnot a leap year");
        }
    }
    
}
