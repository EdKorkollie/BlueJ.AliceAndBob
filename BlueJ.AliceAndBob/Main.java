/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String userName = input.next();
        System.out.println(userName);
        if(userName.equals("Alice")){
            System.out.println("Hello" + userName + ", have a nice day.");
        }else if(userName.equals ("Bob")){
                System.out.println("Hello" + userName + ", have a nice day.");
            }
            else{
                System.out.println("Wrong Person!");
            }
            
            
            
            
        }
        
    

    }
