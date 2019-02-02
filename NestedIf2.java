
package nestedif2;


public class NestedIf2 {

    
    public static void main(String[] args) {
        int age=60;
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
