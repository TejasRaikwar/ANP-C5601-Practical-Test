// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] marks = new int[10];
        String[] name = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<10 ; i++){
            System.out.println("Enter Name and marks :");
            name[i] = sc.next();
            marks[i] = sc.nextInt();
        }
        for(int i = 0 ; i<10;i++){
            switch(marks[i]/10){
                case 9 : System.out.println("Name : "+name[i]+" Grade : A");
                    break;
                case 8 : System.out.println("Name : "+name[i]+" Grade : B");
                         break;
                case 7 : System.out.println("Name : "+name[i]+"         Grade : C");
                        break;   
                case 6 : System.out.println("Name : "+name[i]+" Grade : D");
                        break;   
                case 5 : System.out.println("Name : "+name[i]+" Grade : E");
                break;
                default : System.out.println("Fail");break;
            }
        }
        
    }
}