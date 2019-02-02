
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        if(age<50){
            System.out.println("You are Young");
        }else{
            System.out.println("You are Old");
            if(age>75){
                System.out.println("Your are really Old");
            }else{
                System.out.println("Don't worry you are not that really Old");
            }
        }
        
    }
    
}
