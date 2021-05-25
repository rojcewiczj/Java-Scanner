package com.scanner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {
    public String Add = "Add";
    public String Subtract = "Subtract";
    public String Multiply = "Multiply";
    public String Divide = "Divide";
   
    public Menu(){
        System.out.println("Select an operation");
        System.out.println(Add + " " + Subtract + " " + Multiply + " " + Divide + " ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        System.out.println("great! whats the first Integer you want to work with?");
        int firstNum = scanner.nextInt();
        System.out.println("cool cool! now whats the second int?");
        int secondNum = scanner.nextInt();
        System.out.println("computing....");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
       }
        System.out.println("computing....");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
       }
        System.out.println("computing....");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
       }
       Mathy mathy = new Mathy(firstNum, secondNum, operation);
       System.out.println("The result of the operation is... " + mathy.result );
        
       scanner.close();
    }

}
