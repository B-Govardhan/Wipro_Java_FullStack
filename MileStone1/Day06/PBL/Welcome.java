package PBL;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hi! your name ");
        String name= sc.next();
        System.out.println("Welcome dear " +name);
    }
}