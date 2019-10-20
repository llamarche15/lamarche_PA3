import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class PartTwo
{
    public static int askQ(){
        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);

        System.out.println("How much is "+ rand_int1+  " times "+rand_int2+  "?");
        return rand_int1*rand_int2;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int userNum,num;
        num = askQ();
        while(true){
            userNum = sc.nextInt();
            Random rand = new Random();
            int rand_int = rand.nextInt(4)+1;
            if(userNum==num){

                switch(rand_int){
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }

                num = askQ();
            }else{
                switch(rand_int){
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
            }
        }
    }
}
