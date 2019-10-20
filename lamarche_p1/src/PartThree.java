import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class PartThree
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
        while(true){
            int count = 10;
            int countR=0,countW=0;
            while(count>0){
                num = askQ();
                count--;
                userNum = sc.nextInt();
                if(userNum==num){
                    countR++;
                }else{
                    countW++;
                }
            }
            if((countR/10.0)<0.75){
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("");
            }else{
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("");
            }
        }
    }
}
