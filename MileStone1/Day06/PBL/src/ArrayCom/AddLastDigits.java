package ArrayCom;

import java.util.Scanner;

public class AddLastDigits {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();

        System.out.println("the sum of last digits of 2 numbers is: "+ ((input1%10)+(input2%10)));

    }
}
