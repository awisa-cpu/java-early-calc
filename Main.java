package com.company;
/*
Note: make it a console program
1.calculator program should loop until the user chooses to exit the program
2. system accepts two inputs at a time
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        calculator user=new calculator();

       int num1,num2;
       double ans;
        System.out.println("Enter * to START/CONTINUE 0 to EXIT: ");
        int boom=input.nextInt();
        while(boom ==1){
            System.out.print("Number 1: ");
            num1=input.nextInt();
            System.out.print("Number 2: ");
            num2= input.nextInt();
            System.out.println();

            System.out.println("Select Option Below");
            user.opt();
            System.out.println();
            int option=input.nextInt();

            user.setNum1(num1);
            user.setNum2(num2);


            switch(option){
                case 1:
                    System.out.println(num1+" + "+num2+"="+user.add());
                    break;

                case 2:
                    System.out.println(num1+" - "+num2+"="+user.sub());
                    break;

                case 3:
                    System.out.println(num1+" * "+num2+"="+user.mul());
                    break;

                case 4:
                    System.out.println(num1+" / "+num2+"="+user.div());
                    break;

                default:
                    System.out.println("Wrong option");
            }

            System.out.println("Enter 1 to start/continue or 0 to exit");
            boom=input.nextInt();

        }



    }






}

