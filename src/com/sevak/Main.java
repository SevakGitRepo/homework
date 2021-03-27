package com.sevak;

public class Main {
    public static void main(String[] args) {
        byte valueByte = 10;
        System.out.println("Hello I am byte ->"+valueByte+"  Min = "+Byte.MIN_VALUE +" Max = "+Byte.MAX_VALUE);
        System.out.println("---------------");
        short valueShort = 20;
        System.out.println("Hello I am short ->"+valueShort+"  Min = "+Short.MIN_VALUE +" Max = "+Short.MAX_VALUE);
        System.out.println("---------------");
        int valueInt = 30;
        System.out.println("Hello I am int ->"+valueInt+"  Min = "+Integer.MIN_VALUE +" Max = "+Integer.MAX_VALUE);
        System.out.println("---------------");
        long valueLong = 40L;
        System.out.println("Hello I am long ->"+valueLong+"  Min = "+Long.MIN_VALUE +" Max = "+Long.MAX_VALUE);
        System.out.println("---------------");

        float valueFloat = 50.5f;
        System.out.println("Hello I am float ->"+valueFloat+"  Min = "+Float.MIN_VALUE +" Max = "+Float.MAX_VALUE);
        System.out.println("---------------");
        double valueDouble = 60;
        System.out.println("Hello I am double ->"+valueDouble+"  Min = "+Double.MIN_VALUE +" Max = "+Double.MAX_VALUE);
        System.out.println("---------------");

        char symbol = '$';
        System.out.println("Hello I am char and I introduce symbol ->"+symbol);
        System.out.println("---------------");

        boolean badOrGood = true;
        System.out.println("Hello I am boolean and I can be true or false ->"+badOrGood);
        System.out.println("---------------");
    }
}
