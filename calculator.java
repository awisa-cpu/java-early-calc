package com.company;
public class calculator{
    private int num1;
    private int num2;

    public void setNum1(int n){
        num1=n;
    }
    public void setNum2(int n2){
        num2=n2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }
    public int add(){
        return num1 + num2;
    }

    public int sub(){
        return num1 -num2;
    }

    public int mul(){
        return num1 * num2;
    }


    public int div(){
        return num1 / num2;
    }

    public static void opt(){
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
    }





}