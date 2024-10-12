package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        //'name' has private access in 'com. driver. RWOnly'
        //use gettr setter for accesing private members
        obj.setName("Himanshu");
        System.out.print(obj.getName());
    }
  
}